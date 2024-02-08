public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle .....");
        System.out.print("I'm a circle filled with color ");
        color.draw();
    }
}
