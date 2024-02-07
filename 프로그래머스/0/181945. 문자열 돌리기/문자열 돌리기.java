import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //char 타입으로 변환한 뒤 출력
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}