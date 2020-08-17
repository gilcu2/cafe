package cafe

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CafeTest extends AnyFlatSpec with Matchers {

	"Cafe" should "compute the bill" in {
		val items = List("Cola", "Coffe")

		val bill = Cafe.computeBill(items)

		bill should be(1.5)
	}

}
