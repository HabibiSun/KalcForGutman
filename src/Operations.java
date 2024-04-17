public interface Operations {
    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a-b;
    }

    static int umn(int a, int b) {
        return a*b;
    }

    static int del(int a, int b) {
        if(b == 0) {
            System.out.println("Введен 0 при делении");
            return a;
        }
        return a/b;
    }




}
