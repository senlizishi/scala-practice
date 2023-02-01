/**
 * 控制结构
 *
 * @author wxb
 */
object ControlTest {

  def main(args: Array[String]): Unit = {
    // IF 基础判断
    var c: Int = 0
    if (c == 0)
      c = 1
    else
      c = 2
    println(c)

    // FOR 循环
    val dogBreeds: List[String] = List("D", "Y", "D", "S", "G", "P")
    for (dog <- dogBreeds if dog == "D" || dog == "Y") {
      println(dog)
    }

    // WHILE 循环
    while (c < 5) {
      c += 1
      println("c 为" + c)
    }

    // 模式匹配，类似于 Java 中的 switch, _ 是通配符
    c match {
      case 5 => println("A")
      case _ => println("B")
    }
  }


}
