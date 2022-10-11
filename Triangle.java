import java.awt.*;

class Triangle {
  private double width;
  private double height;
  private double xPos;
  private double yPos;
  private Color color;

  public Triangle(double xPosition, double yPosition, double width, double height) {
    xPos = xPosition;
    yPos = yPosition;
    this.width = width;
    this.height = height;
  }

  public double calculatePerimeter() {
    return width + 2 * (Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2)));
  }

  public double calculateArea() {
    return 0.5 * width * height;
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