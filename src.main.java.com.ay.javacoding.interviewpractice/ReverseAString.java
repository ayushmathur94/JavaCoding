public class ReverseAString {

public static String reverseString(String str){
int start;
int index = str.length()-1;
int end = index+1;
String result = "";

while(index >=0){
    if(str.charAt(index)==' '){
        start = index+1;
        while(start!=end){
            result += str.charAt(start++);
        }
        result += " ";
        end=index;
    }
    index--;
}

start=0;
while(start!=end){
    result += str.charAt(start++);
}

return result;
}

public static void main(String[] args) {
    
    String inputString = "Hi My Name is Ram";
    System.out.print(reverseString(inputString));

}


}
