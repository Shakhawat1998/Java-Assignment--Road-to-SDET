import java.util.HashMap;
public class nonDuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers={1,1,2,3,1,2,4,5,6,5,4,7};
        HashMap<Integer,Integer>count = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(count.containsKey(numbers[i])){
                count.put(numbers[i],count.get(numbers[i])+1);
            }
            else{
                count.put(numbers[i],1);
            }
        }
        for (int i:count.keySet()){
            if(count.get(i)==1){
                System.out.print(i+" ");
            }
        }
    }
}
