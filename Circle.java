import java.awt.*;

class Circle {
  private double radius;
  private double xPos;
  private double yPos;
  private Color color;

  public Circle(double xPosition, double yPosition, double rad) {
    xPos = xPosition;
    yPos = yPosition;
    radius = rad;
  }

  public double calculatePerimeter() {
    return Math.PI * radius * 2.0;
  }

  public double calculateArea() {
    return 0.5 * Math.PI * radius;
  }

  public void setColor(Color col) {
    color = col;
  }

  public void setPos(double x, double y) {
    xPos = x;
    yPos = y;
  }

  public void setRadius(double rad) {
    radius = rad;
  }

  public Color getColor() {
    return color;
  }

  public double getXPos() {
    return xPos;
  }

  public double getYPos() {
    return yPos;
  }

  public double getRadius() {
    return radius;
  }
}