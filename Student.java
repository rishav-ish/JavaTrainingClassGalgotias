import java.io.*;

public class Student implements Serializable{
	
	private String enrolmentNumber;
	private String admissionNumber;
	private String name;
	private String email;
	private String mobNo;
	private String address;

	public  Student(){
	
	}

	

	public  Student(String en,String an,String name,String email,String mobNo,String address){
			   enrolmentNumber = en;
			   admissionNumber = an;
			   this.name = name;
			   this.email = email;
			   this.mobNo = mobNo;
			   this.address = address;
	}


	//starting of setter method.......!!

	public void setEnrolmentNumber(String enrolmentNumber){
			   this.enrolmentNumber = enrolmentNumber;
	}

	public void setAdmissionNumber(String admissionNumber){
			   this.admissionNumber = admissionNumber;
	}

	public void setName(String name){
			   this.name = name;
	}

	public void setEmail(String email){
			   this.email = email;
	}

	public void setMobNo(String mobNo){
			   this.mobNo = mobNo;
	}

	public void setAddress(String address){
			   this.address = address;
	}

	//ending of setter method......

	//starting of getter method....

	public String getEnrolmentNumber(){
		      return enrolmentNumber;
	}

	public String getAdmissionNumber(){
		      return admissionNumber;
	}

	public String getName(){
		      return name;
	}

	public String getEmail(){
		      return email;
	}

	public String getMobNo(){
		      return mobNo;
	}

	public String getAddress(){
		      return address;
	}

	//ending of getter method....!!
}
