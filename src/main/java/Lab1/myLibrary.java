package Lab1;
/* Comp3111_2026s\Lab1\myLibrary.java
   myLibrary consists of 2 mathematical functions
 */
public class myLibrary {
    public static int Power(int Base, int Exponent){
        if (Exponent == 1 ){
            return Base;
        } else {
            return Base*Power(Base, Exponent-1);
        }
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}

