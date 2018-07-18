package baekjoon.step02.q1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// A/B
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10164 KB, 72 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		StringTokenizer st = new StringTokenizer(s, " ");

		System.out.println(Double.valueOf(st.nextToken()) / Double.valueOf(st.nextToken()));

	}
}
