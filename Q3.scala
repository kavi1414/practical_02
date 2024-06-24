object Q3 {
  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30

    println(s"Take home salary for : Rs " +{takeHome(normalHours, otHours)})
  }

  def wage(hours: Int): Int = hours * 250

  def ot(hours: Int): Int = hours * 85

  def income(h1: Int, h2: Int): Int = wage(h1) + ot(h2)

  def tax(income: Int): Double = income * 0.12

  def takeHome(h1: Int, h2: Int): Double = {
    val totalIncome = income(h1, h2)
    totalIncome - tax(totalIncome)
  }
}


