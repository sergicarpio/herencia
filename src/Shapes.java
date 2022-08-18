public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style= "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style= "outlined";

        System.out.println("Informació del triangle T1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area del triangle t1: " + t1.area());

        System.out.println("Informació del triangle T2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area del triangle t2: " + t2.area());

    }
}
