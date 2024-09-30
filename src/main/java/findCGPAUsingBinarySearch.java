import java.util.Arrays;
import java.util.Scanner;
public class findCGPAUsingBinarySearch {
    public static void main(String[] args) {
        double[] cgpa = {3.50,3.52,3.43,3.63,3.48,3.32,3.30,3.60,3.86};
        Arrays.sort(cgpa);
        System.out.println("CGPAs after sorting in ascending order: ");
        for (double i:cgpa){
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter CGPA to search: ");
        double targetCGPA= scanner.nextDouble();
        int low=0,high=cgpa.length;
        int mid;
        boolean flag=false;
        int index=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(cgpa[mid]==targetCGPA){
                flag=true;
                index=mid;
                break;
            }
            else if(cgpa[mid]<targetCGPA){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(flag){
            System.out.println("target CGPA is found at index "+index);
        }
        else{
            System.out.println("target CGPA is not found");
        }
    }
}
