package Arrays;

public class ReverseArray {


    public static void print(int input[]){

        for(int idx = 0; idx < input.length; idx++){
            System.out.print(input[idx] + " ");
        }
    }

    public static void reverseArray(int input[]){

        int len = input.length;
        int i = 0;
        int j = len - 1;

        while(i<=j){
            //Swap the ith and jth index values
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int input[] = {1, 4, 0, 4, 0, 5};
        reverseArray(input);
        print(input);

    }

}
