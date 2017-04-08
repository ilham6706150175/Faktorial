
package jurnal_no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Jurnal_no2 {
    public static void main(String[] args) throws IOException {
     Scanner show = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int n = show.nextInt();
        
        for(int i=n; i>=1; i--){
            for(int j=i-1; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=((n+1)-i)*2; k++){
                System.out.print("*");
            }
             System.out.println();
        }
        for (int i=1;i<=n;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=n;z>=i;z--){
              System.out.print("*");
              }
             for(int k=n;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         }

    }
}
