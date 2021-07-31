class Shampoo
{
 int price;
 String name;

 void apply(int price, String name)
 {
      System.out.print("shampoo details:");
 }
   
 public static void main(String argc[])
 {
    Shampoo shampoo1 = new Shampoo();
    shampoo1.price = 2;
    shampoo1.name = "clinic";
    System.out.printf("shampoo price =" + shampoo1.price  +  "shampoo name = " + shampoo1.name);                  
  }
}                  
