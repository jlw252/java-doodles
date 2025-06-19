package jennyworld;
import java.io.*;
import java.util.Random;
public class SmallTalk {
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i <= n / 2; ++i) {
		      // condition for nonprime number
		      if (n% i == 0) {
		        flag = false;
		        break;
		      }
		    }
		return flag;
	}
	
	public static int next() {
		boolean flag = true;
		int counter = 1;
		if (flag = false) {
			return 1;
		}
		counter++;
		return counter;
	
	}
	
	public static void reset() {
		int counter = 1;
		boolean flag = true;
	}
	
	public static int get(int n) {
		//calls isPrime
		int count = 0;
		int i = 0;
		while(count != n) {
			if(isPrime(i)){
				count++;
			}
		}
		return i - 1;
	}
	
	public static int rand() {
		return get((new Random()).nextInt(1000));
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(String.valueOf(i) + ") " + isPrime(i)+ ", Next: "+ next());
			System.out.println();
		}
	    

	}//main
	
}//SmallTalk