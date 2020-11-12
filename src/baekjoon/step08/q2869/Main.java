package baekjoon.step08.q2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 달팽이는 올라가고 싶다
 * 메모리, 시간 제한  - 128 MB,   0.15초
 * 메모리, 시간      - 11532 KB, 80 MS
 *
 * @author tildev
 * @data 2020. 11. 12.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());

        if ((v - b) % (a - b) == 0) {
            System.out.println((v - b) / (a - b));
        } else {
            System.out.println((v - b) / (a - b) + 1);
        }
    }
}
