package proyecto_2;


import java.util.*;

class Student
{
  int studentID,semester;
  String studentName;
  String departmentName;
  Student(int studentID, String studentName, String departmentName, int semester) //constructor to intialize the variables
  {
   this.studentID = studentID;
   this.studentName = studentName;
   this.departmentName = departmentName;
   this.semester = semester;
  }
  void display()
  {
    System.out.println("StudentID is : "+studentID);
    System.out.println("Name od the Student is : "+studentName);
    System.out.println("Department Name is : "+departmentName);
    System.out.println("Semester Number is : "+semester);
  }
}



