package cafe

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CafeTest extends AnyFlatSpec with Matchers {

	"Cafe" should "compute the bill with liquids products" in {
		val items = List("Cola", "Coffee")

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

	"Cafe" should "compute the bill without taking into account products outside the menu" in {
		val items = List("Cola", "Coffee", "Hot dog")

		val bill = Cafe.computeBill(items)

		bill should be(1.5)
	}

	"Cafe" should "compute the bill with liquids products and service charge" in {
		val items = List("Cola", "Coffee")

		val bill = Cafe.computeBillAndServiceCharge(items)

		bill should be(1.5)
	}

	"Cafe" should "compute the bill with cold products and service charge" in {
		val items = List("Cheese Sandwich", "Coffee")

		val bill = Cafe.computeBillAndServiceCharge(items)

		bill should be(3.3)
	}

	"Cafe" should "compute the bill with hot products and service charge" in {
		val items = List("Steak Sandwich", "Coffee")

		val bill = Cafe.computeBillAndServiceCharge(items)

		bill should be(6.6)
	}

}
