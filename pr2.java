package ex1.io;
import java.util.Scanner;

public class Program {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
;
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=Math.max(a,Math.max(b, c));
		System.out.println("a,b,c의 최댓값은 : "+ d);
		int e=Math.min(a, Math.min(b, c));
		System.out.println("a,b,c의 최솟값은 : "+ e);
		
		int []list1=new int[2];
		int []list2=new int[3];
		
		for(int i=0;i<list1.length;i++)
		{
			list1[i]=scan.nextInt();
		}
		for(int i=0;i<list2.length;i++)
		{
			list2[i]=scan.nextInt();
		}
		System.out.println("리스트1의 최댓값은: "+Math.max(list1[0], list1[1]) );
		System.out.println("리스트1의 최촛값은: "+Math.min(list1[0], list1[1]) );
		System.out.println("리스트2의 최댓값은 : "+Math.max(list2[0], Math.max(list2[1],list2[2])));
		System.out.println("리스트2의 최댓값은 : "+Math.min(list2[0], Math.min(list2[1],list2[2])));
	}

}
