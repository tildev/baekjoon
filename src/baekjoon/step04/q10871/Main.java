package baekjoon.step04.q10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 30.
 */
// X보다 작은 수
// 메모리 제한, 시간 제한/ 256MB, 1초
// 12156 KB, 120 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n = Integer.valueOf(st.nextToken());
		int x = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine()," ");

		StringBuilder sb = new StringBuilder();
		
		int impI;
		for (int i = 0; i < n; i++) {
			impI = Integer.valueOf(st.nextToken());
			if (impI < x) {
				sb.append(impI).append(" ");
			}
		}

		bw.write(sb.toString().trim());
		bw.close();
	}
}
