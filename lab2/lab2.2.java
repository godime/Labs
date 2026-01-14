public class Main {
    public static void main(String[] args) {
        int[] a = {(int)(Math.random()*199)-99, /* ... 20 элементов ... */};
        int[] b = processPositiveDiv3(a);
        System.out.print("Исходный: ");
        printArray(a);
        System.out.print("Положительные/3 + сортировка: ");
        printArray(b);
    }
    public static int[] processPositiveDiv3(int[] a) {
        int count = 0;
        for (int num : a) if (num > 0) count++;
        int[] b = new int[count];
        int idx = 0;
        for (int num : a) {
            if (num > 0) {
                b[idx++] = num / 3;
            }
        }
        selectionSort(b); // сортировка выбором
        return b;
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = temp;
        }
    }
}
