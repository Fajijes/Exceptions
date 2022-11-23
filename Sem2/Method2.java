// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;


public class Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        try {
            System.out.println(inputString(scanner));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String inputString(Scanner scanner) throws Exception  {
        String result;
        result = scanner.nextLine();
        if (result.equals("")) {
            throw new Exception("Нельзя вводить пустые строки");
        }
        return result;
    }
}
