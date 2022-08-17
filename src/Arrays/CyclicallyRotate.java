package Arrays;

public class CyclicallyRotate {

    public static void cyclicallyRotate(int arr[]){

        int len = arr.length;
        System.out.print(arr[len-1] + " ");
        for(int i=0; i<len-1; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        cyclicallyRotate(arr);
    }
}
