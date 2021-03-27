package pjatk;

public class pr_9 {
    public static void main(String[] args) {

        int[][] tab1 = new int[3][];
        tab1[0] = new int[3];
        tab1[1] = new int[3];
        tab1[2] = new int[3];

        tab1[0][0] = 21;
        tab1[0][1] = 43;
        tab1[0][2] = -2;

        tab1[1][0] = 23;
        tab1[1][1] = 32;
        tab1[1][2] = 31;

        tab1[2][0] = 25;
        tab1[2][1] = 2137;
        tab1[2][2] = 420;

        int[][] tab2 = new int[3][];
        tab2[0] = new int[3];
        tab2[1] = new int[3];
        tab2[2] = new int[3];

        tab2[0][0] = -289;
        tab2[0][1] = 123;
        tab2[0][2] = -12;

        tab2[1][0] = -89;
        tab2[1][1] = -2;
        tab2[1][2] = 9;

        tab2[2][0] = 8;
        tab2[2][1] = 2;
        tab2[2][2] = 3;
        int c = 0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++)
            {
                c=c+tab1[i][j]+tab2[i][j];
            }

        }
        System.out.println("Suma:"+ "\t" +c);


        }
}