package fix

import scala.meta.Type
import scalafix.Patch
import scalafix.v1.SyntacticDocument
import scalafix.v1.SyntacticRule
import scala.meta.tokens.Token

class WildcardTypeRewrite extends SyntacticRule("WildcardTypeRewrite") {
  override def fix(implicit doc: SyntacticDocument): Patch = {
    doc.tree.collect { case t: Type.Wildcard =>
      t.tokens.find(_.is[Token.Underscore]).map(x => Patch.replaceToken(x, "?")).asPatch
    }.asPatch
  }
}
