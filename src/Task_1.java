import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n;
        n = sc.nextInt();
        Random random = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble()*(10 + 10) - 10;
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sumNegative(array);
        multiplication(array);
        multBetweenMinMax(array);
        sumBetweenNegative(array);
    }
    static void sumNegative(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nСумма отридцатеьлных элементов:" + sum);
    }
    static void multiplication(double[] arr){
        double mult = 1;
        for (int i = 0; i < arr.length; i += 2) {
            mult *= arr[i];
        }
        System.out.println("Произведение четных элементов массива: " + mult);
    }
    static void multBetweenMinMax(double[] arr){
        double min = arr[0], max = arr[0];
        double mult = 1;
        int countMin = 0, countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                countMin = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                countMax = i;
            }
        }
        if (countMin > countMax) {

            int tmp = countMin;
            countMin = countMax;
            countMax = tmp;
        }
            for (int i = countMin + 1; i < countMax; i++) {
                mult *= arr[i];
            }

        System.out.println("Произведение элементов между максимальным и минимальным:" + mult);
    }
    static void sumBetweenNegative(double[] arr){
        int firstNegativeIndex = 0;
        int lastNegativeIndex = 0;
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                lastNegativeIndex = i;
            }
        }
        for (int i = firstNegativeIndex + 1; i < lastNegativeIndex; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов, находящихся между первым и последним отрицательными\n" +
                "элементами:" + sum);
    }
}
