package com.palindrome

case class Palindrome(text: String, beginIndex: Int){
  val size: Int = text.size
}
object Palindrome {
   implicit def ordering[A <: Palindrome]: Ordering[A] = Ordering.by(_.size)

  def isPalindrome(text: String):Boolean = text.nonEmpty && text.toLowerCase == text.reverse.toLowerCase()

  def listPalindromes(str: String, minLength: Int = 1): IndexedSeq[Palindrome] = {
    if (str.size < minLength) IndexedSeq.empty
    else {
      val palindromes = for {beginIndex <- (0 to str.size)
                             endIndex <- (beginIndex to str.size)
                             subString = str.substring(beginIndex, endIndex)
                             if subString.size >= minLength && isPalindrome(subString)
      } yield Palindrome(subString, beginIndex)
      palindromes
    }
  }

  def sort[A <: Palindrome](l: IndexedSeq[A])(implicit ordering: Ordering[A]): IndexedSeq[A] = l.sortBy(s => s)(ordering)
}