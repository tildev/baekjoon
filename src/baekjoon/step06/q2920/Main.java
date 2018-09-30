package baekjoon.step06.q2920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @date 2018. 9. 30.
 */
// 음계
// 메모리 제한, 시간 제한/ 128MB, 1초
// 9932 KB, 80 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int arr[] = new int[8];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.valueOf(st.nextToken());
        }

        int gap = arr[0] - arr[1];
        if (arr[0] != 1 && arr[0] != 8) {
            System.out.println("mixed");
            return;
        }
        for (int j = 2; j < arr.length; j++) {
            if (arr[j - 1] - arr[j] != gap) {
                System.out.println("mixed");
                return;
            }
        }
        if (gap < 0) {
            System.out.println("ascending");
        } else {
            System.out.println("descending");
        }
    }
}
