public class Model {
    double x1;
    double x2;
    int a;
    int b;
    int c;
    double D;   //D = b^2 - 4 * a * c


    public void Discr(){   //расчет дискриминанта
        D = b * b  - 4 * a * c;
        System.out.println("Дискриминант квадратного уравнения равен: " + D);
    }

    public void Urav(){
        System.out.println("Расчет дискриминанта для уравнения вида: " + a + "x^2 + " + b + "x + " + c);
    }

    public void RaschetX(){   //расчет иксов
        x1 = (Math.sqrt(D) - b)/(2 * a);
        x2 = (-Math.sqrt(D) - b)/(2 * a);

        System.out.println("Первый корень: " + x1);
        System.out.println("Второй корень: " + x2);
    }

}
