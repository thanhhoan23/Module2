public class DaoNguoc {
    public static void main(String[] args) {
        // So sánh chuối
        // equal: so sanh bang, compareTo: so sánh với chuỗi khác
        // contain: có chứa chuỗi con không, isEmpty: kiểm tra chuổi rỗng
        // equalsIgnoreCase: so sánh bằng không phân biệt hoa thường
        String [] students = {"Hoan", "Cuong", "Loi", "Duy"};
        String name = "Loi";
        int count  = 0;

        //findNameInArray(students, name);
        String str = students[0];
        for ( int i = 0; i< students.length; i++) {
            if (students[i].trim().length() > str.trim().length()) {
                str = students[i];
            }

        }
        System.out.println(str);


    }

//    public static void findNameInArray(String[] arr, String name) {
//        int count = 0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i].equalsIgnoreCase(name)){
//                count++;
//            }
//        }
//        System.out.printf("Lop co %d ten la %s", count, name);
//    }
//    public static void printArray(String [] arr){
//        String str = "[";
//        for(int i=0;i< arr.length;i++){
//            str += arr[i];
//            if(i!=arr.length-1){
//                str += ",";
//            }else{
//                str += "]";
//            }
//        }
//        System.out.println(str);
//    }
//    public static void reverseArray(String [] arr) {
//        for(int i=0; i< arr.length/2;i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;

        };







