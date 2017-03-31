/*package report_card;
import java.util.Scanner;

public class StudentRecord {
	
	String stu_name,sub_name;
	int roll_no,max_marks,marks_obtained,maths,science,hindi,english,computer_science,total_marks,marks_percentage,no_of_subjects=5;
	
	public StudentRecord( StudentRecord[] s) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			
			System.out.println("Enter the name of student:");
		s[i].stu_name=sc.next();
		
		System.out.println("Enter the roll no of students:");
		s[i].roll_no=sc.nextInt();
		
		System.out.println("Enter the marks in maths of students:");
		s[i].maths=sc.nextInt();
		
		System.out.println("Enter the marks in science of students:");
		s[i].science=sc.nextInt();
		
		System.out.println("Enter the marks in hindi of students:");
		s[i].hindi=sc.nextInt();
		
		System.out.println("Enter the marks in english of students:");
		s[i].english=sc.nextInt();
		
		System.out.println("Enter the marks in computer science of students:");
		s[i].computer_science=sc.nextInt();
		}
		//s[3].ComputeResult(s);
	}
	
	public void ComputeResult(StudentRecord cr[])
	{
			for(int p=0;p<3;p++)
			{	cr[p]=new StudentRecord(cr);
				cr[p].total_marks=cr[p].maths+cr[p].science+cr[p].hindi+cr[p].english+cr[p].computer_science;
				cr[p].marks_percentage = (cr[p].total_marks*100)/no_of_subjects;
		
				
			
			
		
			
				System.out.println("Subjects:  "+ " Maths " +" Science "+" Hindi "+" English "+" Computer Science ");
				System.out.println("              "+cr[p].maths+"   "+cr[p].science+"   "+cr[p].hindi+"   "+cr[p].english+"   "+cr[p].computer_science);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord stu[] = new StudentRecord[3];
		
		
		for(int i=0;i<3;i++)
		{
			stu[i]=new StudentRecord(stu[i]);
			
			
			stu[i].ComputeResult(stu);
		}
		
			
		//stu[0].StudentRecord( stu[0]);
		//System.out.println("maths:" +stu[0].maths);
		
	}



	

}
