/*student class with roll number, student name, course name, fees
display student details if course is java fees is 35000 and for oracle it is 28000*/
class Student
{
	public int rollNo;
	public String sname;
	public String course;
	public float fees;
	
	public Student(String course,String sname,int rollNo)
	{
		this.rollNo=rollNo;
		this.course=course;
		this.sname=sname;
		if(course=="JAVA")this.fees=35000;
		else this.fees=28000;
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
		Student s1=new Student("JAVA","Ananya",1);
		Student s2=new Student("ORACLE","Sneha",2);
		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}
}
		

