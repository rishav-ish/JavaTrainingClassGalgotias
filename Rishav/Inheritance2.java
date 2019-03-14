
public class Inheritance1{
	public static void main(String[] args){
		try{

		      Student s1 = new Student("Rishav","D-2/174 West Kidwai nagar, New Delhi");
		      System.out.println(s1.getName());
		      System.out.println(s1.getAddress());

		      System.out.println(s1.toString());

		      
		      s1.addCourseGrade("Math",91);
		      s1.addCourseGrade("Phycis",100);

		      s1.printGrades();
		      
		      System.out.printf("%.2f",s1.getAverageGrade());
		}catch(Exception ex){
			System.out.println("Oops " + ex);
		}
	}
}

class Person{
	private String name;
	private String address;

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	
	public Person(String name,String address){
		this.name = name;
		this.address = address;
	}

	public String toString(){
		String temp = this.name + "(" + this.address +")";

		return temp;
	}
}

class Student extends Person{
	private int numCourses = 0;
	private String[] courses = new String[2];
	private int[] grades = new int[2];
	private int i =  0;

	public Student(String name,String address){
		super(name,address);
	}

	public void addCourseGrade(String course,int grade){
		courses [i] = course;
		grades[i] = grade;

		++i;
	}

	public void printGrades(){
		for(int i = 0;i<grades.length;++i)
				System.out.println("Grades -> " + grades[i]);

	}

	public double getAverageGrade(){
		int sum = 0;
		
		for(int i = 0;i<grades.length;++i)
				sum += grades[i];

		return (double)sum/grades.length;
	}

	
	public String toString(){
		String temp = "Student: " + super.getName() + "(" + super.getAddress() + ")";
		return temp;
	}

}


class Teacher extends Person{
	private int numCourses = 0;
	private String[] courses;
	
	public Teacher(String name,String address){
			super(name,address);
	}

	public boolean addCourse(String course){
		for(int i=0;i<courses.length;++i){
			if(course==courses[i])
					return false;
		}

		courses[courses.length] = course;

		return true;
	}

	public boolean removeCourse(String course){
		for(int i=0;i<courses.length;++i){
				if(course==courses[i]){
					courses[i] = null;
					return true;
				}
		}

		return false;
	}

	
	public String toString(){
		String temp = "Teacher: "  + super.getName() + "(" + super.getAddress() + ")";
		return temp;
	}
	
}