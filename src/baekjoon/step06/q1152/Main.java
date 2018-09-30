package baekjoon.step06.q1152;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @date 2018. 9. 30.
 */
// 단어의 개수
// 메모리 제한, 시간 제한/ 128MB, 1초
// 20164 KB, 176 ms
public class Main {
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        StringTokenizer st = new StringTokenizer(s, " ");
        
        System.out.println(st.countTokens());
    }
}
