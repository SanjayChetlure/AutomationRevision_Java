package S1_ConditionalStatement;

public class Ex4_nestedIf
{
    public static void main(String[] args) {


        int shoppingAmt=300;

        //300>=500
        if (shoppingAmt>=500)              //outer if
        {
            System.out.println("no delivery charges applied");
            //2500>=2000
            if (shoppingAmt>2000)      //nested or inner if
            {
                System.out.println("Additional 10% discount");
            }
            else
            {
                System.out.println("no additional discount");
            }
        }
        else
        {
            System.out.println("Rs 50 delivery charges applied");
        }


    }
}
