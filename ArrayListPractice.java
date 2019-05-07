import java.util.*;
import java.io.*;

public class ArrayListPractice{
	public static void main(String[] args) throws Exception{

		Scanner input = new Scanner(System.in);

		clear cls = new clear();

		cls.go();
		
		ArrayList<String> user = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();

		

		System.out.println("Please add the total number of user you want to enter ");
		System.out.println("-------------------------------------------------------\n");
		int length = input.nextInt();


		for(int i = 0; i < length; ++i){
				System.out.println("\nEnter the detail of user " + (i+1));
				System.out.print("User ");
				
				user.add(input.next());

				System.out.print("Password ");

				password.add(input.next());

		}

		try{
			File file = new File("user_details");

			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

			Iterator u_itr = user.iterator();
			Iterator p_itr = password.iterator();


			while(u_itr.hasNext()){
					
				bw.write(u_itr.next() + " " + p_itr.next());
				bw.newLine();	
					
			}

			bw.close();
		}catch(Exception ex){
				ex.printStackTrace();
		}
	}

	
}		
		