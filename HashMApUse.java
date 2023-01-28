import java.util.HashMap;
import java.util.Map;

public class HashMApUse {
    public static void main(String[] args) {
        int arr[] =new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        countFre(arr,n);
    }
    static void countFre(int arr[], int n){
        HashMap<Integer, Integer> result =new HashMap<>();
        for(int i=0; i<n; i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1);
            }else{
                result.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> i: result.entrySet()){
            System.out.println(i.getKey()+ " " + i.getValue());
        }
    }
}
