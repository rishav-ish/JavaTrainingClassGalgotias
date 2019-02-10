import java.io.*;

public class Minimum{
	public static void main(String[] args){

	   try{
		int[] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your array size");
		int size = Integer.parseInt(br.readLine());

		a = new int[size];

		System.out.println("Enter your " + size + " number");
		
		for(int i = 0;i<size;++i)
			a[i] = Integer.parseInt(br.readLine());		 

		int temp = a[0];

		for(int i = 1;i<a.length;++i){
				if(temp > a[i])
					temp = a[i];
		}

		System.out.println("\n\nMinimum value is " + temp);
	   }catch(Exception ex){
			System.out.println("Oops!!!");
	   }
	}
}