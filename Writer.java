import java.io.*;

public class Writer{
	
	public static void main(String[] args){
	try{
		FileWriter fw = new FileWriter("i_will_write.txt");
		
		fw.write("Hello, how are you");
		
		fw.close();
	}catch(IOException ex){
		ex.printStackTrace();
	}
	
	}
}