import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    val numberLetters = word.length

    val message = " $numberLetters repetitions of the word $word: ${word.repeat(numberLetters)}"
    println(message)    
}
