package baekjoon.step09.q2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * @author tildev
 * @date 2019. 1. 27.
 */
// 수 정렬하기
// 메모리 제한, 시간 제한/ 128MB, 1초
// 13580 KB, 88 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine());

        int arr[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int a : arr) {
            bw.write(a + "\n");
        }
        bw.close();
    }
}