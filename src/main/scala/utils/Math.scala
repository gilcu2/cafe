package utils

object Math {

	def setDoubleDecimals(n: Double, decimals: Int = 2): Double =
		BigDecimal(n).setScale(decimals, BigDecimal.RoundingMode.HALF_UP).toDouble

}
