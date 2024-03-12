import java.util.Scanner;

public class Task2 {
    public static int calculateDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введіть номер дня року (від 1 до 365): ");
            if (scanner.hasNextInt()) {
                k = scanner.nextInt();
                if (k >= 1 && k <= 365) {
                    validInput = true;
                } else {
                    System.out.println("Некоректне значення. Введіть номер дня року (від 1 до 365): ");
                }
            } else {
                System.out.println("Некоректне значення. Введіть число.");
                scanner.next(); // Очистка буфера вводу
            }
        }

        int startDay = (5 + k - 13) % 7; // 13 січня - п'ятниця (п'ятниця - 5)
        return startDay;
    }
}
