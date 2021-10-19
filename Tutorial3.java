import java.util.Scanner;
public class Tutorial3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println(x-y);
		
		//if x>y 
		//print x 
		//else 
		//print y
		
		if(x>y)
			System.out.println(x+" IS BIG");	
		else if(y>x)
			System.out.println(y+" IS BIG");
		else
			System.out.println("I DONT KNOW");				
	}
}


/*
Input:
2 3
Output:
5
6
-1

Input:
10 12
Output:
22
120
-2


x,y = 2 numbers
2,3

2+3=5
2*3=6
2-3=(-1)



10,12
10+12 = 22
10*12 = 120
10-12 = (-2)

*/

