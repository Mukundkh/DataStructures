package Arrays;

public class MoveAllNegatives {


    public static void print(int input[]){

        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    public static void moveAllNegatives(int input[]) {

        int count = 0;
        int negCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                input[count] = input[i];
                count++;

            }
        }

    }

    public static void main(String[] args) {
        int input[] = {1, 2, -1, 3, -2, 5, -100};
        moveAllNegatives(input);
        print(input);

    }
}
