public class factorial{
  public static int findFactorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact*=i;
    }
    return fact;
  }
  public static void main(string[] args){
    try{
    int n=5;
    int res=findFactorial(n);
    System.out.println("Factorial of "+ n+" is "+res);
    }
    catch(Exception e){
      System.out.println("An error occurred: "+e.getMessage());
    }
  }
    
