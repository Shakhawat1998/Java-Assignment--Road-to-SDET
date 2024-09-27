import java.util.Scanner;
public class findTwoLowestHeightsOfBabies {
    public static void main(String[] args) {
        int[] height = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Take height of babies as inputs(in cm): ");
        for(int i=0;i<10;i++){
            height[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(height[j]<height[i]){
                    int temp=height[i];
                    height[i]=height[j];
                    height[j]=temp;
                }
            }
        }
        System.out.println("the 2 lowest height of babies: "+height[0]+" "+height[1]);
    }
}
