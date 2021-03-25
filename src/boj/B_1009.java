package boj;

import java.io.*;
import java.util.StringTokenizer;

public class B_1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        br.lines().forEachOrdered(line -> {
            StringTokenizer st = new StringTokenizer(line);

            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

//                System.out.printf("a: %d, b: %d\n", a, b);

                double dataCount = Math.pow(a, b);
                System.out.println("dataCount = " + dataCount);
            }
        });

        bw.flush();
        bw.close();
        br.close();
    }

}