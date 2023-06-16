import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Объявляете переменные для входных данных и
           параметров программы: одну для хранения
           стоимости билета, другую для хранения количества
           рублей для одной бонусной мили.
           Рассчитываете количество бонусных миль, используя
           значения заведённых переменных. Ответ сохраняете в
           новую переменную и выводите на экран */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену билета: ");

        int cost = scanner.nextInt();
        int costForOneMile = 20;

        int miles = cost / costForOneMile;

        System.out.println("Количество миль: " + miles + " миль");




    }
}
