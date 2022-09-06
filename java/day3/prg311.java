/*student class with roll number, student name, course name, fees
display student details*/
class Student
{
	public int rollNo;
	public String sname;
	public String course;
	public float fees;
	
	public Student(String course,String sname,int rollNo,float fees)
	{
		this.rollNo=rollNo;
		this.course=course;
		this.fees=fees;
		this.sname=sname;
	}
	public void displayStudentDetails()
	{
		System.out.println("Roll Number  : "+this.rollNo);
	 	System.out.println("Student Name : "+this.sname);
		System.out.println("course  : "+this.course);
		System.out.println("fees : "+this.fees);
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Student s1=new Student("JAVA","Ananya",1,30000);
		Student s2=new Student("ORACLE","Sneha",2,25000.0f);
		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}
}
		

