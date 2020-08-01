val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings.update(2, "Scala! \n")

for (i <- 0 to 2)
  print(greetStrings(i))

for( i <- 0.to(2))
  print(greetStrings.apply(i))

val numNames = Array.apply("Zero", "One", "Two")