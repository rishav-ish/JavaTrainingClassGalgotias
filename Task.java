import java.io.*;

public class Task{
	public static void main(String[] args){
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your number");
			int number =  Integer.parseInt(br.readLine());

			if(number%2!=0)
				System.out.println("Weird");
			else{
			     if(number>=2 && number <= 5)
				System.out.println("Not Weird");
			
			     else if(number>=6 && number <= 20)
			        System.out.println("Weird");
			     
			     else if(number >20)
				System.out.println("Not Weird");
			}	
	 }catch(Exception ex){
		System.out.println("OOps!!");
	}
   }
}
