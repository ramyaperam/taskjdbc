package corejava5.abstractclass;

public class FigureMain {
    public static void main(String [] args)
    {
        rectangle rectangle = new rectangle(10,8);
        Triangle triangle = new Triangle(10,8);
        Figure figure ;
        figure = rectangle ;
        System.out.println(figure.area());
        figure = triangle ;
        System.out.println(figure.area());

    }
}
