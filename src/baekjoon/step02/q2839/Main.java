package baekjoon.step02.q2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @data 2018. 7. 2.
 */
// 설탕 배달
// 메모리 제한, 시간 제한/ 128MB, 1초
// 9976 KB, 72 MS
public class Main {
	private static final int BAG_5KG = 5;
	private static final int BAG_3KG = 3;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.valueOf(s);

		int count = 0;

		while (true) {
			if (n % BAG_5KG == 0) {
				count += (n / BAG_5KG);
				break;
			} else if (n < 0) {
				count = -1;
				break;
			}
			count += 1;
			n -= BAG_3KG;
		}
		System.out.println(count);
	}
}
