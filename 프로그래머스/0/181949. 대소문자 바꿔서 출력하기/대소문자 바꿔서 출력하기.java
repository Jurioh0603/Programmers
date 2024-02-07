import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			arr[i] = a;
		} 
		for(int i=0; i<str.length(); i++) {
			if(arr[i]>64&&arr[i]<91) {
				System.out.print((char)(arr[i]+32));
			}else if(arr[i]>96&&arr[i]<123) {
				System.out.print((char)(arr[i]-32));
			}
		}
    }
}