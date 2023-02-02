package pojo

/**
 * 父类
 * 在Java中，类有构造方法，构造方法可以接收参数；而在Scala中，类可以直接接收参数，且Scala的表示法更为精简（类定义体内可以直接使用类参数，不需要定义字段并编写将构造方法参数赋值给字段的代码）。这样可以大幅度节省样板代码，尤其是对小型的类而言。
 * Scala编译器会将你在类定义体中给出的非字段或方法定义的代码编译进类的主构造方法中
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


