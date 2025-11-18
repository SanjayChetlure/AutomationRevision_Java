package ConditionalStatement;

public class Ex5_SwitchCase
{
    public static void main(String[] args) {

        int inp=8;

        switch (inp)
        {
            case 1: System.out.println("Today is mon");
                break;
            case 2: System.out.println("Today is Tue");
                break;
            case 3: System.out.println("Today is Wed");
                break;
            case 4: System.out.println("Today is Thr");
                break;
            case 5: System.out.println("Today is fri");
                break;
            case 6: System.out.println("Today is sat");
                break;
            case 7: System.out.println("Today is sun");
                break;
            default:
                System.out.println("wrong input");
        }


    }
}
