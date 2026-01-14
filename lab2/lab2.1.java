public class Main {
    public static void main(String[] args) {
        final int N = 20; // размер исходного массива
        final int K = 5;  // количество максимальных элементов
        int[] arr = new int[N];
        // Заполнение случайными числами
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 199) - 99;
        }
        // Находим K максимальных элементов
        int[] maxElements = findMaxKElements(arr, K);
        System.out.print("Исходный массив: ");
        printArray(arr);
        System.out.print("5 максимальных: ");
        printArray(maxElements);
    }
    public static int[] findMaxKElements(int[] arr, int k) {
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, Math.min(k, arr.length));
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > result[i]) {
                    result[i] = arr[j];
                }
            }
        }
        return result;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.printf("%4d ", num);
        }
        System.out.println();
    }
}
