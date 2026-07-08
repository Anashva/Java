package cf;

import java.util.Scanner;

public class Anton_Polyhedron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n-->0){
            String s=sc.next();
            if(s.contains("Icosahedron")){
                ans+=20;
            }
            else if(s.contains("Dodecahedron")){
                ans+=12;
            }
            else if(s.contains("Octahedron")){
                ans+=8;
            }
            else if(s.contains("Cube")){
                ans+=6;
            }
            else if(s.contains("Tetrahedron")){
                ans+=4;
            }
        }
        System.out.println(ans);
    }
}
