import java.io.*;

public class Byteland{
	static int bit = 1;
        static int nibble = 0;
	static int bytes = 0;
	

	public static void main(String[] args){
		 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int test = Integer.parseInt(br.readLine());

			int[] time = new int[test];

			for(int i = 0;i<test;++i)
				time[i] = Integer.parseInt(br.readLine());

			for(int i=0;i<test;++i){
                                 countBit(time[i]);

				  System.out.println(bit + " " + nibble + " " + bytes);
			          bit = 1;
				  bytes = 0;
				  nibble= 0;	
			}
		
		}catch(Exception ex){
			System.out.println("Oops!!!");
		}
	}

	public static void countBit(int time){
		
	       if(time <= 2)
			return;

		else{
		    nibble =  bit;
		    bit = 0;

		    countNibble(time-3);
		}
		
	}

	 public static void countNibble(int time){
		 if(time <= 8)
			return;
		  else{
			 bytes = nibble;
			 nibble = 0;
			 
			 countByte(time-9);
				
		}
	}


	 public static  void countByte(int time){
	         if(time <= 16)
			return;
		 else{
			bit = bytes *2;
			bytes = 0;
			
			countBit(time-17);



		 }
	}
		
			
			
}
