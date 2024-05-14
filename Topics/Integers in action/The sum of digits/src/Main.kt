fun main() {
    val number = readln().toInt()
    val digit1 = number / 100 % 10
    val digit2 = number / 10 % 10
    val digit3 = number % 10
    val sum = digit1 + digit2 + digit3
    println(sum)
}
