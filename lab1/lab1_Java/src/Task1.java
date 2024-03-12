import java.util.Scanner;

public class Task1 {
    public static void calculatePotentialEnergy() {
        Scanner scanner = new Scanner(System.in);

        float m = 0;
        boolean validInputM = false;
        while (!validInputM) {
            System.out.print("Введіть масу тіла (у кілограмах): ");
            if (scanner.hasNextFloat()) {
                m = scanner.nextFloat();
                validInputM = true;
            } else {
                System.out.println("Неправильний формат! Будь ласка, введіть число.");
                scanner.next(); // Очистка буфера вводу
            }
        }

        float h = 0;
        boolean validInputH = false;
        while (!validInputH) {
            System.out.print("Введіть висоту підняття (у метрах): ");
            if (scanner.hasNextFloat()) {
                h = scanner.nextFloat();
                validInputH = true;
            } else {
                System.out.println("Неправильний формат! Будь ласка, введіть число.");
                scanner.next(); // Очистка буфера вводу
            }
        }

        // Гравітаційне прискорення (приблизно 9.8 м/с^2)
        float g = 9.8f;
        float E = m * g * h;
        System.out.println("Потенціальна енергія тіла: " + E + " джоулів");
    }
}
