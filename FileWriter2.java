import java.io.*;

public class FileWriter2{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("Let_me_writer.txt");
			
			fw.write("Hello how are you");
			fw.write("\nI am fine");
			fw.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			System.out.println("\nDone");
		}
	}
}