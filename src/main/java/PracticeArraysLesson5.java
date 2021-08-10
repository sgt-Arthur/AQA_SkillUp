public class PracticeArraysLesson5 {

    public static void main(String[] args) {

        int[] numbers = {3, 8, 5, 16, 15};

        int sum = 0;
        int sumOdd = 0;
        int sumEven = 0;


        for (int tempVar : numbers) {
            sum = sum + tempVar;
            if (tempVar % 2 == 0) {
                sumEven = sumEven + tempVar;
            } else {
                sumOdd = sumOdd + tempVar;
            }
        }
        System.out.println(sum);
        System.out.println(sumOdd);
        System.out.println(sumEven);

        int length = numbers.length;
//        for (int i = 0; i < length; i++) {
//
//            System.out.print(numbers[length - i - 1]+ " ");
//
//        }

        for (int i = length-1; i >=0; i--) {

            System.out.print(numbers[i]+ " ");

        }
    }


}

