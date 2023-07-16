// import java.lang.*;
import java.util.*;

class contSumQuery {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of beggars: ");
        int A = sc.nextInt();
        
        System.out.println("Enter the no. of devotees: ");
        int x = sc.nextInt();
        int B[][] = new int[x][3];
        
        System.out.println("Enter the donation details for each devotee (L, R, P): ");
        for (int i=0; i<x; i++) {
            System.out.println("Devotee" + (i+1) + ":");
            B[i][0] = sc.nextInt(); //L
            B[i][1] = sc.nextInt(); //R
            B[i][2] = sc.nextInt(); //P
        }
        int pots[] = new int[A];
        
        // Initialise pots array
        for (int i=0; i<A; i++) {
            pots[i] = 0;
        }
        
        for (int i=0; i<B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            int P = B[i][2];
            
            for (int j=L-1; j<=R-1; j++) {
                pots[j] += P; 
            }
        }
        
        System.out.println("Final amount in each beggar's pot: ");
        for (int i=0; i<A; i++) {
            System.out.println("Beggar" + (i+1) + ":" + pots[i]);
        }
        sc.close();
    }
}