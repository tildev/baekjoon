package baekjoon.step04.q10952;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 04.
 */
// A + B - 5
// 메모리 제한, 시간 제한/ 256MB, 1초
// 14876 KB, 152 ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            
            if(a == 0 && b == 0)
            	break;
            bw.write((a + b) + "\n");
        }
        bw.close();
    }
}
