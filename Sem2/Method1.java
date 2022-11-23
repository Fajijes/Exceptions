
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;


public class Method1 {
    public static void main(String[] args) {
        System.out.println(inputFloat()); 
    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите дробное число, разделитель ',' (например: 1,234): ");
        while (!in.hasNextFloat()) {
            System.out.print("Не верный ввод повторите попытку: ");
            in.next();
        }
        return in.nextFloat();
    }
}

