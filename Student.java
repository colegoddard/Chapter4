public class Student {
    private int idNumber;
    private String name;
    private Student bestFriend;
    private Pet pete;
    private Hat baseball;
    
    public Student() {
        
    }
    
    public Student(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int combineIDs() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public Student makeStudent() {
        Student joe = new Student(this.idNumber, bestFriend.name);
        return joe;
    }
    
    public String toString() {
        return "The student name is: " + this.name;
    }
}
