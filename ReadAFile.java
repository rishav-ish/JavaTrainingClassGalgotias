import java.io.*;

public class ReadAFile{
	public static void main(String[] args){
		try{
			File myFile = new File("Application.txt");
			
			FileReader fr = new FileReader(myFile);
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			
			br.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}