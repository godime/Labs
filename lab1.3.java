public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Требуется один аргумент: число (оценка от 0 до 100).");
            return;
        }
        int mark = Integer.parseInt(args[0]);
        String result;
        if (mark >= 90) {
            result = "Отлично (5)";
        } else if (mark >= 75) {
            result = "Хорошо (4)";
        } else if (mark >= 60) {
            result = "Удовлетворительно (3)";
        } else if (mark >= 40) {
            result = "Неудовлетворительно (2)";
        } else {
            result = "Не зачтено (1)";
        }
        System.out.printf("Оценка %d: %s%n", mark, result);
    }
}
