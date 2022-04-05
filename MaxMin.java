import java.util.Scanner;

	class Maxmin{
	 public static void main(String args[]){
	 Scanner in = new Scanner(System.in);

	 System.out.println("Enter first Number:");
	 int a  = in.nextInt();

	 System.out.println("Enter Second Number:");
	 int b  = in.nextInt();


         int c  = a+b;
         System.out.println(c);
         int a1 = (a+b)*c;
         int a2 = c+(a/b);
         int a3 = a%(b+c);
         int a4 = a*(b+c);

         System.out.println("a+b*c= " + a1);
         System.out.println("c+a/b= " + a2);
         System.out.println("a%b+c= " + a3);
         System.out.println("a*b+c= " + a4);

          if ( a1 > a2 && a1 > a3 && a1 > a4 )
             System.out.println("a1 is max value");
          else 
             System.out.println("a1 is min value");

          if ( a2 > a3 && a2 > a4 && a2 > a1 )
             System.out.println("a2 is max value");
           else 
             System.out.println("a2 is min value");

           if ( a3 > a4 && a3 > a1 && a3 > a2 )
             System.out.println("a3 is max value");
          else 
             System.out.println("a3 is min value");

          if ( a4 > a1  && a4 > a2 && a4 > a3 )
             System.out.println("a4 is max value");
           else 
             System.out.println("a4 is min value");



	}

}


