object Q2{
  
    def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 0.0F

    b -=1
    val exprA = b*a + c*d
    d -=1
    val exprB = a
    a +=1
    val exprC = -2 * (g-k) + c
    val exprD = c
    c +=1
    c +=1
    val exprF = c*a
    a +=1

    println(exprA)
    println(exprB)
    println(exprC)
    println(exprD)
    println(exprF)
   
  }
  

  
}
