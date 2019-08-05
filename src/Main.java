public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,5);
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                Circle circle=(Circle)shape;
                System.out.println(circle);
            }else if (shape instanceof Rectangle){
                Rectangle rectangle=(Rectangle)shape;
                System.out.println(rectangle);
            }
        }

    }
}
