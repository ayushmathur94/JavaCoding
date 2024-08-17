public class Palindrome {

    public static void main(String[] args) {
        System.out.println("@@@@ Program Starts here !! @@@");
        String a = "racecar";
        String b = "boom";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }

    public static Boolean isPalindrome(String str){
int left = 0;
int right= str.length()-1;
while(left<right){
    if(str.charAt(left)!=str.charAt(right)){
        return false;
    } 
    left++;
    right--;
}
return true;
    }
}