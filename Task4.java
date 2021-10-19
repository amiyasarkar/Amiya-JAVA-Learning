import java.util.*;

public class Task4 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();	
		System.out.println(a+(a*n));
		System.out.println(b-(b*n));
			
	}
}



/*
Given a number n,
Add the first number with itself for n times
Subtract the second number with itself for n times


Example :
N = 4
A = 1
B = 2

Output :
5
-6

*/
