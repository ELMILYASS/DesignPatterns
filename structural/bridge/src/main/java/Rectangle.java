public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle .......");
        System.out.print("I'm a Rectangle");
        color.draw();
    }
}
