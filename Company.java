class Company
{
  int empno;
  String product_name;
  
  void product(int empno, String product_name)
  {
    System.out.print("company");
    this.product_name = product_name;
  }
  
  public static void main(String argc[])
  {
    Company mycompany = new Company();
    mycompany.product(4, "shampoo");
    System.out.print(mycompany.product_name);
  }
}
