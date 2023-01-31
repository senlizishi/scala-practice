/**
 * 变量
 * 字符串插值
 * @author wxb
 */
object VarTest {

  /**
   * 要运行一个Scala程序，必须提供一个独立对象的名称，而这个独立对象需要包含一个main方法，该方法接收一个Array[String]作为参数，结果类型为Unit。任何带有满足正确签名的main方法的独立对象都能被用作应用程序的入口
   * @param args
   */
  def main(args: Array[String]): Unit = {
    // var 是变量，可以被重新赋值
    var a = 1
    a = 2
    print(a)

    // val 类似于 Java 中的 final，不可被重新赋值
    val b = 1
    // b = 2
    print(b)

    // 字符串插值, s字符串插值器会对内嵌的每个表达式求值，对求值结果调用toString方法，替换掉字面量中的那些表达式。其他字符串插值器可自定义
    val name = "wxb"
    print(s"Hello  $name")
  }
}
