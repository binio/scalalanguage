object Main extends App {
  println("Hello, Thomas 1234!")

  def mark(q1: Double, q2: Double, q3: Double) =
    Math.round(((q1 + q2 + q3) / 3) * 10 / 3)

  println(mark(10.0, 10, 10.55))
}