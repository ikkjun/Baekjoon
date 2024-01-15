package Conditional_Statement;

import java.util.Scanner;

public class No_2525 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        while(true) {
            int hour = scanner1.nextInt();
            int minute = scanner1.nextInt();
            int cookingTime = scanner2.nextInt();

            minute += cookingTime;
            while(minute<60) {
                if(minute>=60) {
                    hour++;
                    if(hour>=24) {
                        hour = 0;
                    }
                    minute -= 60;
                }
            }

            System.out.printf("%d %d", hour, minute);
        }
    }
}
