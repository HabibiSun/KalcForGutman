import java.util.Scanner;

public abstract class Calculations {


    static int InputNumber(){
        return 0;
    }
    static Calculations.num_operations inputOperation()
    {

        System.out.println("Введите операцию: +-/*");
        Scanner input = new Scanner(System.in);
        char symbol_operation = input.next().charAt(0);

        switch(symbol_operation)
        {
            case'+':
                return num_operations.SUM;
            case'-':
                return num_operations.MINUS;
            case'/':
                return num_operations.DEL;
            case'*':
                return num_operations.UMN;
            default:
            {
                System.out.println("Неверное значение операции");
                return inputOperation();
            }
        }

    }
    static int doCalculation(int number1, num_operations operation, int number2) {

        int newNum = 0;

        switch (operation){
            case SUM: {
                newNum = Operations.sum(number1,number2);
                break;
            }
            case MINUS: {
                newNum = Operations.minus(number1,number2);
                break;
            }
            case UMN: {
                newNum = Operations.umn(number1,number2);
                break;
            }
            case DEL: {
                newNum = Operations.del(number1,number2);
            }
        }
        return newNum;
    }

    static boolean continueCalc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Продолжить?    Да / Нет");
        String x = input.nextLine();
        if (x.equals("Да")){
            return true;
        }
        else if(x.equals("Нет")) return false;
        return continueCalc();
    }

    enum num_operations{
        SUM, MINUS, UMN, DEL
    }
}
