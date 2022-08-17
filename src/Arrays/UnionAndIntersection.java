package Arrays;
import java.util.HashMap;
public class UnionAndIntersection {

    public static void unionOfArrays(int arr1[], int arr2[]){

        int n_arr[] = new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++){
            n_arr[i] = arr1[i];
        }
        int idx= 0;
        for(int j=arr1.length; j<n_arr.length; j++){
            n_arr[j] = arr2[idx];
            idx++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n_arr.length; i++){
            int val = n_arr[i];
            if(map.containsKey(val)){
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }else{
                map.put(val, 1);
            }
        }
        for(int key: map.keySet()){
            System.out.print(key + " ");
        }
    }

    public static void main(String[] args) {

        int a[] = {0, 1, 1, 3, 3};
        int b[] = {2,1,2};
        unionOfArrays(a, b);
    }

}
