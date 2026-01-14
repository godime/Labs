public class Main {
    public static void main(String[] args) {
        int n = 5; // размер матрицы n×n
        int[][] matrix = new int[n][n];
        // Заполнение случайными числами от -99 до 99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 199) - 99;
            }
        }
        System.out.println("Матрица:");// Вывод матрицы
        printMatrix(matrix);
        int[] minColIndices = findMinColIndices(matrix);// Вектор B с номерами минимальных элементов в каждом столбце
        System.out.print("Номера мин. элементов по столбцам: ");
        printArray(minColIndices);
    }
    public static int[] findMinColIndices(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n];
        for (int col = 0; col < n; col++) {
            int minVal = matrix[0][col];
            int minIndex = 0;
            for (int row = 1; row < n; row++) {
                if (matrix[row][col] < minVal) {
                    minVal = matrix[row][col];
                    minIndex = row;
                }
            }
            result[col] = minIndex;
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d ", val);
            }
            System.out.println();
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.printf("%2d ", num);
        }
        System.out.println();
    }
}
