package baekjoon.step03.q8393;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 25.
 */
// 합
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10052 KB, 76 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		
		int result =0;
		for(int i=1; i<=n; i++) {
			result +=i;
		}
		
		bw.write(String.valueOf(result));
		bw.close();
	}
}
