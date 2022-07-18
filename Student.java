package springdemo;

public class Student 

{
	private String studentName;
	private int id;
	
//	constructor injection	
public Student(int id, String studentName) {
	
	this.studentName = studentName;
	this.id = id;
}
 public void displaystudentInfo()
{
System.out.println("Student Name is:" +studentName+ "\nId is:" +id);
}
 
 //setters Injection
 
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public void setId(int id) {
	this.id = id;
}

}