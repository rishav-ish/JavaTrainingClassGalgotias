import java.io.*;
import java.util.Scanner;

public class Arijit{
	public static void main(String[] args){
		try{

			int temp = 0;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner input = new Scanner(System.in);
			
			int n = Integer.parseInt(br.readLine());

			int a[] = new int[n];

			for(int i = 0;i<n;++i)
				a[i] = input.nextInt();
			int q = Integer.parseInt(br.readLine());

			int b[] = new int[q];


			for(int i = 0;i<q;++i)
				b[i] = Integer.parseInt(br.readLine());

			System.out.println("\n\n");			

			for(int i = 0;i<q;++i){
			    for(int j=0;j<n;++j)
				     if(b[i] == a[j])
						++temp;

			  if(temp>0)
				System.out.println(temp);
			  else
				System.out.println("NOT PRESENT");
			
			  temp = 0;	
			}

			
		}catch(Exception ex){
			System.out.println("Oops..");
		}
	}
}