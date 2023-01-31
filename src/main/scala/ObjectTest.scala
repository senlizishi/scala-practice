import pojo.Car

object ObjectTest {
  def main(args: Array[String]): Unit = {
    Car.drive
    Car.voice = "bibibi"
    Car.drive
  }
}
