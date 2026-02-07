package Week1.day2;

import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 13;
	
		for (int i = 2; i <=num; i++) {
			boolean isPrime=true;

			for (int j = 2; j<i; j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
				
			}
		if(isPrime) {
			System.out.println(i+ " is a prime number");}
		else {
			System.out.println(i+ " is not a prime number");
			}
		}			
		}
	}


