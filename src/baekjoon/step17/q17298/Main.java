package baekjoon.step17.q17298;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수
 * <p>
 * 메모리, 시간 제한  - 512  MB,  1초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2021. 01. 29.
 */
public class Main {

    private static int n;
    private static int[] arr;
    private static Stack<Integer> stack;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }


        bw.flush();
        bw.close();
    }
}
