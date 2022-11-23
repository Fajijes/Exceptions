// Исправьте данный код

public class Correction2 {
    public static void main(String[] args) {        //Можно удалить прокидывания throw Exception 
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            } 
        catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на 0");   // Можно добавить арифметическое исключение (деление на 0)
        } 
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!" + ex);
        } 
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } 
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {     // Можно убрать throws FileNotFoundException, если значения null примем считать за 0
        if (a == null) {
            a = 0;
        }
        if (b == null) {
            b = 0;
        }
        System.out.println(a + b);
    }
}
