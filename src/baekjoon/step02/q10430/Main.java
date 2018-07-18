package baekjoon.step02.q10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 나머지
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10020 KB, 72 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		StringTokenizer st = new StringTokenizer(s, " ");

		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
	}
}
