package pjatk;

public class ThirdTask {
    public static void main(String[] args) {

        int[][] array1 = {{23,34,22},{15,6,24},{3,4,5}};
        int[][] array2 = {{50,2,3},{3,4,5},{3,4,5}};

        int sum = 0;
        for (int counter1 = 0; counter1 < array1.length; counter1++)
        {
            for (int counter2 = 0; counter2 < array1[counter1].length; counter2++)
            {
                sum = sum + array1 [counter1][counter2] + array2[counter1][counter2];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
