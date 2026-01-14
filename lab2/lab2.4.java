public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        // Заполнение случайными числами -99..99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 199) - 99;
            }
        }
        double avg = avgPositiveMinorDiagonal(matrix);
        System.out.printf("Среднее положительных на побочной диагонали: %.2f%n", avg);
    }
    public static double avgPositiveMinorDiagonal(int[][] matrix) {
        int n = matrix.length;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int val = matrix[i][n - 1 - i]; // побочная диагональ
            if (val > 0) {
                sum += val;
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
