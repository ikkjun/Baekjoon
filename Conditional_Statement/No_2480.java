package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(calcPrize(a, b, c));
    }
    public static int calcPrize(int a, int b, int c) {
        // 같은 눈 3개
        if(a == b && b == c)
            return 10000 + a * 1000;

        // 같은 눈 2개
        else if((a==b)&&a!=c)
            return 1000 + a * 100;
        else if((b==c)&&b!=a)
            return 1000 + b * 100;
        else if((a==c)&&c!=b)
            return 1000 + c * 100;
        else
            return (a>b&&a>c?a:b>a&&b>c?b:c) * 100;
    }
}
