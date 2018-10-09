package baekjoon.step07.q2941;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 10. 9.
 */
// 크로아티아 알파벳
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10080 MB, 76 ms
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String replaceS[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        for (int i = 0; i < replaceS.length; i++) {
            s = s.replace(replaceS[i], "a");
        }
        System.out.println(s.length());
    }
}
