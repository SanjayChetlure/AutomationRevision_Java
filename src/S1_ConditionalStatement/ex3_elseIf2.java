package S1_ConditionalStatement;
public class ex3_elseIf2
{
    public static void main(String[] args)
    {
        int marks=42;

        if (marks>=65)
        {
            System.out.println("Distinction");
        }
        else if (marks>=60 & marks<65)
        {
            System.out.println("1st class");
        }
        else if (marks>=50 & marks<60)
        {
            System.out.println("2nd class");
        }
        else if (marks>=35 & marks<50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
