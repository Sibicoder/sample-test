class Friend
  {
    int nooffriends;
    String name;
  
    void fun (int nooffriends , String name)
    {
    System.out.print("adding friends");
    }
  
    public static void main(String argc[])
    {
    Friend myfriend = new Friend();
    myfriend . nooffriends=10;
    myfriend . name = "Everyone";
    System.out.print("How many members :" + myfriend . nooffriends + "name " + myfriend.name);
    }
}
    
