import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        // Проверка на 2 аргумента
        if (args.length != 2) {
            System.out.println("Неверное количество параметров. Требуются два числа.");
            return;
        }
        
        // Парсинг аргументов в double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        
        // Проверка условия и вычисление
        double result;
        if ((a + b) > 100) {
            result = 2 * sin(a);
        } else {
            result = 0; // Или другое значение по логике задания, но по тексту только if
        }
        
        System.out.printf("Результат: %.4f%n", result);
    }
}
