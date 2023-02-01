package pojo

/**
 * 父类
 * 在Java中，类有构造方法，构造方法可以接收参数；而在Scala中，类可以直接接收参数，且Scala的表示法更为精简（类定义体内可以直接使用类参数，不需要定义字段并编写将构造方法参数赋值给字段的代码）。这样可以大幅度节省样板代码，尤其是对小型的类而言。
 *
 * Scala编译器会将你在类定义体中给出的非字段或方法定义的代码编译进类的主构造方法中
 *
 * case class （样例类） 和 Class 最主要的区别在于其可以用于模式匹配，官方建议在需要进行模式匹配时才使用
 * 参考文档 https://baijiahao.baidu.com/s?id=1729984065643162726&wfr=spider&for=pc
 * @author wxb
 */
class Book(var bookName: String) {

  /**
   * 方法
   */
  def showBookName(bookType: String): String = {
    bookType + bookName
  }

}


