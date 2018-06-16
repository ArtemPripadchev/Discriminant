import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Model mod = new Model();
        //Расчет Дискриминанта
        //mod.x = 3;
        //mod.y = 4;
        //mod.Summ();
        // Дискриминант выражения ax^2 + bx + c
        //Вводим переменные выражения a, b и c

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a:");
        mod.a = in.nextInt();
        System.out.print("Введите значение b:");
        mod.b = in.nextInt();
        System.out.print("Введите значение c:");
        mod.c = in.nextInt();
        mod.Urav();
        //mod.b = 8;
        //mod.a = 4;
        //mod.c = 3;
        mod.Discr();

        if (mod.D < 0){
            System.out.println("Отрицательный дискриминант! Вещественных корней нет. Проверяй значения a, b и c!");
        }
        else if (mod.D == 0){
            System.out.println("Дискриминант равен 0! Уравнение имеет один вещественный корень.");
        }
        else {
            System.out.println("Положительный дискриминант! Уравнение имеет два вещественных корня.");
            mod.RaschetX();
        }
    }
}
