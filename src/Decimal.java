import java.util.Scanner;

public class Decimal extends Calculations implements Operations{

    static boolean startCalculation(){
        int number1 = inputNumber();
        num_operations operation = Calculations.inputOperation();
        int number2 = inputNumber();

        int answer = doCalculation(number1,operation,number2);
        Main.allResultsOut(answer);
        while (continueCalc()){ Main.allResultsOut( doCalculation(answer, inputOperation(), inputNumber()) ); }
        return false;
    }
    static int inputNumber(){
        System.out.println("Введите число в " + "DEC" + " формате");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int number = 0;

        if(!x.matches("\\d+")) {
            System.out.println("Введено некорректное значение");
            return inputNumber();
        }
        number = Integer.parseInt(x,10);
        return number;
    }

    public static void resultOut(int number){
        System.out.println("DEC  " + number);
    }


}
