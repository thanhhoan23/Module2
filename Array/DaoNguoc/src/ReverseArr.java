public class ReverseArr {
    public static void main(String[] args) {
        String [] names = {
                "Hoan", "Duy", "Loi"
        };
        for ( int i = 0; i < names.length/2; i++) {
            String temp = names[i];
            names[i] = names[names.length -1 - i];
            names[names.length-1-i] = temp;

            System.out.println(names[i]);
        }
    }
}
