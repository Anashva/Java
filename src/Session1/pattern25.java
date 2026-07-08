package Session1;

public class pattern25 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        int k=1;
        while(row<=n){
//            space
            int i=1;
            while(i<=space){
                System.out.print(" \t");
                i++;
            }
//            star
            int j=1;
            while(j<=2*star-1){
                System.out.print(k+"\t");
                j++;
                k++;
            }
//            next row prep
            row++;
            space--;
            star++;
            System.out.println();
        }

    }
}
