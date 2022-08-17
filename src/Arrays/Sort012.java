package Arrays;

public class Sort012 {

    public static void print(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort012(int input[]) {

        int len = input.length;

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < len; i++) {
            if (input[i] == 0) {
                countZero++;
            } else if (input[i] == 1) {
                countOne++;
            }
        }

        //Insert the 0, 1, 2 using the frequency of the numbers
        for(int i=0; i<input.length; i++){
            if(i < countZero){
                input[i] = 0;
            }
            else if(i >= countZero && i<(countZero + countOne)){
                input[i] = 1;
            }else{
                input[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,2,2,1,0,1};
        sort012(arr);
        print(arr);
    }
}
