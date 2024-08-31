import java.util.HashSet;
import java.util.Set;

public class CountDistinctPalindromeSubStrings {
    
public static boolean isPalindrome(String str){
    int left = 0;
    int right = str.length()-1;

    while(left < right){
if(str.charAt(left)!=str.charAt(right)){
    return false;
}
left++;
right--;
    }
return true;
}

public static int countDistinctPalinSubString(String s){
Set<String> palindromeSet = new HashSet<String>();

    int n=s.length();

for(int i=0; i<n; i++){
for(int j=i; j < n ; j++){
String subStr = s.substring(i,j+1);
if(isPalindrome(subStr)){
    palindromeSet.add(subStr);
}
}
}
System.out.println(palindromeSet);
return palindromeSet.size();
}

public static void main(String[] args) {
    String s="abbaeae";
    int result = countDistinctPalinSubString(s);
    System.out.println(result);
}

}
