import pojo.{Book, ScalaBook, Student}

/**
 * 类
 *
 * @author wxb
 */
object CseClassTest {

  def main(args: Array[String]): Unit = {
    var student = Student("wxb")
    student.say()

    // case 样例类相比于普通类，其支持构造方法模式匹配，实现了深度匹配
    student match {
      case Student("wxb") => println("构造参数一致")
      case _ => println("构造参数不一致")
    }

    // 模式匹配 类型
    student match {
      case s:Student => s.say()
      case m:Map[_,_] => println("这是Map类型")
    }

  }
}
