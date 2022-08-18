public class Triangle extends TwoDShape {
    String style;
    double area() {
        return width * height /2;
    }
    void showStyle() {
        System.out.println("El Triangle es del estil: " + style);
    }
}
