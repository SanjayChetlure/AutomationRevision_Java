package Constructor;

public class Sample3
{
    //example2: user defined with parameter

    //global variable
    int a;  //5 10
    int b;  //6 20

    //user defined constructor
//    use1: initialize global variable
    //use2: copy all the members of class into object
    Sample3(int num1, int num2)
    {
        a=num1;       // globalVariable=localVariable assign local variable info into global variable
        b=num2;
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
        Sample3 s3=new Sample3(5,6);
        s3.add();
        s3.mult();

        Sample3 s4=new Sample3(10,20);
        s4.add();
        s4.mult();


    }
}
