import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object App {
  def main(args:Array[String]): Unit = {
    println("Task #1")
    var s = "Hello, Scala!"
    println("i: " + s)
    s = s.toLowerCase
    println("ii: " + s)
    s = s.take(12)
    println("iii: " + s)
    s = s + " and goodbye python!"
    println("iiii: " + s)
    println("\nTask #3")
    print("Введите годовой доход: ")
    var annual_income = readLine().toDouble
    print("Введите процент премии: ")
    val percentage_premium = readLine().toDouble
    print("Введите сумму компенсации за питание: ")
    val compensation_meals = readLine().toDouble
    annual_income-=compensation_meals
    var salary = (annual_income  - annual_income*percentage_premium/100 - annual_income*0.13)/12
    println(s"Месячный оклад составляет $salary")
    var firstList=ListBuffer(100.0, 75.0, 190.0, 200.0, 300.34, 500.45)
    val averageSalary = firstList.sum / firstList.size
    println(s"Средний оклад сотрудников отдела : $averageSalary")
    val deviation = (salary - averageSalary)*100/averageSalary
    println(s"Отклонение от среднего оклада всего отдела составляет $deviation%")
    firstList = firstList:+salary
    println(firstList)
    val maxSalary = firstList.max
    println(s"Самая высокая зарплата в отделе составляет $maxSalary")
    val minSalary = firstList.min
    println(s"Самая высокая зарплата в отделе составляет $minSalary")
    firstList = firstList:+350.0
    firstList = firstList:+90.0
    println(s"Добавлены 2 оклада новых сотрудников $firstList")
    var firstList_sorted = firstList.sorted
    println(s"Отсортированный список окладов $firstList_sorted")
    val ind = firstList_sorted.indexWhere(_>130)
    firstList_sorted.insert(ind,130)
    println(s"В отсортированный список добавлен оклад 130 руб. $firstList_sorted")
    print("Введите оклад middle: ")
    val middleSalary = readLine().toDouble
    println(s"Номера сотрудников, которые попадают под категорию middle в неотсортированном списке")
    var number = 1;
    for (sotr <- firstList)
      {
        if (sotr >= middleSalary)  println(s"Middle-cотрудник под №$number с окладом $sotr")
        number+= 1
      }
    firstList = firstList.map((x) => x*1.07)
    println("Оклады после повышения на 7%")
    println(firstList)



  }
}
