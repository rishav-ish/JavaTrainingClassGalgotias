import java.io.*;


public class SerializeStudent{
	
	public static void main(String[] args){
		
	

	Student s1 = new Student();
	
	s1.setEnrolmentNumber("1613101574");
	s1.setAdmissionNumber("16SCSE101436");
	s1.setName("Rishav");
	s1.setEmail("rishavkumar446@gmail.com");
	s1.setMobNo("9205966219");
	s1.setAddress("Earth");

	Student s2 = new Student("1613101421","16SCSE101331","Bhanu Bhaskar","bhanubhaskar1@gmail.com","9910418679","hostel, greater noida");
	
	try{
	    
	    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.ser"));
	
	    oos.writeObject(s1);
	    oos.writeObject(s2);

	    oos.close();
	}catch(IOException ex){
		ex.printStackTrace();
	}

	s1 = null;
	s2 = null;

	try{
	     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.ser"));
		
	     s1 = (Student) ois.readObject();
	     s2 = (Student) ois.readObject();

	     ois.close();
  	}catch(Exception ex){
		ex.printStackTrace();
	}

	//information about first object..... 
	  
	System.out.println("\nInformation about first object\n");
	System.out.println("Name -> " + s1.getName());
	System.out.println("Enrolment Number -> " + s1.getEnrolmentNumber());
	System.out.println("Admission Number -> " + s1.getAdmissionNumber());
	System.out.println("Email Id -> " + s1.getEmail());
	System.out.println("Mobile Number -> " + s1.getMobNo());
	System.out.println("Address -> " + s1.getAddress());

	//information about second object.....

	System.out.println("\nInformation about second object\n");
	System.out.println("Name -> " + s2.getName());
	System.out.println("Enrolment Number -> " + s2.getEnrolmentNumber());
	System.out.println("Admission Number -> " + s2.getAdmissionNumber());
	System.out.println("Email Id -> " + s2.getEmail());
	System.out.println("Mobile Number -> " + s2.getMobNo());
	System.out.println("Address -> " + s2.getAddress());
	
	}

}
	