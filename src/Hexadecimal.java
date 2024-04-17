import java.util.Scanner;

public class Hexadecimal extends Calculations implements Operations {

    static boolean StartCalculation(){
        int number1 = InputNumber();
        num_operations operation = Calculations.InputOperation();
        int number2 = InputNumber();

        int answer = DoCalculation(number1,operation,number2);
        Main.AllResultsOut(answer);
        while (ContinueCalc()){ Main.AllResultsOut( DoCalculation(answer, InputOperation(), InputNumber()) ); }
        return false;
    }
    static int InputNumber(){
        System.out.println("Введите число в " + "HEX" + " формате");
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int number = 0;

        if(!x.matches("[0-9a-fA-F]+")) {
            System.out.println("Введено некорректное значение");
            return InputNumber();
        }
        number = Integer.parseInt(x,16);
        return number;
    }

    public static void ResultOut(int number){
        System.out.println("HEX  " + Integer.toHexString(number));
    }

}
