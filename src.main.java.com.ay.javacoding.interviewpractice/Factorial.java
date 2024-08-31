public class Factorial {
    

public static void main(String[] args) {
    int number = 8;
    int result = factorial(number);
    System.out.println(result);
}

public static int factorial(int n){
if(n==0 || n==1){
    return 1;
} else{
    return n * factorial(n-1);
}
}
}
