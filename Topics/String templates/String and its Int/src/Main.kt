import java.util.Scanner
fun main() {
    // write here
    val scanner = Scanner(System.`in`)
    
    val number = scanner.next() 
    val result = number.toInt() / 2

    val message = "The obtained value is $number and its Int representation after division by 2 is $result"
    println(message)
}
