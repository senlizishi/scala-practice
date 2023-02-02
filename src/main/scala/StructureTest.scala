/**
 * 数据结构
 *
 * @author wxb
 */

import java.util.HashMap;

object StructureTest {

  def main(args: Array[String]): Unit = {
    // 不可变列表
    val colors = List("red", "blue", "green")
    println(colors.head)

    // 数组
    val ints = Array(1, 2, 3, 4, 5)
    println(ints(2))

    // Scala 中使用 Java 的数据结构
    var map = new HashMap[String,String]()
    map.put("a","b")
    println(map.get("a"))

  }
}
