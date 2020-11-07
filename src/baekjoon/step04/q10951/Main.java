package baekjoon.step04.q10951;

import java.util.Scanner;

/**
 * A + B - 4
 * 메모리, 시간 제한  - 256 MB,   1초
 * 메모리, 시간      - 18540 KB, 256 MS
 *
 * @author tildev
 * @data 2020. 11. 07.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println(a + b);
        }
    }
}
