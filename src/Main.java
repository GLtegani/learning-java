import entities.Product;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//      Triangle x = new Triangle();
//      Triangle y = new Triangle();
//
//      x.a = sc.nextDouble();
//      x.b = sc.nextDouble();
//      x.c = sc.nextDouble();
//
//      y.a = sc.nextDouble();
//      y.b = sc.nextDouble();
//      y.c = sc.nextDouble();
//
//      double areaX = x.area();
//      double areaY = y.area();
//
//
//      if(areaX > areaY) {
//         System.out.println("Larger area: X");
//      } else {
//         System.out.println("Larger area: Y");
//      }

      System.out.println("Type product name:");
      String name = sc.nextLine();
      System.out.println("Type product price:");
      double price = sc.nextDouble();
      System.out.println("Type product quantity:");
      int amount = sc.nextInt();
      Product userProduct = new Product(name, price, amount);

      System.out.printf("Product data: %s %n", userProduct);
      System.out.printf("Enter the number of products to be added in stock: %n");
      amount = sc.nextInt();
      userProduct.addProduct(amount);
      System.out.printf("Updated data: %s %n", userProduct);

      System.out.printf("Enter the number of products to be removed from stock: %n");
      amount = sc.nextInt();
      userProduct.removeProduct(amount);
      System.out.printf("Updated data: %s %n", userProduct);


      sc.close();
   }
}
