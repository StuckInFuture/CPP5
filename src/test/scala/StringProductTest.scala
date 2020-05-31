package string_product_test


import org.scalatest.FunSuite
import string_product.StringProduct


class StringProductTest extends FunSuite {
    test("StringProduct.entrySymbol"){
      assert(StringProduct.entrySymbol("abacaba", 'a') == 4)
      assert(StringProduct.entrySymbol("     ", ' ') == 5)
      assert(StringProduct.entrySymbol("lllI1lll", 'I') == 1)
    }
    test("StringProduct.entrySymbolREC"){
      assert(StringProduct.entrySymbolREC("abacaba", 'a') == 4)
      assert(StringProduct.entrySymbolREC("     ", ' ') == 5)
      assert(StringProduct.entrySymbolREC("ooo oo  o  o", 'o') == 7)
    }

}
