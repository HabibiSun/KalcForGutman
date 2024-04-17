

import java.util.Scanner;

public class Main {
    protected static enum num_system{
        BIN, OCT, DEC, HEX

    }

    public static void main(String[] args) {
        startCalculator();
    }
    public static void startCalculator(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Выберите систему исчисления базового числа:" +
                "\n 1. Двоичная" +
                "\n 2. Восьмиричная" +
                "\n 3. Десятичная" +
                "\n 4. Шеснадцатиричная");
        try {
            String numSystem = inp.nextLine();
            if (!numSystem.matches("[1-4]")) startCalculator();

            switch (numSystem){
                case "1":
                    System.out.println("Выбрана двоичная система");
                    startCalculatingNumbers(num_system.BIN);
                    break;

                case "2":
                    System.out.println("Выбрана восьмиричная система");
                    startCalculatingNumbers(num_system.OCT);
                    break;

                case "3":
                    System.out.println("Выбрана десятичная система");
                    startCalculatingNumbers(num_system.DEC);
                    break;

                case "4":
                    System.out.println("Выбрана шестнадцатиричная система");
                    startCalculatingNumbers(num_system.HEX);
                    break;

            }
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное число");
        }

    }
    public static void startCalculatingNumbers(num_system sys){

        switch(sys){
            case BIN -> {if(!Binary.startCalculation()) startCalculator(); }
            case DEC -> {if(!Decimal.startCalculation()) startCalculator(); }
            case HEX -> {if(!Hexadecimal.startCalculation()) startCalculator(); }
            case OCT -> {if(!Octonar.startCalculation()) startCalculator(); }
        }
    }

    public static void allResultsOut(int number){
        System.out.println();
        System.out.println("Результат:");
        Binary.resultOut(number);
        Octonar.resultOut(number);
        Decimal.resultOut(number);
        Hexadecimal.resultOut(number);
    }
}