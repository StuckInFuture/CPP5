package string_product


object StringProduct {


  def entrySymbol(currentString: String, symbol: Char): Int = {
    currentString.toSeq.filter(_ == symbol).length
  }

  def entrySymbolREC(currentString: String, symbol: Char): Int = {

    @scala.annotation.tailrec
    def loop(currentString: String, symbol: Char, id: Int, number: Int): Int = {
      if (id < currentString.length())
        if (currentString.charAt(id) == symbol)  loop(currentString, symbol, id + 1, number + 1)
        else loop(currentString, symbol, id + 1, number)
      else number
    }

    loop(currentString, symbol, 0, 0)
  }

}