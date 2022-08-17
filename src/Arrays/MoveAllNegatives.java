package Arrays;

public class MoveAllNegatives {

    public static void print(int input[]){

        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    public static void moveAllNegativesBetter(int input[]){

        int left = 0;
        int right = input.length-1;

        while(left <= right){

            if(input[left] > 0 && input[right] > 0){
                right--;
            }
            else if(input[left] < 0 &&  input[right] < 0){
                left++;
            }
            else if(input[left] > 0 && input[right] < 0){
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;

                left++;
                right--;

            }else{
                left++;
            }

        }
    }

    public static int[] moveAllNegatives(int input[]){

        int len = input.length;
        int new_input[] = new int[input.length];
        int idx = 0;

        for(int i=0; i<len; i++){
            if(input[i] < 0){
                new_input[idx] = input[i];
                idx++;
            }
        }
        for(int i=0; i<input.length; i++){
            if(input[i] >= 0){
                new_input[idx] = input[i];
                idx++;
            }
        }
        return new_input;
    }


    public static void main(String[] args) {
        int input[] = {-1, 2, 10, -2, 2, 19, -100};
        int new_input[] = moveAllNegatives(input);
        print(new_input);
    }
}
