package cafe

object Cafe {

	val prices = Map(
		"Cola" -> 0.5,
		"Coffee" -> 1.0,
		"Cheese Sandwich" -> 2.0,
		"Steak Sandwich" -> 4.5
	)

	val food = Set("Cheese Sandwich", "Steak Sandwich")
	val hotFood = Set("Steak Sandwich")

	def computeBillAndServiceCharge(items: List[String]): Double = {
		val cost = computeBill(items)
		val charge = if (items.exists(hotFood.contains))
			cost * 0.2
		else if (items.exists(food.contains))
			cost * 0.1
		else
			0.0
		cost + charge
	}

	def computeBill(items: List[String]): Double = {
		items.map(prices.getOrElse(_, 0.0)).sum
	}

}
