import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        Random random = new Random();


        numbers[0] = random.nextDouble() * 10;
        numbers[1] = random.nextDouble() * 10;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * (random.nextBoolean() ? 1 : -1) * 10;
        }


        System.out.print("Массив: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        double sum = 0;
        int count = 0;
        boolean foundFirstNegative = false;

        for (double num : numbers) {
            if (num < 0 && !foundFirstNegative) {
                foundFirstNegative = true;
            } else if (foundFirstNegative && num > 0) {
                sum += num;
                count++;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}
