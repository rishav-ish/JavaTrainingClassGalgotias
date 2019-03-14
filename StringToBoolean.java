import java.io.*;

public class StringToBoolean{
	public static void main(String[] args){	
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please enter some values as string ");
			String sample = br.readLine();

			boolean b = new Boolean(sample).booleanValue();
		
			System.out.println(b);
		}catch(Exception ex){
			System.out.println("sorry something is not looking right");
		}
	}
}