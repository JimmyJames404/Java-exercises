package proyecto_2;

import java.util.Scanner;

public class main {
	public static void main(String args[])
	  {
	  Scanner sc = new Scanner(System.in);
	  int studentID,semester;
	  String studentName,departmentName;
	  int total_subjects,points_earned;
	  System.out.println("Please enter the student name : ");
	  studentName = sc.nextLine();
	  System.out.println("Please enter the studentID : ");
	  studentID = sc.nextInt();
	  sc.nextLine();  // to avoid the String escape. if we dont use this in wont allow us to take the departmentName at runtime
	  System.out.println("Please enter the student Department name : ");
	  departmentName = sc.nextLine();
	  System.out.println("Please enter the student current semester number : ");
	  semester = sc.nextInt();
	  System.out.println("Please enter total_subjects number : ");
	  total_subjects = sc.nextInt();
	  System.out.println("Please enter the student earned points : ");
	  points_earned = sc.nextInt();
	  boolean result = validateInputs(studentID,semester,total_subjects,points_earned);
	 
	  if(result)
	  {
	    Boleta reportObject = new Boleta(studentID,studentName,departmentName,semester,total_subjects,points_earned);
	    reportObject.gpaCalculator();
	    reportObject.cgpaCalculator();
	    reportObject.display();
	  }
	  else
	  System.out.println("Invalid Request");
	  }

	  // Below function is used to validate the inputs

	  public static boolean validateInputs(int studentID,int semester,int total_subjects,int points_earned)
	  {
	    int temp = Integer.toString(studentID).length();
	    if((semester>=1 || semester<=7) && (total_subjects>=1 || total_subjects<=7) && (points_earned>=1 || points_earned<=7) && (temp == 4))
	    {
	     
	      return true;
	    }
	    else
	    return false;
	  }
}
