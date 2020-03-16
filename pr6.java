package ex1.io;

import static java.lang.Math.PI; // static import 선언
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class HowAreYou1 {
		static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		double r=scan.nextDouble();
		out.println("원의 면적은 " +(PI*r*r)+"입니다");
	}
		
}



