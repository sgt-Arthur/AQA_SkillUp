import java.util.Random;

public class TasksAboutArrays {

    public static void main(String[] args) {


        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
        }

        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (minValue > value) {
                minValue = value;

            }

        }
        System.out.println("minValue =" + minValue);


        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (maxValue < value) {
                maxValue = value;

            }

        }
        System.out.println("maxValue =" + maxValue);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
//4 пункт. По хорошему вынес бы в отдельный клас, так как результат предыдущих пунктов не даёт одним потоком выполнить
        int[] arrEven = new int[10];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            if (k % 2 == 0) {
                arrEven[j]=k;
                System.out.println(arrEven[j]);
                j++;
            }

        }
    }
}