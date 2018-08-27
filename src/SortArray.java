import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;

public class SortArray {

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] mass = new int[10];
        sortArray.addArray(mass);
        System.out.println("Entered array:");
        sortArray.outputArray(mass);
        sortArray.sortArray(mass);
        System.out.println("Sorted array:");
        sortArray.outputArray(mass);
    }
    //Enter massive
    public void addArray(int[] mass) {
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < 10; i++){
            System.out.println("Enter [" + i + "] element of mass");
            mass[i] = scanner.nextInt();
        }
        scanner.close();
    }
    //Sort massive
    public void sortArray(int[] mass) {
        Arrays.sort(mass);
    }
    //Output array
    public void outputArray(int[] mass) {
        System.out.println(Arrays.toString(mass));
    }
}
