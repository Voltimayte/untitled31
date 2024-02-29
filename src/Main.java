import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner soot = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = soot.nextInt();
        }
        soot.close();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}