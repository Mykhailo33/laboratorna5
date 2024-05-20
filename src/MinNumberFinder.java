public class MinNumberFinder {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 9, 1};
        int min = findMin(array);
        System.out.println("Найменше число: " + min);
    }

    // Метод для знаходження найменшого числа
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
