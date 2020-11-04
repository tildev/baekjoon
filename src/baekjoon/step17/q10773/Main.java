package baekjoon.step17.q10773;

import java.io.*;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author tildev
 * @data 2020. 11. 05.
 */
// 제로
// 메모리 제한, 시간 제한/ 256MB, 1초
// 24152 KB, 272 MS
public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        bw.write(stack.stream().collect(Collectors.summingInt(Integer::intValue)).toString());
        bw.flush();
        bw.close();
    }
}
