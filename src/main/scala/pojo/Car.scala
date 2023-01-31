package pojo

/**
 * Scala 对象
 *
 * Java 中可以定义静态属性（static）方法等实现单例的效果，而 scala 比 java 更面向对象的一点是 Scala 类不允许有静态成员。Scala 提供了单例对象
 *
 * @author wxb
 */
object Car {
  var voice: String = "dududu"

  def drive {
    println(voice)
  }
}
