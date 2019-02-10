import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class HappyFriend{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Scanner input = new Scanner(System.in);

			int t = Integer.parseInt(br.readLine());

			int a[][] = new int[t][];
			int sf[] = new int[t];

		
			for(int i = 0;i<t;++i){
				int temp = Integer.parseInt(br.readLine());
				
				a[i] = new int[temp];

				for(int j = 0;j<temp;++j)
					 a[i][j] = input.nextInt();

				sf[i] = Integer.parseInt(br.readLine());
			}


			System.out.println("\n\n");			

			for(int i = 0;i<t;++i){
				Arrays.sort(a[i]);
				int sum = 0;
	
				for(int j=0;j<sf[i];++j)
					    sum = sum + a[i][j];
				
				System.out.println(sum);
			}			



		}catch(Exception ex){
			System.out.println("Oops...");
		}
	}
}
				
						

			