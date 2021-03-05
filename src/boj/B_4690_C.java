package boj;

public class B_4690_C {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 6; i <= 100; i++) {
            int a = i * i * i;
            for (int j = 2; j <= i; j++) {
                int b = j * j * j;
                for (int k = j + 1; k <= i; k++) {
                    int c = k * k * k;
                    for (int l = k + 1; l <= i; l++) {
                        int d = l * l * l;
                        if(a == (b + c + d))
                            System.out.println(String.format("Cube = %d, Triple = (%d,%d,%d)", i, j, k, l));
                    }
                }
            }
        }

        long end = System.currentTimeMillis() - start;
        System.out.println("end = " + end + "ms");
    }

}