

import java.util.*;
public class Task1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 5;
		if (a>b){
			if(a%2==0){
				System.out.println("EVEN");
			}
			else{
				System.out.println("YES ODD");
			}
		}	
		else{
			System.out.println(a*b);
		}		
	}
}

/*
Given two numbers, 
if the first number is bigger than second number, check if the first number is odd.
if the first number is smaller than second number, print (first*second
*/
