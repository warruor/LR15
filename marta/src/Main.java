import java.util.Scanner;

public class Main{

    static void main(){
        while(true){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер:");
        int choise = in.nextInt();
        switch (choise){
            case 1:
                System.out.println("Задание 1");
                System.out.println("Введите число 1:");
                int n1 = in.nextInt();
                System.out.println("Введите число 2:");
                int n2 = in.nextInt();
                System.out.println("Введите число 3:");
                int n3 = in.nextInt();
                System.out.println("Введите число 4:");
                int n4 = in.nextInt();
                System.out.println("Введите число 5:");
                int n5 = in.nextInt();
                int avg=(n1+n2+n3+n4+n5)/5;
                System.out.println("Среднее значение равно = " +avg);
                break;
            case 2:
                System.out.println("Задание 2");
                System.out.println("Введите сумму покупки:");
                double sum = in.nextDouble();
                double skidka;
                double finals;
                if (sum > 1000) {
                    skidka = 10;
                } else {
                    skidka = 5;
                }
                finals = sum - (sum * skidka / 100);
                System.out.println("Скидка: " + skidka + "Итого" + finals);
                break;
            case  3:
                System.out.println("Задание 3");
                String stars = "";
                /*for (int i = 0; i < 5; i++) {
                    stars = stars + "*";
                    System.out.println(stars);
                }*/
                int i=0;
                do{
                    stars = stars + "*";
                    System.out.println(stars);
                    i++;
                }
                while(i<5);
                break;

            default:
                in.close();
                break;
        }
}}}