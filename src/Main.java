import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите число>");
        double x = Input.nextDouble();
        if (x < 1 && x > -1)
        {
            double result = 0;
            for (int i = 0; i < x; i++)
            {
                result += Math.pow(x, i * 2 + 1) / 2 * i + 1;
            }
            System.out.println(result * 2);
        }
        else System.out.println("Вы ввели число не входящее в диапозон");
    }
}