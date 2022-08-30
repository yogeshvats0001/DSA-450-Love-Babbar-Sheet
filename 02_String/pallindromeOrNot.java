import java.util.Scanner;

public class pallindromeOrNot{
    public static int isPalindrome(String S){
        int len = S.length();
        for(int i=0; i<len/2; i++){
            if(S.charAt(i) != S.charAt(len-1-i)){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int result = isPalindrome(S);
        if(result==1){
            System.out.println(result + " and its pallindrome");
        }else{
            System.out.println(result + " and not a pallindrome");
        }
        scan.close();
    }
}