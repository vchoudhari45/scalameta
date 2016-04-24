package scala.meta
package internal
package prettyprinters

import scala.meta.prettyprinters._
import Show.{ sequence => s, repeat => r, indent => i, newline => n }
import scala.meta.tokens._

object TokenStructure {
  def apply[T <: Token]: Structure[T] = {
    Structure(x => {
      val prefix = (x: Token) match {
        case x: Token.Tab => "\\t"
        case x: Token.CR => "\\r"
        case x: Token.LF => "\\n"
        case x: Token.FF => "\\f"
        case x: Token.SignificantNewline => "\\n\\n"
        case x: Token.BOF => "BOF"
        case x: Token.EOF => "EOF"
        case x => x.code
      }
      s(prefix, " [", x.start.toString, "..", x.end.toString, ")")
    })
  }
}
