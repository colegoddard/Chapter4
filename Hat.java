public class Hat {
   private String type;
   private boolean clean;
   
   public Hat(String typ, boolean cln) {
       this.type = typ;
       this.clean = cln;
   }
   
   public String getType() {
       return this.type;
    }
   
   public String toString() {
       return ("Type of hat: " + this.type);
   }
}