package days;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели на английском: ");
        Day day = Day.valueOf(scanner.nextLine());

            switch (day){
                case Monday: System.out.println("Понедельник"); break;
                case Tuesday: System.out.println("Вторник"); break;
                case Wednesday: System.out.println("Среда"); break;
                case Thursday: System.out.println("Четверг"); break;
                case Friday: System.out.println("Пятница"); break;
                case Saturday: System.out.println("Суббота"); break;
                case Sunday: System.out.println("Воскресенье"); break;

            }
    }
}
