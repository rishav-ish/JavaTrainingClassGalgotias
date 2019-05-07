import java.io.*;

public class TestPerson{
	
	public static void main(String[] args){
		
		Person p1 = new Person("1613101574","Rishav");

		try{
			
		    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("person.ser"));

		    os.writeObject(p1);

		    os.close();
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
		p1 = null;

		try{
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("person.ser"));

			p1 = (Person) oi.readObject();

			oi.close();

			System.out.println(p1.getName());
			System.out.println(p1.getId());
		}catch(Exception ex){
			
			ex.printStackTrace();
		}

	}
}