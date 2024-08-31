public class ReverseANumber {

public static int reverseLogic(Integer orgNum){
int reversedNum = 0;
while(orgNum!=0) {
    int digit = orgNum%10;
    reversedNum = reversedNum * 10 + digit;
    orgNum /= 10;
}
return reversedNum;
}

public static void main(String args[]){
int inputNum=1234;
System.out.println(reverseLogic(inputNum));
}
}
