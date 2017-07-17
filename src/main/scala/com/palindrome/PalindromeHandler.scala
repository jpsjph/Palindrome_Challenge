package com.palindrome

object PalindromeHandler {
  def getUniquePalindromes(text: String, num: Int): IndexedSeq[Palindrome] = {
    val lists = Palindrome.listPalindromes(text)
    val sorted = Palindrome.sort(lists)(Ordering[Palindrome].reverse)
    sorted.take(num)
  }
  def display(inputs:IndexedSeq[Palindrome]):Unit={
    inputs.foreach(s =>println( s"Text: ${s.text}, Index: ${s.beginIndex}, Length: ${s.size} "))
  }
}
