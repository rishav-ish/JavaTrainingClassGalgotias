import java.io.*;

public class arrange{
 	public static void main(String[] args){
		 try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int[] a;

			System.out.println("Enter your array size");

			int size = Integer.parseInt(br.readLine());

			a = new int[size];
			
			System.out.println("Enter your " + size + " numbers.");

			for(int i = 0;i<size;++i)
				a[i] = Integer.parseInt(br.readLine());			

			int[] b  = new int[size];

			int j = 0;

			for(int i = 0; i<a.length;++i)
					if(a[i] < 0){
						b[j] = a[i];
						++j;
					}
			

			for(int i = 0; i<a.length;++i)
					if(a[i] >= 0){
						b[j] = a[i];
						++j;
					}

			System.out.println("\n\n");
			for(int i:b)
				System.out.print(i + "\t");
			
		}catch(Exception ex){
			System.out.println("oops");
		}
	}
}	