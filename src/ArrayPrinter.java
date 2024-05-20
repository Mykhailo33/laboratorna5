public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }

    // Метод для виведення масиву
    public static void printArray(int[] array) {
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
