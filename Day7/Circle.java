package Day7;

class Circle implements ColoredShape {
  private double radius;
  private String color;

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public String getColor() {
    return color;
  }

  public static void main(String[] args) {
    Circle Objcircle = new Circle(5.0, "Red");
    System.out.println("Area: " + Objcircle.area());
    System.out.println("Color: " + Objcircle.getColor());
  }
}
