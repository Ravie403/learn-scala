println("Hello, Scala!")
val msg = "This is like const in JS."
var msg2 = "This is like let in JS."

def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

println(max(4,10))

def greet(): Unit = println("Hello World second!")

greet()