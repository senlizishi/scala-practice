import pojo.{Book, ScalaBook}

/**
 * 类
 *
 * @author wxb
 */
object ClassTest {

  def main(args: Array[String]): Unit = {
    val book = new Book("book")
    println(book.showBookName(""))

    val subBook = new ScalaBook("scala")
    println(subBook.showBookName("-"))

  }
}
