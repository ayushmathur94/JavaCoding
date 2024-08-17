public class Fibonacci {
    public static int printFibonacci(int n){
if(n<=1){
    return n;
}else{
    return printFibonacci(n-1) + printFibonacci(n-2);
}
    }

    public static void main(String args[]){
int size = 10;
for(int i=0;i<10;i++){
    System.out.print(" " + printFibonacci(i) );
}

}


    
}
