package S1_Methods;
public class Sample3
{
    public static void main(String[] args)
    {
        System.out.println("hi");
        add(10,20);    // methodName()  method calling
        Sample4.sub(9,10);  //diffClassName.methodName()

//        className objName=new ClassName();
        Sample3 s3=new Sample3();
        s3.mult(5,6);

        Sample4 s4=new Sample4();
        s4.studentInfo("amol",101,'A',65.1f);
    }

    //static regular
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }

    //non-static regular
    public void mult(int a, int b)
    {
        System.out.println(a*b);
    }

}
