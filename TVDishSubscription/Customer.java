/*
	Customer class
	programmed by Rishav
*/


import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Customer{
	
	Scanner input = new Scanner(System.in);

	ArrayList<String> mob = new ArrayList<String>();
	
	ArrayList<String> name = new ArrayList<String>();			//user name...
	ArrayList<String> password = new ArrayList<String>();       //user password....
	HashSet<Integer> subscribe = new HashSet<Integer>();		//user subscription...
	private String m;
	private String n;
	
	
	public Customer(){
		
		try{
			
			File file = new File("user_details.txt");
			// File file2 = new File("user_subscription.txt");
			
			BufferedReader user = new BufferedReader(new FileReader(file));
			// BufferedReader user_s = new BufferedReader(new FileReader(file2));
			
			
			String temp;

			while((temp=user.readLine())!=null) {
				
				String words[] = temp.split(",");
				
				mob.add(words[0]);
				name.add(words[1]);
				password.add(words[2]);


				// subscribe.add(user_s.readLine());
			}
			
			user.close();
			// user_s.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public boolean createUser(){
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\nEnter your mobile Number ");
			m = br.readLine();
			
			if(mob.contains(m)){
				System.out.println("\nUser already exist");
				return false;
			}
			
			System.out.println("\nEnter your name");
		    n = br.readLine();
			
			System.out.println("\nEnter your password");
			String p = br.readLine();
			
			String temp = m + "," + n + "," + p;
			
			File file = new File("user_details.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			
			bw.write(temp);
			bw.newLine();
			
			
			bw.close();
			
				
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return true;
	}
	
	public void display() throws Exception{
		
		
		new clear().go();
		
		// Scanner input = new Scanner(System.in);
		
		System.out.println("\nWelcome " + n);
		
		System.out.println("\nChoose from the following");
		System.out.println("\n1.Choose Channels");
		System.out.println("2.Show subscribe channels");
		System.out.println("3.Remove subscribe channels");
		System.out.println("4.exit");
		System.out.print("\nYour choice ");
		
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
				getSubscription();
				
				break;
				
			case 2:
				showSubscription();
				
				break;
				
			case 3:
				removeSubscription();
				break;
				
			case 4:
				System.exit(0);
				
			default:
				System.out.println("\nPlease enter your choice wisely\n");
		}
		
		
		System.out.println("\n\nPlease press enter...");
		
		System.in.read();

				
		display();
		
	}
	

	
	public void getSubscription() throws Exception{
		
		Channel ch = new Channel();
		// Scanner input = new Scanner(System.in);
		
		int max = ch.getSize();
		
		
		System.out.println("\nPlease enter the number of channels you want to choose from " + max + " channels.");
		int size = input.nextInt();
		
		if(size > max || size < 1){
			System.out.println("Please choose between 1 and " + max + " inclusive.");
			return;
		}
		
		ch.catalogue();
		
		System.out.println("\n\nEnter the index of " + size + " channels that your want to choose");
		
		// int temp[] = new int[size];
		
		for(int i = 0; i< size;++i){
			subscribe.add(input.nextInt());
		}
		
		// Channel ch = new Channel();
		
		System.out.println("\nHere is your total balance that you need to pay " + ch.getTotalBalance(subscribe));
		System.out.println("you're now  subscribed to " + subscribe.size() + " channels.");
		
		String file = m + ".txt";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
		
		Iterator it = subscribe.iterator();
		
		/* for(int i = 0;i<size;++i){
			bw.write(Integer.toString(temp[i]));
			bw.newLine();
		} */
		
		while(it.hasNext()){
			int temp = (int) it.next();
			bw.write( Integer.toString(temp));
			bw.newLine();
		}
		
		bw.close();
		
		
	}
	
	public void showSubscription() throws Exception{
		new clear().go();
		System.out.println("you are currently subscribe to following channels");
		
		String temp = m + ".txt";
		
		try{
			
			BufferedReader br = new BufferedReader(new FileReader(temp));
			
			String line;
			
			while((line=br.readLine())!=null){
				subscribe.add(Integer.parseInt(line));
			}
			
			br.close();
			
			Channel ch = new Channel();
			
			System.out.println("\nYou are subscribe to following channels");
			
			ch.user_subscription(subscribe);
			
		}catch(FileNotFoundException fex){
			System.out.println("It's look like you have not any subscription please first do it.");
			System.out.println("Press enter to go back");
			System.in.read();
			display();
		}
	}
	
	public void removeSubscription() throws Exception{
		
		if(subscribe.isEmpty()){
			System.out.println("It's look like you are not subscribe to any channel.");
			return;
		}
		
		showSubscription();
		
		int max = subscribe.size();
		
		System.out.println("\nPlease enter the number of channel you want to remove");
		int size = input.nextInt();
		
		if(size < 1 || size > max){
			System.out.println("Please enter the number between 1 and " + max + " inclusive.");
			return;
		}
		
		System.out.println("Enter the " + size + " channels hash code on extreme right");
		
		for(int i = 0 ;i<size;++i){
			int temp = input.nextInt();
			subscribe.remove(temp);
		}
		
		// System.out.println("Successfully Deleted");
		
		String file = m + ".txt";
		
		
		File file1 = new File(file);
		
		if(file1.delete()){
			System.out.println("\nSuccessfully deleted");
			file1.createNewFile();
		}
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file1,true));
		
		Iterator it = subscribe.iterator();
		
		/* for(int i = 0;i<size;++i){
			bw.write(Integer.toString(temp[i]));
			bw.newLine();
		} */
		
		while(it.hasNext()){
			int temp = (int) it.next();
			bw.write( Integer.toString(temp));
			bw.newLine();
		}
		
		bw.close();
		
	}
	
	public boolean login(String mob,String password){
		if(this.mob.contains(mob)){
			
			int index = this.mob.indexOf(mob);
			
			System.out.println(this.password.get(index));
			
			if(password.equals(this.password.get(index))){
				m = mob;
				n = this.name.get(index);
				
				
				//loading subscription done by users...
				
				String temp = m + ".txt";
				
				
				
				try{
					
					BufferedReader br = new BufferedReader(new FileReader(temp));
			
					String line;
			
					while((line=br.readLine())!=null){
							subscribe.add(Integer.parseInt(line));
					}
					
					br.close();
				}catch(FileNotFoundException fex){
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				
				return true;
			}else{
				System.out.println("Wrong password");
				return false;
			}
			
			
		}else{
			System.out.println("Sorry, user doesn't exist");
			return false;
		}
	}
	
	
}