package Arrays;

import java.util.ArrayList;

public class KthMaxAndMin {

    //Print Array
    public static void print(int input[]){

        int len = input.length;
        for(int i=0; i<len; i++){
            System.out.print(input[i] + " ");
        }
    }

    //Sorting algorithm
    public static void bubbleSort(int input[]){
        int len = input.length;
        //len-1 rounds
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(input[j] > input[j+1]){
                    //Swap these two values
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int input[]){

        int len = input.length;
        // len - 1 rounds
        for(int i=0; i<len-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j=i; j<len; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
    }

    public static void insertionSort(int input[]){

        int len = input.length;
        for(int i=1; i<len; i++){

            int j = i-1;
            int temp = input[i];

            while(j >= 0 && input[j] > temp){
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
    }

    //The function works well in case of distinct elements

    public static ArrayList<Integer> kthMaxAndMinElement(int input[], int k){

        int len = input.length;
        bubbleSort(input);

        ArrayList<Integer> res = new ArrayList<>();
        int kthMax = input[len - k];
        int kthMin = input[k - 1];

        res.add(kthMax);
        res.add(kthMin);

        return res;
    }

    public static void main(String[] args) {

        int input[] = {-1, 2, 3, 4, 100, 5};
        ArrayList<Integer> ans = kthMaxAndMinElement(input, 2);
        System.out.println(ans);
    }

}
