val oneTwoThree = List(1, 2, 3)

val oneTwo = List(1, 2)
val threeFour = 3 :: Nil.::(4)

val oneToFour = oneTwo ::: threeFour

println(oneTwoThree)
println(oneToFour)

val thrill = "Will" :: "fill" :: "until" :: Nil

println(thrill(2))
println(thrill.drop(2))
println(thrill.dropRight(2))
println(thrill.count(s => s.length == 4))
println(thrill.contains("until"))
println(thrill.filter(s => s.length == 4))
println(thrill.filterNot(s => s.length == 4))
println(thrill.forall(s => s.endsWith("l")))
thrill.foreach(print)
println()
println(thrill.head, thrill.last)
println(thrill.isEmpty, thrill.length)
println(thrill.map(s => s + "y"))
println(thrill.mkString(", "))
println(thrill.reverse)
println(thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))
println(thrill.init)
println(thrill.tail)
