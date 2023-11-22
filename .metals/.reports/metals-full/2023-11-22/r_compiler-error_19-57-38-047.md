file://<WORKSPACE>/puzzle/src/main/scala/Search.scala
### file%3A%2F%2F%2Fhome%2Fariane%2FAriane%2FDevelopment%2FScala-Projects%2Falgorithms%2Fpuzzle%2Fsrc%2Fmain%2Fscala%2FSearch.scala:1: error: identifier expected but extends found
object  extends App {
        ^

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/puzzle/src/main/scala/Search.scala
text:
```scala
object  extends App {

}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.syntaxErrorExpected(ScalametaParser.scala:367)
	scala.meta.internal.parsers.ScalametaParser.name(ScalametaParser.scala:1146)
	scala.meta.internal.parsers.ScalametaParser.termName(ScalametaParser.scala:1149)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$objectDef$1(ScalametaParser.scala:3930)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:349)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:354)
	scala.meta.internal.parsers.ScalametaParser.objectDef(ScalametaParser.scala:3928)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3805)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3786)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4378)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4366)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:206)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:205)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4357)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4594)
	scala.Option.getOrElse(Option.scala:201)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4594)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:300)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:346)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4550)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4543)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:300)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:346)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4543)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4548)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:127)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:124)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:51)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:46)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:124)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:356)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fariane%2FAriane%2FDevelopment%2FScala-Projects%2Falgorithms%2Fpuzzle%2Fsrc%2Fmain%2Fscala%2FSearch.scala:1: error: identifier expected but extends found
object  extends App {
        ^