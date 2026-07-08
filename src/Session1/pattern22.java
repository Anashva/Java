package Session1;

public class pattern22 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=-1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(star==n){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            row++;
            star--;
            space=space+2;
            System.out.println();
        }
    }
}
