package pojo

/**
 * 样例类
 *
 * @author wxb
 *
 *         样例类相比于普通类的区别
 *         1、它会添加一个与类同名的工厂方法，这样意味着可以 Student("A") 而不用 new Student('A') 来构建对象
 *         2、属性根据 val/var 默认加上 getter/setter
 *         3、实现了 toString、hashCode和equals
 *         4、最重要的是 模式匹配
 */
case class Student(name: String) {

  def say(): Unit = {
    println("我是" + name)
  }
}
