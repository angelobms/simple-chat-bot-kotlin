fun main() {
    var number = readln().toInt()
    if (number%2 == 0) {
        number += 2
        println(number)
    } else{
        number = number + number%2 
        println(number)
    }
}
