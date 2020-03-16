package ex1.io;
import java.util.Scanner;
class Day
{
	private int year;
	private int month;
	private int date;
	Day()
	{
		this.year=1;this.month=1;this.date=1;
	}
	Day(int year)
	{
		set(year,1,1);
	}
	Day(int year, int month)
	{
		set(year,month,1);
	}
	Day(int year,int month,int date)//생성자
	{
		this.year=year; this.month=month; this.date=date;
	}
	Day(Day d)
	{
		set(d.year,d.month,d.date);
	}
	int getYear() {return year;}
	int getMonth() {return month;}
	int getDate() {return date;}
	void set(int year,int month, int date)//재설정하기 
	{
		this.year=year; this.month=month; this.date=date;
	}
	public String toString()
	{
		return this.year+"년"+this.month+"월"+this.date+"일";
	}
	public static boolean isleap(int y)//클래스 메소드 ,정적 메소드 
	{
		return y%4==0&& y%100!=0 || y%400==0;
	}
	public boolean isleap() //인스턴스 메소드 
	{
		return year%4==0&& year%100!=0 || year%400==0;
		//return isleap(year); 
	}
	
}
public class Program {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Day day1=new Day();

		
		Day day2=new Day(1998);

		Day day3=new Day(1998,5);
	
		Day day4=new Day(1998,5,21);

		Day day5=new Day(day4);

		
		int y=scan.nextInt();
		System.out.println("이 해는 윤년" + (Day.isleap(y)?"입니다":"이 아닙니다") );
		
		System.out.println(day5.getYear()+"년은 윤년" + (day5.isleap()?"입니다":"이 아닙니다") );
	}

}
