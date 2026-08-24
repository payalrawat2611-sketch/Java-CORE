import java.util.Scanner ;
// using variables ,input ouput, loops ,conditions ,operators and more fundamentals here with some logics
void main(){
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Please enter nop between 1 to 10 :");
    int n =sc.nextInt();
    if(n<11 && n>0 ){
        for(int i=0 ;i<n;i++){
            for(int k=1; k<=n-i-1 ;k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("Invalid entry !!");
    }
}