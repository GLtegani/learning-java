package entities;

public class Product {
   public String name;
   public double price;
   public int amount;


   public double totalValueInStock() {
      return price * amount;
   }

   public void addProduct(int quantityProduct) {
      amount += quantityProduct;
   }

   public void removeProduct(int quantityProduct) {
      amount -= quantityProduct;
   }

   public String toString() {
      return name + ", $ " + String.format("%.2f", price) + ", " + amount + " units, Total: $ " + String.format("%.2f", totalValueInStock());
   }
}
