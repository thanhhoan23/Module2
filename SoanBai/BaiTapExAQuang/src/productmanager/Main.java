package productmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();
        list=getListProduct();
        Scanner input = new Scanner(System.in);
        double choose = 0;
        int count = 0;
        do {
            System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛Menu✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛");
            System.out.println("*           Vui lòng chọn chức năng          *");
            System.out.println("*   1. Thêm sản phẩm                         *");
            System.out.println("*   2. Chỉnh sửa tên sản phẩm theo id        *");
            System.out.println("*   3. Chỉnh sửa giá sản phẩm theo id        *");
            System.out.println("*   4. Chỉnh sửa id sản phẩm theo id         *");
            System.out.println("*   5. Xóa một sản phẩm                      *");
            System.out.println("*   0. Thoát chương trình                    *");
            System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛");
//            choose = Double.parseDouble(input.nextLine());
            choose = input.nextInt();
            input.nextLine();

            if (choose == 1) {
                System.out.println("Nhập tên sản phẩm: ");
                String name = input.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = input.nextInt();
                System.out.println("Nhập mã sản phẩm: ");
                int id = input.nextInt();
                Product product = new Product(name, price, id);
                addProduct(list, product);
                saveListProduct(list);
                printProduct(list);

            } else if (choose == 2) {
                System.out.println("Chỉnh sửa tên: ");
                String name = input.nextLine();
                System.out.println("Nhập id:");
                int id = input.nextInt();
                changeProductNameById(list, id, name);
                saveListProduct(list);
                printProduct(list);

            } else if (choose == 3) {
                System.out.println("Nhập id:");
                int id = input.nextInt();
                System.out.println("Nhâp giá muốn chỉnh sửa");
                double price = input.nextDouble();
                changeProductPriceById(list, id, price);
                saveListProduct(list);
                printProduct(list);

            } else if (choose == 4) {
                System.out.println("Nhập id:");
                int id = input.nextInt();
                changeProductIdById(list,id);
                saveListProduct(list);
                printProduct(list);

            } else if (choose == 5) {
                System.out.println("Nhập id: ");
                int id = input.nextInt();
                deleteProductById(list, id);
                saveListProduct(list);
                printProduct(list);
            }
        } while (choose != 0);

//        int id = 1;
//        String name = "Tra sua";
//        double price = 45000;
//        Product newProduct1 = new Product(name, price, id);
//        list.add(newProduct1);
//        saveListProduct(list);

//        getListProduct(list);
//        System.out.println(list);


    }

    //    Thêm sản phẩm
    public static void addProduct(ArrayList<Product> list, Product product) {
        list.add(product);
    }


    //    Chỉnh sửa tên theo id
    public static void changeProductNameById (ArrayList<Product> products,int id, String name){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIdProduct() == id) {
                products.get(i).setNameProduct(name);
            }
        }
    }
//    Chỉnh sửa giá theo id
    public static void changeProductPriceById (ArrayList<Product> products, int id, double price) {
        for (int i =0; i< products.size(); i++) {
            if (products.get(i).getIdProduct() == id) {
                products.get(i).setPrice(price);
            }
        }
    }
//Chỉnh sử id theo id
    public static void changeProductIdById (ArrayList<Product> products, int id) {
        for (int i  = 0; i< products.size(); i++) {
            if (products.get(i).getIdProduct() == id) {
                products.get(i).setIdProduct(id);
            }
        }
    }

//    Xóa sản phẩm theo id

    public static void deleteProductById (ArrayList<Product> products, int id) {
        for (int  i = 0; i<products.size(); i++) {
            if(products.get(i).getIdProduct() == id) {
               products.remove(i);
            }
        }
    }
    public static void saveListProduct(ArrayList<Product> list) {
        File file = new File("product.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(convertToString(list));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static ArrayList<Product> getListProduct() {
        ArrayList<Product> list = null;
        try {
            list = new ArrayList<>();
            File file = new File("product.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
//               1,Tra sua,45000.0

                String[] arr = line.split(",");
                String sId = arr[0];
                String sName = arr[1];
                String sPrice = arr[2];

                int id = Integer.parseInt(sId);
                double price = Double.parseDouble(sPrice);
                Product product = new Product(sName, price, id);
                list.add(product);
                return list;
            }
        } catch (Exception e) {
            return list;
        }
        return list;
    }

    //    Ham in
    private static void printProduct(ArrayList<Product> listProduct) {
        for (Product p : listProduct) {
            System.out.printf("%d   %s   %f \n", p.getIdProduct(), p.getNameProduct(), p.getPrice());
        }
    }
//    public static void printProduct (ArrayList<Product> list) {
//        for (Product product : list) {
//            System.out.printf("%s   %f   %d \n" + product.getName() + product.getPrice() + product.getId() );
//        }
//    }

    private static String convertToString(ArrayList<Product> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i).getIdProduct() + "," +
                    list.get(i).getNameProduct() + "," +
                    list.get(i).getPrice() + "\n";
        }
        return str;
    }
}
