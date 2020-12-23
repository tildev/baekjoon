package baekjoon.step23.q2606;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 바이러스
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 11796 KB, 88 ms
 *
 * @author tildev
 * @data 2020. 12. 23.
 */
public class Main {
    public static int getVirusCnt(List<Integer>[] networkList, int computerNum) {
        LinkedList<Integer> queue = new LinkedList<>();
        int virusCnt = -1;
        boolean[] visited = new boolean[computerNum + 1];

        int num = 1;
        queue.add(num);
        visited[num] = true;

        while (queue.size() > 0) {
            num = queue.poll();
            virusCnt += 1;
            for (int network : networkList[num]) {
                if (!visited[network]) {
                    queue.add(network);
                    visited[network] = true;
                }
            }
        }
        return virusCnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 컴퓨터 개수
        int computerNum = Integer.parseInt(br.readLine());
        // 네트워크 연결 개수
        int connectionNum = Integer.parseInt(br.readLine());

        List<Integer>[] networkList = new ArrayList[computerNum + 1];
        for (int i = 1; i <= computerNum; i++) {
            networkList[i] = new ArrayList<>();
        }
        for (int i = 0; i < connectionNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            networkList[a].add(b);
            networkList[b].add(a);
        }

        int virusCnt = getVirusCnt(networkList, computerNum);

        bw.write(virusCnt + "\n");
        bw.flush();
        bw.close();
    }
}
