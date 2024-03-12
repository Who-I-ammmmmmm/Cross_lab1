public class Main {
    public static void main(String[] args) {
        System.out.println("Java\n====================================================\nTask1:");
        Task1.calculatePotentialEnergy();
        System.out.println("\n====================================================\nTask2:");
        int day = Task2.calculateDayOfWeek();
        System.out.println("Номер дня тижня для заданого дня року: " + day);
    }
}
