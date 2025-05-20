public class EuclidGCD {
   
    public static int euclidGCD(int a, int b) {
  
    if (b == 0) {
    return a;
    }
   
    return euclidGCD(b, a % b);
    }
    public static void main(String[] args) {
   
    int a = 56;
    int b = 98;
    
    int gcd = euclidGCD(a, b);
    System.out.println("The GCD of " + a + " and " + b + "is: " + gcd);
    }
   } 
   