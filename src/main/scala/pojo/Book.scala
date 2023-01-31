package pojo

/**
 * 父类
 * 与 Java 的区别在于 Scala中，类的整个主体是构造函数
 * 造函数参数声明为 val ,Scala只为它生成一个getter方法, 如果为 var 则会生成
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


