package baekjoon.step23.q2178;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 미로 탐색
 * 메모리, 시간 제한  - 192 MB,   1초
 * 메모리, 시간      - 12348 KB, 104 ms
 *
 * @author tildev
 * @data 2020. 12. 26.
 */
public class Main {

    private static final int[] xArr = {0, 0, -1, 1};
    private static final int[] yArr = {-1, 1, 0, 0};


    private static int n, m;

    private static int[][] matrix = new int[100][100];
    private static boolean[][] visited = new boolean[100][100];

    private static StringTokenizer st;

    private static LinkedList<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        bw.write(matrix[n - 1][m - 1] + "");

        bw.flush();
        bw.close();
    }

    /**
     * bfs
     *
     * @param x
     * @param y
     */
    private static void bfs(int x, int y) {
        if (visited[x][y]) {
            return;
        }
        queue.add(new int[]{x, y});

        while (queue.size() > 0) {
            int[] xy = queue.poll();
            visited[x][y] = true;

            int impX;
            int impY;
            for (int i = 0; i < 4; i++) {
                impX = xy[0] + xArr[i];
                impY = xy[1] + yArr[i];

                if (impX >= 0 && impY >= 0 && impX < n && impY < m) {
                    if (matrix[impX][impY] == 1 && (!visited[impX][impY])) {
                        queue.add(new int[]{impX, impY});
                        visited[impX][impY] = true;
                        matrix[impX][impY] = matrix[xy[0]][xy[1]] + 1;
                    }
                }
            }
        }
    }
}
