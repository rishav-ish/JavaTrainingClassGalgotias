import java.io.*;

public class Solution{

	public static void main(String[] args){

		try{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number;
	
                System.out.println("Enter your number ");
		number = Integer.parseInt(br.readLine());



		System.out.println("The total sum is "+sumOfDigit(number));
	     }catch(Exception ex){
			System.out.println("Oops!");
	     }
	}

	public static int sumOfDigit(int n){
		int sum= 0;
		for(int i = n;i>=1;--i)
			sum += i;

		return sum;
	}
}

