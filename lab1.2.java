import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Требуется один аргумент: число x.");
            return;
        }
        
        double x = Double.parseDouble(args[0]);
        long n = (long) Math.abs(x); // n как целая часть |x|
        
        // Факториал n (для небольших n, чтобы избежать переполнения)
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        // Вычисление f(x) = n! * sin(x)
        double result = factorial * sin(x);
        
        System.out.printf("f(%.2f) = %d! * sin(%.2f) = %.4f%n", x, n, x, result);
    }
}
