public class PetDriver {
    public static void main() {
        Pet pam = new Pet("Pam", true);
        
        System.out.println(pam.getName());
        
        Pet mike = new Pet("Mike", true);
        
        System.out.println(pam.equals(mike));
        
        Pet.example();
        
    }
}