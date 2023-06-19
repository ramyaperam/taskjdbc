package corejava5.abstractclass;

public class Triangle extends Figure{
    Triangle(double dim1 ,double dim2){
        super(dim1,dim2);
    }
    double area()
    {
        System.out.println(" Area of triangle :");
        return (dim1*dim2)/2;
    }
}
