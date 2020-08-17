package cafe

object Cafe {

	def computeBill(items: List[String]): Double = {
		items.map(prices(_)).sum
	}

	val prices = Map(
		"Cola" -> 0.5,
		"Coffe" -> 1.0,
		"Cheese Sandwich" -> 2.0,
		"Steak Sandwich" -> 4.5
	)

}
