using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;

namespace ReceiptLine.Parser.Tests
{
    public class ErrorListener : BaseErrorListener
    {
        private readonly List<string> _syntaxErrors;
        private readonly string _filename;
        public IReadOnlyList<string> SyntaxErrors => _syntaxErrors;

        public ErrorListener(string filename)
        {
            _filename = filename;
            _syntaxErrors = new List<string>();
        }

        public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            var error = $"{_filename}({line}:{charPositionInLine}) {e?.Message}: {msg}";
            _syntaxErrors.Add(error);
        }
    }
}