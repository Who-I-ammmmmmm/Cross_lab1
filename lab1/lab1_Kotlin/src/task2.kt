import java.util.Scanner

    fun calculateDayOfWeek(): Int {
        val scanner = Scanner(System.`in`)
        var k = 0
        var validInput = false

        while (!validInput) {
            print("Введіть номер дня року (від 1 до 365): ")
            if (scanner.hasNextInt()) {
                k = scanner.nextInt()
                if (k in 1..365) {
                    validInput = true
                } else {
                    println("Некоректне значення. Введіть номер дня року (від 1 до 365): ")
                }
            } else {
                println("Некоректне значення. Введіть число.")
                scanner.next() // Очистка буфера вводу
            }
        }

        val startDay = (5 + k - 13) % 7 // 13 січня - п'ятниця (п'ятниця - 5)
        return startDay
    }

