object Main extends App {
  println("Hello, Thomas 1234!")

  def mark(q1: Double, q2: Double, q3: Double) =
    Math.round(((q1 + q2 + q3) / 3) * 10 / 3)

  println(mark(10.0, 10, 10.55))

  def categorizeDayOfWeek(day:Int) = {
    if(day==1 || day==7){ println("weekend")}
    else { println("weekday")}
  }

  def calculateDiscount(price: Int) : Double = {
    price match {
      case price: Int  if price < 50 => 0
      case price: Int  if price > 50 && price < 100 => 10
      case price: Int  if price > 100 => 15
    }
  }

  def oddOrEven(number: Int) = {
    if(number % 2 == 0) println(number + " is even number")
    else println(number + " is odd number")
  }

  oddOrEven(2)
  oddOrEven(3)
  oddOrEven(33)
  oddOrEven(44)
  oddOrEven(10)

  categorizeDayOfWeek(1)
  categorizeDayOfWeek(3)
  categorizeDayOfWeek(4)
  categorizeDayOfWeek(7)
  categorizeDayOfWeek(2)

  //pattern matching
  def dayOfTheWeek(day: Int):String = {
    day match {
      case 1 => "Sunday"
      case 2 => "Monday"
      case 3 => "Tuesday"
      case 4 => "Wednesday"
      case 5 => "Thursday"
      case 6 => "Friday"
      case 7 => "Saturday"
    }
  }

  println(dayOfTheWeek(1))
  println(dayOfTheWeek(5))
  println(dayOfTheWeek(6))
  println(dayOfTheWeek(7))
  println(dayOfTheWeek(2))

  println("discount of 220: " + calculateDiscount(220))
  println("discount of 20: " + calculateDiscount(20))
  println("discount of 75: " + calculateDiscount(75))
}
