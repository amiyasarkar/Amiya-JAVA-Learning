import java.util.*;
public class Task3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int avg = (a+b+c)/3;
	    System.out.println(avg);
	    
	    if(avg>10){
			System.out.println("MORE THAN 10");
		}
		else{
			System.out.println(avg*2);
		}
	    
	}
}


/*
 
Find the Average of the 3 Numbers and print it
If the average is greater than 10, print "MORE THAN 10"
If the average is lesser than 10, print double of the answer.

*/
