import java.io.{File, PrintWriter}
import java.util.Date

// loan pattern
def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("date.txt")
withPrintWriter(file) {
  writer => writer.println(new Date())
}

var assertionEnabled = true
def myNameAssert(predicate: => Boolean): Unit =
  if (assertionEnabled && !predicate)
    throw new AssertionError