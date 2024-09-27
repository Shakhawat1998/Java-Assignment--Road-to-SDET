import java.util.Scanner;
public class countNotesForGivenAmount {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int count=0;
        for(int i=0;i<notes.length;i++){
            count = amount/notes[i];
            if(count>0){
                System.out.println(notes[i]+" "+count);
                amount=amount%notes[i];
            }
        }
    }
}
