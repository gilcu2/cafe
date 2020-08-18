import cafe.Cafe

object CafeMain {

	def main(argc: Array[String]): Unit = {

		val bill = Cafe.computeBillAndServiceCharge(argc.toList)
		println("The bill for buy:")
		argc.foreach(s => print(s"$s, "))
		println(s"\nIs: $bill")
	}

}
