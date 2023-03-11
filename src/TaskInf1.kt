import java.util.*

class TaskInf1 {

    fun task1(a: Int, b: Int): Int {
        return if (a < b) {
            a + b - 1
        } else if (a > b) {
            a + b - 1
        } else {
            0
        }
    }



    fun main(args: Array<String>) {
        val qwerty = Scanner(System.`in`)
        val num1 = qwerty.nextInt()
        val num2 = qwerty.nextInt()
        println(task1(num1, num2))
    }
}