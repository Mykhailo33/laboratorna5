import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Створення об'єкту Scanner для отримання введених даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення довжини і ширини прямокутника
        System.out.println("Введіть довжину прямокутника:");
        double length = scanner.nextDouble();
        System.out.println("Введіть ширину прямокутника:");
        double width = scanner.nextDouble();

        // Виклик метода для обчислення площі прямокутника та виведення результату
        double area = calculateRectangleArea(length, width);
        System.out.println("Площа прямокутника: " + area);

        // Закриття об'єкту Scanner
        scanner.close();
    }

    // Метод для обчислення площі прямокутника
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
