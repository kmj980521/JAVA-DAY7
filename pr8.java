package ex2;
import ex1.io.HowAreYou1;
import java.util.Scanner;
class Ex {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	HowAreYou1 he=new HowAreYou1(a,b);
	System.out.println("a의 값은 " + he.geta()) ;
	System.out.println("b의 값은 " + he.getb()) ;
	he.print();
	}
	
	}


