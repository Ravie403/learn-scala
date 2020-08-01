// this is not a pure function
def printArgs(args: Array[String]): Unit = {
  args.foreach(println)
}

// pure function
def formatArgs(args: Array[String]) = args.mkString("\n")
val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")