import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    var sum = 0

    var inputs = 0
    do {
        val number = scanner.nextInt()
        sum += number
        inputs++
    } while (count > inputs)

    println(sum)
}
