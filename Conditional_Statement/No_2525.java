package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No_2525 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
//            int hour = scanner.nextInt();
//            int minute = scanner.nextInt();
//            int cookingTime = scanner.nextInt();
//
//            minute += cookingTime;
//            while(minute>=60) {
//                if(minute>=60) {
//                    hour++;
//                    if(hour>=24) {
//                        hour = 0;
//                    }
//                    minute -= 60;
//                }
//            }
//
//            System.out.printf("%d %d%n", hour, minute);
//        }
//        scanner.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int min = (B+C) % 60;
        int hou = (A + (B + C) / 60) % 24;

        System.out.println(hou + " " + min);

    }
}
