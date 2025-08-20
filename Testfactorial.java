public class Testfactorial{
  public static void main(String[] args){
    int res=factorial.findFactorial(5);
    if(res!=120){
      System.out.println("test failed");
    }
    if(factorial.findFactorial(0)!=1){
      System.out.println("test failed");
    }
    System.out.println("Successfully test cases passeed");
  }
}
