fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    val hours = (totalSeconds / 3600) % 24 - 3
    val minutes = (totalSeconds % 3600) / 60
    val seconds = (totalSeconds % 3600) % 60
    println("$hours:$minutes:$seconds")
}
