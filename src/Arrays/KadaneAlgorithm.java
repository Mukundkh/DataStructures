package Arrays;

public class KadaneAlgorithm {

    public static int maximumSumSubArray(int input[]){

        int len = input.length;
        int maxSum = 0;
        int currentSum = 0;
        for(int i=0; i<len; i++){

            currentSum = currentSum + input[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {5, -4, -2, 6, -1};
        System.out.println(maximumSumSubArray(arr));
    }
}
