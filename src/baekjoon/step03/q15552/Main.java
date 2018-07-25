package baekjoon.step03.q15552;

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
// 빠른 A+B
// 메모리 제한, 시간 제한/ 8MB, 1초
// 86144 KB, 796 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Integer num = Integer.valueOf(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()) + "\n");
		}

		bw.close();
	}
}
