package utils

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MathTest extends AnyFlatSpec with Matchers {

	"Math" should "set the decimal precision of a Double" in {

		val n = 3.1416
		val with2Decimals = Math.setDoubleDecimals(n, decimals = 2)
		with2Decimals should be(3.14)
	}

}
