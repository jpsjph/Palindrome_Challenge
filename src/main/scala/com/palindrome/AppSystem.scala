package com.palindrome

object AppSystem {
  def main(args: Array[String]): Unit = {
    val input="sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop"
    val longestPalindromes=PalindromeHandler.getUniquePalindromes(input,3)
    PalindromeHandler.display(longestPalindromes)
  }
}
