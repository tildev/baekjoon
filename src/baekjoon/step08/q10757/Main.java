package baekjoon.step08.q10757;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 큰 수 A+B
 * <p>
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      - 15180 KB, 196 ms
 *
 * @author tildev
 * @data 2020. 01. 16.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        bw.write(a.add(b) + "");

        bw.flush();
        bw.close();
    }
}
