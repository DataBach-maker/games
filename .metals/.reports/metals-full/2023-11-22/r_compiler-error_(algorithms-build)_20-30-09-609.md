file://<WORKSPACE>/build.sbt
### java.lang.AssertionError: assertion failed: file://<WORKSPACE>/build.sbt: 692 >= 692

occurred in the presentation compiler.

action parameters:
offset: 692
uri: file://<WORKSPACE>/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin
@@
```



#### Error stacktrace:

```
scala.reflect.internal.util.SourceFile.position(SourceFile.scala:33)
	scala.tools.nsc.CompilationUnits$CompilationUnit.position(CompilationUnits.scala:133)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:26)
	scala.meta.internal.pc.PcDocumentHighlightProvider.<init>(PcDocumentHighlightProvider.scala:11)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$documentHighlight$1(ScalaPresentationCompiler.scala:340)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: file://<WORKSPACE>/build.sbt: 692 >= 692