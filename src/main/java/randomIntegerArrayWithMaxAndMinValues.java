import java.util.Random;
public class randomIntegerArrayWithMaxAndMinValues {
    public static void main(String[] args) {
        int[] array= new int[10];
        Random rand = new Random();
        System.out.println("Array of 10 random integers: ");
        for(int i=0;i<10;i++){
            array[i]= rand.nextInt(1,10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int max=array[0];
        int min=array[0];
        for(int i=0;i<10;i++){
            if(array[i]>max){
                max=array[i];
            }
            else if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Maximum value "+max);
        System.out.println("Minumum Value "+min);
    }
}
