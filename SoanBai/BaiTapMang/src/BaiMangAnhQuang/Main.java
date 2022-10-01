package BaiMangAnhQuang;

public class Main {
    public static void main(String[] args) {
        ArrayEx ex = new ArrayEx();

        int []array = {2,4,6,7,19,10};
//        int [] array2 = {40,30,20};

        int [] array2 = {2,4,3,6,5,6};
//        int [] array;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap so luong phan tu:");
//        int number = input.nextInt();
//        array = new int[number];
//        for (int i=0; i< array.length; i++) {
//            System.out.println("Nhap so phan tu:");
//             array[i] = input.nextInt();
//        }
//
//        for (int i =0; i< array.length; i++) {
//            System.out.print (" " + array[i]);
//        }
//        System.out.println("");

//Tim so lon nhat:
//        System.out.println("So lon nhat:" + ex.searchMaxByPoint(array));
////        tim so lon thu 2:
//        System.out.println("so lon thu 2:" + " " + ex.searchMaxSecond(array,4));
////        Dao nguoc:
//        ex.reverse(array);

//        Xoa phan tu tu index
//        System.out.println(Arrays.toString(ex.deleteIndex(array, 4,2)));
//        System.out.println(Arrays.toString(ex.deleteIndex(array, 2,2)));

//        thêm phần tử:
//        System.out.println(Arrays.toString(ex.addIndex(array, 2, 2)));

//        thêm một phần tử
//       ArrayEx.add(array,3,2);
//        ArrayEx.delete(array,2);
//        ArrayEx.delete(array,5);


//        nối 2 mảng
//        ArrayEx.connect(array,array2);


//        Kiểm tra xem mảng b có phải là con mảng a hay không
//        ArrayEx.check(array,array2);

//
        ArrayEx.copyArr(array,2,5);
//        int []array = {2,4,6,7,19,10};

    }
}
