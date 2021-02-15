package baekjoon.step16.q9375;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 패션왕 신해빈
 * <p>
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11908 KB, 80 ms
 * <p>
 * 경우의 수 문제
 * <p>
 * @author tildev
 * @data 2021. 02. 15.
 */
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int t, n, result;
    private static String mapKey;
    private static Map<String, Integer> map;

    public static void main(String[] args) throws IOException {
    	t = Integer.valueOf(br.readLine());
    	for (int i = 0; i < t; i++) {
	    	n = Integer.valueOf(br.readLine());
	    	map = new HashMap<>();
	    	for (int j = 0; j < n; j++) {
		    	st = new StringTokenizer(br.readLine());
		
		        st.nextToken();
		        mapKey = st.nextToken();
		        map.put(mapKey, map.getOrDefault(mapKey, 0) + 1);
	    	}
	    	
	    	result = 1;
	    	for (String key : map.keySet()) {
	    		result *= (map.get(key) + 1);
	    	}

	        bw.write((result - 1) + "\n");
    	}

        bw.flush();
        bw.close();
    }
}
