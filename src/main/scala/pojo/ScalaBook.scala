package pojo

/**
 * 子类继承父累
 * Scala类层次结构的根是Any
 * 与 Java 区别在于类的整个主体是构造函数，所以定义类时与 Java 不太一样
 *
 * @author wxb
 */
class ScalaBook(bookName: String) extends Book(bookName) {

  /**
   * 方法重写，使用 override 关键字
   */
  override def showBookName(bookType: String): String = {
    "sub" + bookType + bookName
  }
}
