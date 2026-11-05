import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void main() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер:");
            int choise = in.nextInt();
            switch (choise) {
                case 1:
                    //Проверить, начинается ли строка с подстроки "Привет" (startsWith).
                    String str = new String("Привет всем писечкам");
                    boolean result = str.startsWith("Привет");
                    System.out.println("начинается с привет? " + result);
                    break;
                case 2:
                    //Проверить, является ли строка корректным номером телефона РБ
                    //(только цифры и + в начале).
                    System.out.println("Введите номер телефона");
                    String str1 = in.next();
                    boolean result1 = str1.startsWith("+375");
                    System.out.println("начинается с +375? " + result1);

                    /*
                     String text = in.next();
                    Pattern p = Pattern.compile("^\\+375(25|29|33|44)\\d{3}\\d{2}\\d{2}$");
                    Matcher m = p.matcher(text);
                    while (m.find()) {
                        System.out.println(m.group());
                    } */
                    break;
                case 3:
                    Employe[] employees = new Employe[3];
                    employees[0] = new Employe("Багрицевич Марта", 2500.0);
                    employees[1] = new Employe("Зенькович Дарья", 3200.5);
                    employees[2] = new Employe("Альховик Елизавета", 2800.75);
                    Reportt.generateReport(employees);
                    break;
                case 4:
                    //Дана строка 'aba abba abbba abbbba'. Найти и вывести строки, где по
                    //краям стоит 'a', а между ними – буква 'b' ровно 3 раза.
                    String text = "aba abba abbba abbbba";
                    Pattern p = Pattern.compile("a(b{3})a\\b");
                    Matcher m = p.matcher(text);

                    while (m.find()) {
                        System.out.println(m.group());
                    }
                    break;
                default:
                    in.close();
                    break;
            }
        }
    }
}