package ex1.io;
import java.util.*; //on-demand형 import선언. util패키지의 모든 클래스를 import 
import java.sql.*; 

public class HowAreYou1 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Date a=new Date()  ; // compile Error!!!
	}

}

util 패키지와 sql패키지 모두 Date클래스가 있기 때문에 오류. 
java.sql.Date 라고 명시적으로 사용하는 것이 좋음.
