package pjatk;

public class FourthTask {
    public static int plus_sum(int[] array){
        int sum = 0;
        for(int counter = 0; counter < array.length; counter++){
            if (array[counter] > 0){
                sum = sum + array[counter];
                
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {1,3,2};
        System.out.println(plus_sum(array));
    }
}
