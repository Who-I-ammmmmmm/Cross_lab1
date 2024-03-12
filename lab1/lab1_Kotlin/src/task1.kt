import java.util.Scanner

fun calculatePotentialEnergy() {
    val scanner = Scanner(System.`in`)

    var m = 0.0f
    var validInputM = false
    while (!validInputM) {
        print("Введіть масу тіла (у кілограмах): ")
        if (scanner.hasNextFloat()) {
            m = scanner.nextFloat()
            validInputM = true
        } else {
            println("Неправильний формат! Будь ласка, введіть число.")
            scanner.next() // Очистка буфера вводу
        }
    }

    var h = 0.0f
    var validInputH = false
    while (!validInputH) {
        print("Введіть висоту підняття (у метрах): ")
        if (scanner.hasNextFloat()) {
            h = scanner.nextFloat()
            validInputH = true
        } else {
            println("Неправильний формат! Будь ласка, введіть число.")
            scanner.next() // Очистка буфера вводу
        }
    }

    // Гравітаційне прискорення (приблизно 9.8 м/с^2)
    val g = 9.8f
    val E = m * g * h
    println("Потенціальна енергія тіла: $E джоулів")
}

