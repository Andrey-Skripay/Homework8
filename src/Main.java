import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1

        int [] intA = new int[] {1,2,3};
        double[] numbers = {1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"apple", "banana", "orange"};

        // Задача 2
        System.out.println(Arrays.toString(intA));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(stringArray));

        // Задача 3
        int [] intA1 = new int[] {3,2,1};
        double[] numbers1 = {9.986, 7.654,1.57};
        String[] stringArray1 = new String[]{"orange", "banana", "apple"};
        for (int i = intA1.length - 1; i >= 0; i--) {
        }
        System.out.println(Arrays.toString(intA1));
        for (int i = numbers1.length - 1; i >= 0; i--) {
        }
        System.out.println(Arrays.toString(numbers1));
        for (int i = stringArray.length - 1; i >= 0; i--) {
        }
        System.out.println(Arrays.toString(stringArray));

        // Задача 4

        int[] num = {1, 2, 3};
        int length = num.length;

        for (int i = 0; i < length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
            }
        }
        System.out.println(Arrays.toString(num));


    }
}
