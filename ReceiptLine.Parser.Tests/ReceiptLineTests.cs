using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Shouldly;
using Xunit;

namespace ReceiptLine.Parser.Tests
{
    public class ReceiptLineTests
    {
        [Theory]
        [MemberData(nameof(TestData), MemberType = typeof(ReceiptLineTests))]
        public void ParseFileTest(string name, Stream stream)
        {
            var errorListener = new ErrorListener(name);
            var streamLength = (int)stream.Length;
            ReceiptLineParser.FileContext content;

            using (stream)
            using (var fileStream = new StreamReader(stream, Encoding.Default, false))
            {
                var inputStream = new AntlrInputStream(fileStream);

                var lexer = new ReceiptLineLexer(inputStream);
                var commonTokenStream = new CommonTokenStream(lexer);
                var parser = new ReceiptLineParser(commonTokenStream);

                parser.RemoveErrorListeners();
                parser.AddErrorListener(errorListener);

                content = parser.file();
            }

            errorListener.SyntaxErrors.ShouldBeEmpty($"Syntax errors:{Environment.NewLine}{string.Join(Environment.NewLine, errorListener.SyntaxErrors)}");
            content.exception.ShouldBeNull();
            content.Start.StartIndex.ShouldBe(0);
            content.Stop.StopIndex.ShouldBe(streamLength - 1);
        }

        public static IEnumerable<object[]> TestData
        {
            get
            {
                var asm = typeof(ReceiptLineTests).Assembly;
                foreach (var resourceName in asm.GetManifestResourceNames())
                {
                    yield return new object[] { resourceName, asm.GetManifestResourceStream(resourceName) };
                }
            }
        }
    }
}
