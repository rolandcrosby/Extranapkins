import com.ibm.icu.text.RuleBasedNumberFormat

object Extranapkins {
  val formatter = new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT)
  def numWords(n: Int): String = formatter.format(n)
  def next(prev: String): String =
    "I’ve got " + numWords(prev.split("[ -]").length) + " words for you: " + prev
  def apply(n: Int) = Iterator.iterate("Fuck off")(next).drop(n).next
}
