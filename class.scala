class CheckSumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = { sum += b }

  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc = new CheckSumAccumulator
val csa = new CheckSumAccumulator

acc.add(4)
println(acc.checksum())
println(csa.checksum())