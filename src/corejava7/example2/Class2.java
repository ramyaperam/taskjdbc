package corejava7.example2;

public class Class2 implements Third{
    @Override
    public void second()
    {
        System.out.println("this is from interface second :");
    }

    @Override
    public void first() {
        System.out.println("this is from interface first :");
    }

    @Override
    public void third() {
        System.out.println("this is from interface third : ");
    }
}
