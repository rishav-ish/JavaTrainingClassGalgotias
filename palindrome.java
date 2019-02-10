import java.io.*;


public class palindrome{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter your array size");
			int size = Integer.parseInt(br.readLine());

			int a[] = new int[size];
			int temp;

			System.out.println("Enter your " + size + " numbers.");

			for(int i = 0;i<size;++i)
					a[i] = Integer.parseInt(br.readLine());


			System.out.println("\n\nFollowing are the palindrome");

			int r,sum=0;

			for(int i = 0;i<size;++i){
				temp = a[i];
				while(temp>0){    
   					r=temp%10;
   					sum=(sum*10)+r;    
  					 temp=temp/10;    
  				}  

				if(a[i]==sum)
					System.out.println("\n"+a[i]);

				sum = 0;
			}
									

		}catch(Exception ex){
			System.out.println("Oops!");
		}
	}
}