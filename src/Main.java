import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;
import static javax.swing.text.html.HTML.Tag.S;
import static javax.swing.text.html.HTML.Tag.SAMP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Task Math
//                  task 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Write number: ");
//        int scan = scanner.nextInt();
//        int number1 = (scan / 10) % 10;
//        int number2 = scan  % 10;
//        int sum = number1 + number2;
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number1 + " + " + number2 + " = " + sum);
//                 task  2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Write number: ");
//        int scan = scanner.nextInt();
//        int number = scan / 100;
//        int number1 = (scan / 10) % 10;
//        int number2 = scan  % 10;
//        int sum = number1 + number2 + number;
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number);
//        System.out.println(number1 + " + " + number2 + " + " + number + " = " + sum);
//                  task 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Write number: ");
//        int scan = scanner.nextInt();
//        int number1 = scan / 100;
//        int number2 = (scan / 10) % 10;
//        int number3 = scan  % 10;
//        System.out.println(number3 + " " + number2 + " " + number1);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bir syilom jaz: ");
//        String text = scanner.nextLine();
//        System.out.println(text);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch orundoo san jaz: ");
        int scan = scanner.nextInt();
        int number1 = scan / 100;
        int number2 = (scan / 10) % 10;
        int number3 = scan % 10;
        int sum = scan - 20;
        System.out.println(number3 + "" + number2 + "" + number1 + "" + sum);


    }
}