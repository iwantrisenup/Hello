package extendsTest;

public class SubClass extends SuperClass
{
    private int n;
    SubClass()
    {
        System.out.println("SubClass");
    }

    SubClass(int n)
    {
        super(300);
        System.out.println("SubClass(int n):"+n);

    }
}
