/**
 * 函数与函数式编程（函数常量，匿名函数）
 *
 * @author wxb
 */
object FunctionTest {

  /**
   * 加函数
   *
   * @param a 第一个参数
   * @param b 第二个参数
   * @return 返回相加结果
   */
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    // 常规函数
    print(add(1, 2))

    // 将函数常量（匿名函数）分配给一个变量
    val add2 = (a: Int, b: Int) => a + b
    print(add2(1, 2))
  }
}
