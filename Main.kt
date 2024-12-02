fun fillArray(): Array<IntArray> {
    val array = Array(4) { IntArray(4) }
    var number = 1
    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = number
            number++
        }
    }
    return array
}

fun printPositiveElements(array: Array<IntArray>) {
    // Локальная функция для проверки на положительность
    fun isPositive(number: Int): Boolean {
        return number > 0
    }

    println("Положительные элементы массива:")
    for (i in array.indices) {
        for (j in array[i].indices) {
            if (isPositive(array[i][j])) {
                println(array[i][j]) // Выводим положительное число
            }
        }
    }
}

fun findEvenNumbers(array: Array<IntArray>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (i in array.indices) {
        for (j in array[i].indices) {
            if (array[i][j] % 2 == 0) {
                evenNumbers.add(array[i][j]) // Добавляем четное число в список
            }
        }
    }
    return evenNumbers
}

fun main() {
    // Создаем объект Registration
    val registration = Registration()
    registration.email = "example@mail.com"
    println("Email в верхнем регистре: ${registration.email}") // Вывод: EXAMPLE@MAIL.COM

    registration.password = "123" // Вывод: Длина пароля должна быть не менее 6 символов.
    registration.password = "123456" // Устанавливает пароль

    // Заполняем массив числами от 1 до 16
    val array = fillArray()

    // Выводим положительные элементы массива
    printPositiveElements(array)

    // Находим четные числа в массиве
    val evenNumbers = findEvenNumbers(array)
    println("Четные числа в массиве: $evenNumbers") // Вывод четных чисел
}