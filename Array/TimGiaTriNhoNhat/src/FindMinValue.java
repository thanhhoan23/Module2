public class FindMinValue {
    public static void main(String[] args) {
        Integer[] inputNumber = {
                11, 3, 9, 10, 2
        };
        int numberMin = findMin(inputNumber);
        System.out.println(numberMin);
    }

    public static int findMin(Integer[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;

    }
}



