package baekjoon.step06.q2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 9. 30.
 */
// 숫자의  개수
// 메모리 제한, 시간 제한/ 128MB, 1초
// 9956 KB, 76 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        int c = Integer.valueOf(br.readLine());

        long result = a * b * c;

        int arr[] = new int[10];
        while (result != 0) {
            arr[(int) (result % 10)]++;
            result /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
