public class Pet {
   private String name;
   private boolean alive;
   private static int numPets;
   
   public Pet(String nm, boolean alv) {
       this.name = nm;
       this.alive = alv;
       numPets++;
   }
   
   public String getName() {
       return this.name;
    }
   
   public String toString() {
       return "This pet's name is: " + this.name;
   }
   
   public boolean equals(Pet other) {
       if(this.name.equals(other.name)) {
           return true;
       }
       else {
           return false;
       }
   }
   
   public static void example() {
       System.out.print("This is in a static method!");
   }
}