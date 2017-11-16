public class Car {
   private String model;
   private int year;
   
   public Car(String md, int yr) {
       this.model = md;
       this.year = yr;
   }
   
   public String toString() {
       return "This is a " + model + " that was built in " + year;
   }
   
   public boolean equal(Car other) {
       if(this.model.equals(other.model) && this.year == other.year) {
           return true;
       }
       else {
           return false;
       }
   }
}