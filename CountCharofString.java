import java.util.Scanner;

public class CountCharofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] hash = new int[256];
        for(int i = 0; i < 256; i++){
            hash[i] = 0;;
        }

        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i)]++;
        }

        for(int i = 0; i < 256; i++){
            System.out.print(hash[i]+" ");
        }
    }
}
