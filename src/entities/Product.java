package entities;

public class Product {
   private String name;
   private double price;
   private int amount;

   public Product(String name, double price, int amount) {
      this.name = name;
      this.price = price;
      this.amount = amount;
   }

   public Product(String name, double price) {
      this.name = name;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getAmount() {
      return amount;
   }

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
