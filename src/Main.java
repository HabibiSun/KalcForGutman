

import java.util.Scanner;

public class Main {
    protected static enum num_system{
        BIN, OCT, DEC, HEX

    }

    public static void main(String[] args) {
        StartCalculator();
    }
    public static void StartCalculator(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Выберите систему исчисления базового числа:" +
                "\n 1. Двоичная" +
                "\n 2. Восьмиричная" +
                "\n 3. Десятичная" +
                "\n 4. Шеснадцатиричная");
        try {
            String numSystem = inp.nextLine();
            if (!numSystem.matches("[1-4]")) StartCalculator();

            switch (numSystem){
                case "1":
                    System.out.println("Выбрана двоичная система");
                    StartCalculatingNumbers(num_system.BIN);
                    break;

                case "2":
                    System.out.println("Выбрана восьмиричная система");
                    StartCalculatingNumbers(num_system.OCT);
                    break;

                case "3":
                    System.out.println("Выбрана десятичная система");
                    StartCalculatingNumbers(num_system.DEC);
                    break;

                case "4":
                    System.out.println("Выбрана шестнадцатиричная система");
                    StartCalculatingNumbers(num_system.HEX);
                    break;

            }
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное число");
        }

    }
    public static void StartCalculatingNumbers(num_system sys){

        switch(sys){
            case BIN -> {if(!Binary.StartCalculation()) StartCalculator(); }
            case DEC -> {if(!Decimal.StartCalculation()) StartCalculator(); }
            case HEX -> {if(!Hexadecimal.StartCalculation()) StartCalculator(); }
            case OCT -> {if(!Octonar.StartCalculation()) StartCalculator(); }
        }
    }

    public static void AllResultsOut(int number){
        System.out.println();
        System.out.println("Результат:");
        Binary.ResultOut(number);
        Octonar.ResultOut(number);
        Decimal.ResultOut(number);
        Hexadecimal.ResultOut(number);
    }
}