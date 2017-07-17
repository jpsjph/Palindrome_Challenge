import com.palindrome.{Palindrome, PalindromeHandler}
import org.scalatest.{FlatSpec, Matchers}

class PalindromeHandlerTest extends FlatSpec with Matchers {

  behavior of "PalindromeHandler Test"

  it should "return top 3 longest unique palindrome in given word" in {
    val word = "satorarepotenetoperarota"
    val excepted = IndexedSeq(Palindrome("atorarepotenetoperarota", 1), Palindrome("torarepotenetoperarot", 2), Palindrome("orarepotenetoperaro", 3))
    val sut = PalindromeHandler.getUniquePalindromes(word, 3)
    sut should equal(excepted)
  }

}
