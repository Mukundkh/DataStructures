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

    public static void intersectionOfArrays(int arr1[], int arr2[]){

        //Intersection of two arrays
        //Firstly created a freq hashmap for first array
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr1.length; i++){
            int val = arr1[i];
            if(map.containsKey(val)){
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }else{
                map.put(val, 1);
            }
        }
        //Checking the key values of created hashmap with the elements present in second array
        for(int i=0; i<arr2.length; i++){
            int val = arr2[i];
            if(map.containsKey(val)){
                System.out.print(val + " ");
            }
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3};
        int b[] = {1, 4, 5, 6, 7, 3};
        //unionOfArrays(a, b);
        intersectionOfArrays(a, b);
    }

}
