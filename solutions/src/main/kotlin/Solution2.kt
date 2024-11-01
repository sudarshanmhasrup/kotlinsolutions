// Program to convert minutes to seconds
private fun convertMinutesToSeconds(minutes: Int) = minutes * 60

private fun getUserInput(): Int {

    var isValidInput = false
    var result = 0

    do {
        try {
            val input = readln().toInt()
            isValidInput = true
            result = input
        } catch (exception: NumberFormatException) {
            println("Please enter minutes in integer format only!")
        }
    } while(!isValidInput)

    return result
}

fun main() {

    print("Enter minutes in digit: ")
    val minutes = getUserInput()
    val result = convertMinutesToSeconds(
        minutes = minutes
    )

    println("$minutes minutes in seconds are: $result")
}