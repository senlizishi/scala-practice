/**
 * 变量
 * @author wxb
 */
object VarTest {
  def main(args: Array[String]): Unit = {
    // var 是变量，可以被重新赋值
    var a = 1
    a = 2
    print(a)

    // val 类似于 Java 中的 final，不可被重新赋值
    val b = 1
    // b = 2
    print(b)
  }
}
