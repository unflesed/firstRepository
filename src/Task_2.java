public class Task_2 {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Сумма элементов матрицы: " + sum(array));
        System.out.println("Среднее арифметическое всех элементов массива: " + average(array));
        System.out.println("Максимальное значение: " + max(array));
        System.out.println("Минимальное значение: " + min(array));
    }
    static int sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
             sum += arr[i][j];
            }
        }
        return sum;
    }
    static double average(int[][] arr){
        int countElements = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                countElements++;
            }
        }
        return (double) sum(arr) / countElements;
    }
    static int min(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
