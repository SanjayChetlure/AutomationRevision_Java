package Methods;

public class Sample1
{
    public static void main(String[] args)
    {
        System.out.println("hi");
        m1();     // methodName()  method calling
        Sample2.m2();       //diffClassName.methodName()

//        className objName=new ClassName();
        Sample1 s1=new Sample1();
        s1.m3();


        Sample2 s2=new Sample2();
        s2.m4();
    }

    //static regular
    public static void m1()
    {
        System.out.println("running static regular method-m1");
    }

    //non-static regular
    public void m3()
    {
        System.out.println("running non-static regular method-m3");
    }



}
