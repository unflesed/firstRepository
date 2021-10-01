public class Task_4 {
    public static void main(String[] args) {
        int[][] array = {
                {3,5,6,7},
                {12,1,1,1},
                {0,7,12,1}
        };
        int sum = 0;
        int[] sumStb = new int[4];
        int[] sumStr = new int[3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumStb[j] += array[i][j];
                sumStr[i] += array[i][j];
            }
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("| " + sumStr[i]);
            System.out.println();
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < sumStb.length; i++) {
            System.out.print(sumStb[i] + "\t");
        }
        System.out.println("| " + sum);
    }
}
