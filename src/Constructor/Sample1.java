package Constructor;

import Methods.Sample2;

public class Sample1
{
    //example1- default constructor

    //default constructor
    //use to copy all the members of class into object
//    Sample1()
//    {
//
//    }

    public void m1()
    {
        System.out.println("running method m1");
    }

    public static void main(String[] args) {

        Sample1 s1=new Sample1();
        s1.m1();

//        4 Sample1();   -> constructor call
    }
}
