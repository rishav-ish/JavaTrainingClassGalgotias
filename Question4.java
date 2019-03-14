
import java.io.*;

public class Question4{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			char[] str = br.readLine().toCharArray();
			
			char state = 'A';   //initial state...
			
			/*
				we have 4 state
				in which there is one final state 'D'
				
				and one death state name 'E'
				
				so the string that get in the death state
				is in-valid
				
				simple automata concept...
			*/
			
			for(int i = 0;i<str.length;++i){
				if(state == 'A' && str[i] == 'b'){
					state = 'E';
					break;
				}
				else if(state == 'A' && str[i] == 'a') state = 'B';
				else if(state == 'B' && str[i] == 'a') continue;
				else if(state == 'B' && str[i] == 'b') state = 'C';
				else if(state == 'C' && str[i] == 'a'){
						state = 'E';
						break;
				}
				else if(state == 'C' && str[i] == 'b') state = 'D';
				else if(state == 'D' && str[i] == 'a') state = 'B';
				else if(state == 'D' && str[i] == 'b'){
					state = 'E';
					break;
				}
			}
			
			if(state == 'E')
				System.out.println(-1);
			else	
				System.out.println(1);
				
				
			
							
			
		}catch(Exception ex){
			System.out.println("There is something wrong");
			System.out.println("ex");
		}
	}
}