public class FindMinValue {
    public static void main(String[] args) {
        Integer[] inputNumber = {
                11, 3, 9, 10, 2
        };

        int min = inputNumber[0];
        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] < min) {
                min = inputNumber[i];
            }
        }
        System.out.println(min);
    }
}
