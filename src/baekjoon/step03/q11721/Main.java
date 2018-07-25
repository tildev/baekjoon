package baekjoon.step03.q11721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author tildev
 * @data 2018. 7. 25.
 */
// 열 개씩 끊어 출력하기
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10108 KB, 76 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int sLen = s.length()/10;
		
		for(int i=0; i<sLen; i++) {
			bw.write(s.substring(i*10, (i+1)*10) + "\n");
		}
		bw.write(s.substring(sLen*10) + "\n");

		bw.close();
	}
}
