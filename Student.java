// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private int testOneScore;
    private int testTwoScore;
    
    Scanner scan = new Scanner(System.in);
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor'
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        testOneScore = scan.nextInt();
        testTwoScore = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage()
    {
        //add body of getAverage
        double average = (testOneScore + testTwoScore)/2;
        return average;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public void getName()
    {
        //add body of getName
        name = scan.next();
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void printName()
    {
        //add body of printName
    }
}
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          