import java.util.Scanner;

public class CountEleofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] hash = new int[13];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < 13; i++){
            hash[i] = 0;
        }

        for(int i = 0; i < n; i++){
            hash[nums[i]] += 1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(hash[i]+" ");
        }

    }
}
