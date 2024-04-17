import java.util.Scanner;

public interface Operations {
    static int Sum(int a, int b) {
        return a + b;
    }

    static int Minus(int a, int b) {
        return a-b;
    }

    static int Umn(int a, int b) {
        return a*b;
    }

    static int Del(int a, int b) {
        if(b == 0) {
            System.out.println("Введен 0 при делении");
            return a;
        }
        return a/b;
    }




}
