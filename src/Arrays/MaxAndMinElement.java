package Arrays;
import java.util.ArrayList;
public class MaxAndMinElement {

    public static ArrayList<Integer> maximumAndMin(int input[]){

        int len = input.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<len; i++){

            if(input[i] > max){
                max = input[i];
            }

            if(input[i] < min){
                min = input[i];
            }

        }
        result.add(max);
        result.add(min);

        return result;
    }

    public static void main(String[] args) {

        int input[] = {-1, 0, 10, 3, -100, 4, 5};
        ArrayList<Integer> result = maximumAndMin(input);
        System.out.println(result);
    }
}
