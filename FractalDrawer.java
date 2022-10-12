// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor

    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type, int level) {
      int height = 1080;
      int width = 1920;
      Canvas screen = new Canvas(height, width);
      if (type.equalsIgnoreCase("triangle")) {
        drawTriangleFractal(100, 100, width/2, height/2, new Color(0, 0, 255), screen, level);
      } else if(type.equalsIgnoreCase("rectangle")) {
        drawRectangleFractal(100, 100, width/2, height/2, new Color(0, 0, 255), screen, level);
      } else if(type.equalsIgnoreCase("circle")) {
        drawCircleFractal(100, width/2, height/2, new Color(0, 0, 255), screen, level);
      }
      return totalArea;
    }

    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
      Triangle tri = new Triangle(x, y, width, height);
      tri.setColor(c);
      can.drawShape(tri);
      level--;
      totalArea += tri.calculateArea();
      if(level != 0) {
        drawTriangleFractal(width/2, height/2, x+width, y, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawTriangleFractal(width/2, height/2, x+width/4, y-height, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawTriangleFractal(width/2, height/2, x-width/2, y, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
      }
    }

    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
      Circle circ = new Circle(x, y, radius);
      circ.setColor(c);
      can.drawShape(circ);
      level--;
      totalArea += circ.calculateArea();
      if(level != 0) {
        drawCircleFractal(radius/2, x-radius, y, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawCircleFractal(radius/2, x+radius, y, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawCircleFractal(radius/2, x, y+radius, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawCircleFractal(radius/2, x, y-radius, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
      }
    }

    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
      Rectangle rect = new Rectangle(x, y, width, height);
      rect.setColor(c);
      can.drawShape(rect);
      level--;
      totalArea += rect.calculateArea();
      if(level != 0) {
        drawRectangleFractal(width/2, height/2, x+width, y+height, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawRectangleFractal(width/2, height/2, x+width, y-height/2, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawRectangleFractal(width/2, height/2, x-width/2, y-height/2, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
        drawRectangleFractal(width/2, height/2, x-width/2, y+height, new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)), can, level);
    }
}
}