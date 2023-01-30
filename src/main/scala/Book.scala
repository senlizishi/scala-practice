/**
 * 父类
 * 与 Java 的区别在于 Scala中，类的整个主体是构造函数
 * 造函数参数声明为 val ,Scala只为它生成一个getter方法, 如果为 var 则会生成
 *
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


