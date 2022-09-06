/*student class with roll number, student name, marks in 3 subjects, total,percentage,remark(if percentage>50 pass otherwise fail, grade(if the remark is pass then 51-60 C, 61-70 B, 71-80 A, 81-100 S*/

class Student
{
	public int rollNo;
	public String sname;
	int mk1;
	int mk2;
	int mk3;
	int total;
	float avg;
	String remark;
	char grade;
	
	public Student(int rollNo,String sname,int mk1,int mk2,int mk3)
	{
		this.rollNo=rollNo;
		this.sname=sname;
		this.mk1=mk1;
		this.mk2=mk2;
		this.mk3=mk3;
		//this.calculateResult();
	}
	public void calculateResult()
	{
		this.total=this.mk1+this.mk2+this.mk3;
		this.avg=this.total/3.0f;
		if(avg>50)
		{
			this.remark="PASS";
			
		}
		else
		{
			this.remark="FAIL";
			this.grade=' ';
		}
	}
	public void displayStudentResult()
	{
		System.out.println("Roll Number  : "+this.rollNo);
	 	System.out.println("Student Name : "+this.sname);
		System.out.println("subject1 marks : "+this.mk1);
		System.out.println("subject2 marks : "+this.mk2);
		System.out.println("subject3 marks : "+this.mk3);
		System.out.println("Total marks : "+this.total);
		System.out.println("Percentage : "+this.avg);
		System.out.println("Remark : "+this.remark);
		System.out.println("Grade : "+this.grade);
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Student s1=new Student(1,"Ananya",67,66,56);
		Student s2=new Student(2,"Sneha",87,78,90);
		s1.displayStudentResult();
		s2.displayStudentResult();
	}
}
		

