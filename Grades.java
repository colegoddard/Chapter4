// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        //create student2, "Mike"
        Student student2 = new Student("Mike"); 
        //input grades for Mary
        System.out.println("What grades did Mary get on test 1 and test 2?");
        student1.inputGrades();
        //print average for Mary
        System.out.println(student1.getAverage());
        //input grades for Mike
        System.out.println("What grades did Mike get on test 1 and test 2?");
        student2.inputGrades();
        //print average for Mike
        System.out.println(student2.getAverage());
    }
}