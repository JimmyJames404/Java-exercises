package proyecto_2;

public class Boleta {
	class Boleta extends Student  //extending the student class using Inheritance concept
	{
	  int total_subjects,points_earned;
	  float gpa,cgpa;
	  StudentReportCard(int studentID,String studentName,String departmentName,int semester, int total_subjects, int points_earned)
	  {
	    super(studentID,studentName,departmentName,semester); //reusing the parent class variables in the child class 
	   this.total_subjects = total_subjects;
	    this.points_earned = points_earned;
	  }
	  public float gpaCalculator()
	  {
	    gpa = (total_subjects*points_earned)/7;
	    return 0;
	    
	  }
	  public float cgpaCalculator()
	  {
	    cgpa = gpa/semester;
	    return 0;
	  }
	  void display()
	  {
	   super.display();  // reusing the parent method in child class
	   System.out.println("GPA of the current sem : "+gpa);
	   System.out.println("Total CGPA as of now : "+cgpa);
	  }
}
