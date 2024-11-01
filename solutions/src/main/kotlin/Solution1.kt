// Program to add two given numbers using a function
fun calculateSum(number1: Int, number2: Int) = number1 + number2

fun getUserInput(): Int {

    var isValidInput = false
    var result = 0

    do {
        try {
            val input = readln().toInt()
            isValidInput = true
            result = input
        } catch (exception: NumberFormatException) {
            println("Please enter the input in integer format.")
            isValidInput = false
        }
    } while (!isValidInput)

    return result
}

fun main() {

    print("Enter the first number: ")
    val input1 = getUserInput()
    print("Enter the second number: ")
    val input2 = getUserInput()

    val result = calculateSum(
        number1 = input1,
        number2 = input2
    )

    println("The sum of $input1 and $input2 is: $result")
}