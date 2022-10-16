import java.util.*;

public class Butterfly(){
  public static void main(){
    
    Scanner sc = new Scanner(System.in);
    
    // Taking input of Pattern size
    int n = sc.nextInt();
    
    //Upper Half Pattern
    for(int i=0;i<n;i++){
      for(int j=1;j<=i;j++){
          System.out.println("* ");
      }
      for(int k=1;k<=(n-i)*2;k++){
          System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
          System.out.print("* ");
      }
      System.out.println("");
    }
    
    // Lower Half
    for(int i = n;i>=1;i--){
      for(int j=1;j<=i;j++){
          System.out.println("* ");
      }
      for(int k=1;k<=(n-i)*2;k++){
          System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
          System.out.print("* ");
      }
      System.out.println("");
    }
  }
}

// Test
//   Output -: for n = 5

// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
