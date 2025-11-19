package Constructor;

public class Sample2
{
    //example2: user defined without parameter

    //global variable
    int a;  //10
    int b;  //20

    //user defined constructor
//    use1: initialize global variable
    //use2: copy all the members of class into object
    Sample2()
    {
        a=10;
        b=20;
    }

    public void add()
    {
        System.out.println(a+b);
    }

    public void mult()
    {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Sample2 s2=new Sample2();
        s2.add();
        s2.mult();
    }
}
