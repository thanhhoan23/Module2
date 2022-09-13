import java.util.Scanner;

public class FindValueArr {
    public static void main(String[] args) {
//        cach 1:
        Scanner name = new Scanner(System.in);
        System.out.println("Input the name, you want to find of the index: ");
        String inputName = name.nextLine();
        String [] listNames = {
                "Thanh Hoan", "Quoc Khanh", "Duy Khanh", "Cam Van"
        };
        for (int i = 0; i< listNames.length; i++){
            if (inputName.equalsIgnoreCase(listNames[i])) {
                System.out.println("Ten " + inputName + "nam o vi tri  " + i);
                break;
            }
        }

//        cach 2:

        String [] myList = {
                "Thanh Hoan", "Quoc Khanh", "Duy Khanh", "Moc Chau"
        };
        Scanner findName = new Scanner(System.in);
        System.out.println("Input the name, you want to find: ");

        String index = findName.nextLine();
//        sử dụng viết hoa, thường thì sẽ sử dụng tolowerCase, toUpperCase
//        còn muốm so sánh không phân biệt hoa thường : equalsIgnoreCase


        boolean isExit = false;
        for (int i=0; i < myList.length; i++) {
            if (myList[i].equalsIgnoreCase(index)) {
                System.out.println("Position of the name  in the list " + index + " is " + i);
                isExit = true;
                break;
            }
        }

        if (!isExit) {
            System.out.println("Not found" + index + "in the list.");
        }

    }
}
