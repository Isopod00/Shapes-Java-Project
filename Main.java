import java.util.*;

class Main {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    FractalDrawer drawer = new FractalDrawer();
    
    System.out.print("What type of shape should I draw? ");
    String type = scanner.nextLine();

    while(!type.equalsIgnoreCase("circle") && !type.equalsIgnoreCase("triangle") && !type.equalsIgnoreCase("rectangle")) {
      System.out.print("Please enter triangle, circle, or rectangle: ");
      type = scanner.nextLine();
    }

    System.out.print("How many levels to draw? ");
    int level = scanner.nextInt();
    
    drawer.drawFractal(type, level);

    scanner.close();
  }
}