import java.util.Scanner;
class Digit{
  public static void main(String args[]){
    Scanner conin=new Scanner(System.in);
    System.out.println("Enter single digit number:");
      String[] array = {"exit/quit","one", "two", "three","four","five","six","seven","eight","nine"};
    int a=conin.nextInt();
    if(a<10){
     while (a!=0) {
      System.out.println("You have entered number:"+array[a]);
      a=conin.nextInt();

    }
   System.out.println("Program "+array[a]);
   System.exit(0);
    }else{
        System.out.println("not allow");
         System.exit(0);
  }
 }
}
