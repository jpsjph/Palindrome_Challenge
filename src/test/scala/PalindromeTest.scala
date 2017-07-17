import com.palindrome.Palindrome
import org.scalatest.{FlatSpec, Matchers}

class PalindromeTest extends FlatSpec with Matchers{

behavior of "Palindrome Test"

  it should "return true when the word is palindrome" in{
    val word="ata"
    val sut=Palindrome.isPalindrome(word)
    sut should equal(true)
  }

  it should "return false when the word is palindrome" in{
    val word="hello"
    val sut=Palindrome.isPalindrome(word)
    sut should equal(false)
  }

  it should "find all unique palindromes in given word" in{
    val word="satorarepotenetoperarota"
    val sut=Palindrome.listPalindromes(word,5)
    sut.size should equal(10)
  }
  it should "sort by the length of the text" in{
    val palindromes=IndexedSeq(Palindrome("level",4),Palindrome("Repaper",2),Palindrome("wow",8))
    val sut=Palindrome.sort(palindromes)
    sut.head.text should equal("wow")
  }
}
