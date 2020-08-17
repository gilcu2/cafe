package cafe

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CafeTest extends AnyFlatSpec with Matchers {

	"Cafe" should "compute the bill with liquids products" in {
		val items = List("Cola", "Coffe")

		val bill = Cafe.computeBill(items)

		bill should be(1.5)
	}

	"Cafe" should "compute the bill with solid products" in {
		val items = List("Cheese Sandwich", "Steak Sandwich")

		val bill = Cafe.computeBill(items)

		bill should be(6.5)
	}

	"Cafe" should "compute the bill with any products" in {
		val items = List("Cheese Sandwich", "Steak Sandwich", "Cola", "Steak Sandwich")

		val bill = Cafe.computeBill(items)

		bill should be(11.5)
	}

}
