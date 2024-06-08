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

      Product userProduct = new Product();
      System.out.println("Type product name:");
      userProduct.name = sc.nextLine();
      System.out.println("Type product price:");
      userProduct.price = sc.nextDouble();
      System.out.println("Type product quantity:");
      userProduct.amount = sc.nextInt();

      System.out.println(userProduct.);


      sc.close();
   }
}
