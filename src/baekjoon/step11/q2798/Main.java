package baekjoon.step11.q2798;

import java.io.*;

/**
 * 블랙잭
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2021. 01. 21.
 */
public class Main {
    private static int n, m;
    private static StringBuilder sb = new StringBuilder();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        bw.flush();
        bw.close();
    }
}
