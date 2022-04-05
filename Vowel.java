import java.util.Scanner;

class Vowel{
   public static void main(String args[]){
   
	Scanner inp=new Scanner(System.in);
	System.out.print("\n Enter Character: ");
        char c=((inp.nextLine()).charAt(0));
	char z =Character.toUpperCase(c);

	switch (z) {

	 case 'A':
	 case 'E':
	 case 'I':
	 case 'O':
	 case 'U':

		System.out.println(c+ " is vowel");
		break;
	  default:
		System.out.println(c + " is Consonant");

	}

       }


}

