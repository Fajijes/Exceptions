package Sem1.Task1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Method1 {
    public static void main(String[] args) {
        System.out.println(Divide(5, 0));
    }

    public static int Divide(int a, int b) {
        return a / b;
    }

}