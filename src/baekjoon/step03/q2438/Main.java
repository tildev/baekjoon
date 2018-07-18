package baekjoon.step03.q2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 별찍기 - 1
// 메모리 제한, 시간 제한/ 128MB, 1초
// 11044 KB,	96 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		int n = Integer.valueOf(s);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append("*");
			System.out.println(sb.toString());
		}

	}
}
