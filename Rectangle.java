import java.awt.*;

class Rectangle {
  private double width;
  private double height;
  private double xPos;
  private double yPos;
  private Color color;

  public Rectangle(double xPosition, double yPosition, double width, double height) {
    xPos = xPosition;
    yPos = yPosition;
    this.width = width;
    this.height = height;
  }

  public double calculatePerimeter() {
    return (2*width + 2*height);
  }

  public double calculateArea() {
    return (width*height);
  }

  public void setColor(Color col) {
    color = col;
  }

  public void setPos(double x, double y) {
    xPos = x;
    yPos = y;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
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

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }
}