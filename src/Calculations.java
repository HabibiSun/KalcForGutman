import java.util.Scanner;

public abstract class Calculations {


    static int InputNumber(){
        return 0;
    }
    static Calculations.num_operations InputOperation()
    {

        System.out.println("Введите операцию: +-/* или return для возврата");
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
                return InputOperation();
            }
        }

    }
    static int DoCalculation(int number1, num_operations operation, int number2) {

        int newNum = 0;

        switch (operation){
            case SUM: {
                newNum = Operations.Sum(number1,number2);
                break;
            }
            case MINUS: {
                newNum = Operations.Minus(number1,number2);
                break;
            }
            case UMN: {
                newNum = Operations.Umn(number1,number2);
                break;
            }
            case DEL: {
                newNum = Operations.Del(number1,number2);
            }
        }
        return newNum;
    }

    static boolean ContinueCalc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Продолжить?    Да / Нет");
        String x = input.nextLine();
        if (x.equals("Да")){
            return true;
        }
        else if(x.equals("Нет")) return false;
        return ContinueCalc();
    }

    enum num_operations{
        SUM, MINUS, UMN, DEL
    }
}
