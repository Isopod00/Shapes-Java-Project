import java.util.*;

class Main {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
      FractalDrawer drawer = new FractalDrawer();
      
      System.out.print("What type of shape should I draw? ");
      String type = scanner.nextLine();
      
      drawer.drawFractal(type);
  }
}