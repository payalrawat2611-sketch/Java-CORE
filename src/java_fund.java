import java.util.Scanner ;
// using variables ,input output, loops ,conditions ,operators and more fundamentals here with some logics
void main(){
    // input --
    Scanner sc = new Scanner(System.in) ;

    // output / print statement ---
    System.out.print("Please enter nop between 1 to 10 :");

    //input of number in integer
    int n =sc.nextInt();

    // conditionals ---
    if(n<11 && n>0 ){

        // loops ---
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

    // if condition fails then else will run for the situation ---
    else{
        System.out.println("Invalid entry !!");
    }

    // type casting (explicit)  ---
    int b = (int) 7.09;

    // type conversion (implicit) ---
    float a = 143 ;

    System.out.println(a);
    System.out.println(b);

    //operator: assignment(=) operator with example problem (swap)  ---
    int r = 45 ;
    int s = 89;
    int t = r ;
    r = s ;
    s = t ;

    System.out.printf("new  value of r and s are now %d and %d respectively !!! " , r , s );

    // and there exists many more like arithmetic(PEMDAS[order]) operators ,
    // shorthand(>=/<=/..) operators ,unary operators(pre/post - inc/dec ),
    // relational(>/</==/!=/...) ,logical (and(&&)/or(||)/not(!)) also ...

    prod_of();

}

public void prod_of(){
    double p = 1.7 ;
    double a = 1.2 ;
    System.out.println("the product will be " + p*a );
}