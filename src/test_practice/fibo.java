package test_practice;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] grid={{1,2,1,3},{5,15,7,3},{10,4,14,12}};
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j += 2) {
                    System.out.print(grid[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j -= 2) {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
//        System.out.print(70^92);
//        int n=8;
//        int a=0;
//        int b=1;
//        System.out.println(a+" ");
//        for(int i=0;i<n;i++){
//            int c=a+b;
//            System.out.println(c+" ");
//            a=b;
//            b=c;
//        }
//         int div=36;
//         int d=60;
//         while(d%div!=0){
//             int r=d%div;
//             d=div;
//             div=r;
//         }
//         System.out.println(div);


//        int n=1001;
//        int s=0;
//        int p=1;
//        while(n>0){
//            int r=n%10;
//            s+=r*p;
//            p*=2;
//            n/=10;
//        }
//        System.out.println(s);

//        int n=9;
//        int s=0;
//        int p=1;
//        while(n>0){
//            int r=n%2;
//            s+=r*p;
//            p*=10;
//            n/=2;
//        }
//        System.out.println(s);

//        char ch='a';
//        System.out.println((int)(ch));
//        ch++;
//        System.out.println(ch)
//        int ;
//        int n=6;
//        int N=0;
//        int j=1;
//        while(N<n){
//            int R=0;
//            int ncr=1;
//            while(R<j){
//                System.out.print(ncr+ " ");
//                ncr=((N-R)*ncr)/(R+1);
//                R++;
//            }
//            N++;
//            j++;
//            System.out.println();
//        }

//        int n=441;
//        int m=n;
//        int d=0;
//
//        int s=n;
//        while(n>0){
//            int r=n%10;
//            d++;
//            n/=10;
//        }
//        int R=0;
//        while(m>0){
//            int r=m%10;
//            R+=Math.pow(r,d);
//            m/=10;
//
//        }
//        if(s==R){
//            System.out.println("ams");
//        }
//        else {
//            System.out.println("no");
//        }
//        int[] arr={1,2,3,4,5,6,7};
//        int k=3;
//        int n=arr.length;
//        k=k%n;
////        first n-k ko rotate krenge
//        rotate(arr,0,n-k-1);
////        last k element ko rotate krenge
//        rotate(arr,n-k,n-1);
////        fir sbko rotate kr denge
//        rotate(arr,0,n-1);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//    public static void rotate(int[] arr,int i,int j){
//        while(i<j){
//            int t=arr[i];
//            arr[i]=arr[j];
//            arr[j]=t;
//            i++;
//            j--;
//        }
//        int n=7;
//        int i=1;
//        int a=0;
//        int s=0;
//        int b=0;
//        int r=0;
//        while(i<n+1){
//            if(i<=(n+1)/2){
//                int j=1;
//                while(j<n-a){
//                    System.out.print("  ");
//                    j++;
//                }
//                int k=1;
//                int c=i;
//                while(k<i+1){
//                    System.out.print(c+" ");
//                    k++;
//                    c--;
//                }
//                int h=1;
//                while(h<i+s-1){
//                    System.out.print("  ");
//                    h++;
//                }
//                if(i>1){
//                    int f=1;
//                    while(f<i+1){
//                        System.out.print(f+" ");
//                        f++;
//                    }
//                }
//            }
//            else{
//                int g=2+b;
//                while(g>0){
//                    System.out.print("  ");
//                    g--;
//                }
//                int v=1;
//                int p=n-i+1;
//                while(v<n-i+2){
//                    System.out.print(p+" ");
//                    p--;
//                    v++;
//                }
//                int z=1;
//                while(z<(2*n-1-((n+1)/2)*2-r)-1){
//                    System.out.print("  ");
//                    z++;
//                }
//                if(i<n){
//                    int e=1;
//                    while(e<n-i+2){
//                        System.out.print(e+" ");
//                        e++;
//                    }
//                }
//                b=b+2;
//                r=r+2;
//            }
//            s=s+1;
//            a=a+2;
//            i++;
//            System.out.println();
//        }

//        int n1=36;
//        int n2=60;
//        int a=1;
//        int m=1;
//        for(int i=1;i<=n1 && i<=n2;i++){
//            if(n1%i==0 && n2%i==0){
//                a=i;
//                m=(n1*n2)/a;
//            }
//        }
//        System.out.print(m);
//
//        int n=4546;
//        int s=0;
//        while(n>0){
//            int r=n%10;
//            int k=9-r;
//            if(k>r){
//                s=s*10+r;
//            }
//            else{
//                s=s*10+k;
//            }
//            n/=10;
//        }
//        int m=0;
//        while(s>0){
//            int r=s%10;
//            m=m*10+r;
//            s/=10;
//        }
//        System.out.print(m);

//        int n=378;
//        if(boston(n)){
//            System.out.println(1);
//        }
//        else {
//            System.out.println(0);
//        }



//        int n=378;
//        int s=sumofdigit(n);
//        int k=sumofprimefactor(n);
//        System.out.println(k);
//        if(s==k){
//            System.out.print(true);
//        }
//        else{
//            System.out.print(false);
//        }
//          int n=32145;
//          int s=0;
//          int pos=1;
//          while(n>0){
//              int r=n%10;
//              s+=(int)(pos*Math.pow(10,r-1));
//              n/=10;
//              pos++;
//          }
//          System.out.print(s);
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t>0){
//            int c1=sc.nextInt();
//            int c2=sc.nextInt();
//            int c3=sc.nextInt();
//            int c4=sc.nextInt();
//            int n=sc.nextInt();
//            int m=sc.nextInt();
//            int[] rikshaw=new int[n];
//            int[] cab=new int[m];
//            for(int i=0;i<n;i++){
//                rikshaw[i]= sc.nextInt();
//            }
//            for(int i=0;i<m;i++){
//                cab[i]= sc.nextInt();
//            }
//            int min_of_rikshaw=0;
//            for(int i=0;i<n;i++){
//                min_of_rikshaw=min_of_rikshaw+Math.min(rikshaw[i]*c1,c2);
//            }
//            int total_cost_of_rickshaws=Math.min(min_of_rikshaw,c3);
//            int min_of_cab=0;
//            for(int i=0;i<m;i++){
//                min_of_cab=min_of_cab+Math.min(cab[i]*c1,c2);
//            }
//            int total_cost_of_cab=Math.min(min_of_cab,c3);
//            int total_final_cost=Math.min(total_cost_of_cab+total_cost_of_rickshaws,c4);
//            System.out.println(total_final_cost);
//            t--;
//        }
//        int n=4;
//        int[] arr={1,2,3,4};
//        int[] left=new int[n];
//        int [] right=new int[n];
//        left[0]=1;
//        right[n-1]=1;
//        for(int i=1;i<n;i++){
//            left[i]=left[i-1]*arr[i-1];
//        }
//        for(int i=n-2;i>=0;i--){
//            right[i]=right[i+1]*arr[i+1];
//        }
//        int [] result=new int[n];
//        for(int i=0;i<n;i++){
//            result[i]=left[i]*right[i];
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(result[i]+" ");
//        }
//        int n=4;
//        int[] arr={1,2,3,4};
//        int[] left=new int[n];
//        left[0]=arr[0];
//        for(int i= 1;i<n;i++){
//            left[i]=arr[i]+left[i-1];
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(left[i]+" ");
//        }
//        int n=111111;
//        int s=0;
//        int p=1;
//        while(n>0){
//            int r=n%10;
//            s+=r*p;
//            n/=10;
//            p*=2;
//        }
//        System.out.print(s);
//        int n=8;
//        int[] arr={1,1,2,7,3,7,4,7};
//        int c=1;
//        int e=arr[0];
//        for(int i=1;i<n;i++){
//            if(arr[i]==e){
//                c++;
//            }
//            else{
//                c--;
//                if(c==0){
//                    c=1;
//                    e=arr[i];
//                }
//            }
//        }
//        System.out.print(e);
//        int n=10;
//        int c=0;
//        for(int i=0;i<n;i++){
//            int x=sc.nextInt();
//            int y=sc.nextInt();
//            int z=sc.nextInt();
//            if(x==1 && y==1 && z==1){
//                c++;
//            }
//            else if(x==1 && y==1 && z==0){
//                c++;
//            }
//            else if(x==0 && y==1 && z==1){
//                c++;
//            }
//            else if(x==1 && y==0 && z==1){
//                c++;
//            }
//        }
//        System.out.print(c);
//        int n=6;
//        int[] arr={3,0,0,2,0,4};
//        int left[]=new int[n];
//        int right[]=new int[n];
//        left[0]=arr[0];
//        right[n-1]=arr[n-1];
//        for(int i=1;i<n;i++){
//            left[i]=Math.max(arr[i],left[i-1]);
//        }
//        for (int i=n-2;i>=0;i--){
//            right[i]=Math.max(arr[i],right[i+1]);
//        }
//        int s=0;
//        for(int i=0;i<n;i++){
//
//            s+=(Math.min(left[i],right[i])-arr[i]);
//        }
//        System.out.print(s);
//        int x=4545;
//        StringBuilder res=new StringBuilder();
//        String s=String.valueOf(x);
//        for(int i=0;i<s.length();i++){
//            int r=s.charAt(i)-'0';
//            int invert=9-r;
//            if(i==0 && invert==0){
//                res.append(r);
//            }
//            else{
//                res.append(Math.min(r,invert));
//            }
//        }
//        String str=res.toString();
//        System.out.print(str);





//        int[] arr={3,2,1};
//        List<List<Integer>> result=new ArrayList<>();
//        permute(arr, 0, result);
//        for (List<Integer> permutation : result) {
//            System.out.println(permutation);
//        }
//        int[] arr={1,2,3};
//        List<List<Integer>> res=new ArrayList<>();
//        permute(arr,0,res);
//        for(List<Integer> permuation:res){
//            System.out.println(permuation);
//        }
//        int[] arr={1,2,3};
//        nextpermutation(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//       / Scanner sc = new Scanner(System.in);

//
//        int t = sc.nextInt();
//        while(t>0){
//            int m1 = sc.nextInt();
//            int m2 = sc.nextInt();
//            int [] num = new int[m1];
//            int [] num1 = new int[m2];
//            for(int i=0 ; i<m1 ; i++){
//                num[i] = sc.nextInt();
//            }
//            for(int i=0 ; i<m2 ; i++){
//                num1[i] = sc.nextInt();
//            }
//            int sum = answer_doo(num , num1);
//            System.out.println(sum);
//            t--;
//        }
//        int[] gas = { 1, 2, 3, 4, 5 };
//        int[] cost = { 3, 4, 5, 1, 2 };
//        int total=0;
//        for(int i=0;i<cost.length;i++){
//            total+=gas[i]-cost[i];
//        }
//        if(total<0){
//            System.out.print(-1);
//        }
//        int idx=0;
//        int cur=0;
//        for(int i=0;i<cost.length;i++){
//            cur+=gas[i]-cost[i];
//            if(cur<0){
//                cur=0;
//                idx=i+1;
//            }
//        }
//        System.out.print(idx);
//        int n=7;
//        int m=4;
//        int[][] arr={{90, 40, 1,3 ,39 ,59, 90 },
//                {48 ,72 ,67, 32, 73 ,19 ,27 },
//                {22, 37 ,47 ,68, 1, 5 ,55},
//                {81 ,5, 39 ,53 ,38, 86 ,21 },
//                {1, 32, 7 ,44 ,2, 65, 47 },
//                {68 ,13 ,24 ,28 ,69 ,81 ,43 },
//                {16, 34, 67, 3 ,82, 26 ,35 }
//        };
//        int ans=Integer.MIN_VALUE;
//        int idx=0;
//        for (int i =0;i<n;i++){
//            int s=0;
//            for(int j=0;j<n;j++) {
//                s += arr[j][i];
//                if(ans<s){
//                    ans=s;
//                    idx=i+1;
//                }
//
//            }
//        }
//        System.out.print(ans+"  "+idx);
//
//
//        long n=1000000000000000l;
//        long k=10;
//        long x=0;
//        long l=1;
//        long h=n;
//        while(l<=h){
//            long mid=l+(h-l)/2;
//            if(Math.pow(mid,k)<=n){
//                x=mid;
//                l=mid+1;
//            }
//            else{
//                h=mid-1;
//            }
//        }
//        System.out.print(x);

//        int n=45;
//        int ans=0;
//        int l=1;
//        int h=n;
//        while(l<=h){
//            int mid=l+(h-l)/2;
//            if(mid*mid==n){
//                System.out.println((int)mid);
//                break;
//            }
//            else if(mid*mid<n){
//                l=mid+1;
//            }
//            else{
//                h=mid-1;
//            }
//        }
//        System.out.print((int)Math.floor(Math.sqrt(n)));







//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                for(int j=0;j<m;j++){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//            else{
//                for (int j=m-1;j>=0;j--){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                for(int j=m-1;j>=0;j--){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//            else{
//                for (int j=0;j<m;j++){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//        }
//        for(int j=0;j<m;j++){
//            if(j%2==0){
//                for (int i=0;i<n;i++){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//            else{
//                for (int i=n-1;i>=0;i--){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//        }

//        for(int j=0;j<m;j++){
//            if(j%2==0){
//                for (int i=n-1;i>=0;i--){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//            else{
//                for (int i=0;i<n;i++){
//                    System.out.print(arr[i][j]+" ,");
//                }
//            }
//        }


//        int t=n*m;
//        int c=0;
//        int minr=0,minc=0;
//        int maxr=n-1;
//        int maxc=m-1;
//        while(c<t){
//            for(int i=minr;i<=maxr && c<t;i++){
//                System.out.print(arr[i][minc]+" ,");
//                c++;
//            }
//            minc++;
//            for(int i=minc;i<=maxc && c<t;i++){
//                System.out.print(arr[maxr][i]+" ,");
//                c++;
//            }
//            maxr--;
//            for(int i=maxr;i>=minr && c<t;i--){
//                System.out.print(arr[i][maxc]+" ,");
//                c++;
//            }
//            maxc--;
//            for(int i=maxc;i>=minc && c<t;i--){
//                System.out.print(arr[minr][i]+" ,");
//                c++;
//            }
//            minr++;
//
//        }
//        for(int i=0;i<n;i++){
//            int j=0;
//            int k=m-1;
//            while(j<k){
//                int t=arr[i][j];
//                arr[i][j]=arr[i][k];
//                arr[i][k]=t;
//
//                j++;
//                k--;
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<m;j++){
//                int t=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=t;
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                Arrays.sort(arr[i]);
//            }
//        }
//        int c=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i<j && arr[i][j]==0){
//                    c++;
//                }
//            }
//        }
//        int s=0;
//        int k=n-1;
//        while(k>0){
//            s+=k;
//            k--;
//        }
//        if(s==c){
//            System.out.print(1);
//        }
//        else{
//            System.out.print(0);
//        }

//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(i>j){
//                    arr[i][j]=0;
//                }
//                else{
//                    arr[i][j]=arr[i][j];
//                }
//            }
//        }
//        boolean[] arr1=new boolean[n];
//        boolean[] arr2=new boolean[n];
//        for(int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(arr[i][j]==1){
//                    arr1[i]=true;
//                    arr2[j]=true;
//                }
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(arr1[i] ||arr2[j]){
//                    arr[i][j]=1;
//                }
//            }
//        }



//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int n=3;
//        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
//        int[] arr=new int[n*n];
//        int i=0;
//        int j=0;
//        for(int k=0;k<arr.length;k++){
//            arr[k]=matrix[i][j];
//            if((i+j)%2==0){
//                if(j==n-1){
//                    i++;
//                }
//                else if(i==0){
//                    j++;
//                }
//                else{
//                    i--;
//                    j++;
//                }
//            }
//            else{
//                if (i==n-1){
//                    j++;
//                } else if (j==0) {
//                    i++;
//                }
//                else {
//                    i++;
//                    j--;
//                }
//            }
//        }
//        for (int k=0;k<n*n;k++){
//            System.out.print(arr[k]+" ,");
//        }


//        String s="IAmACompetitiveProgrammer";
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(Character.isUpperCase(ch)){
//                System.out.println();
//                System.out.print(ch);
//            }
//            else{
//                System.out.print(ch);
//            }
//        }
//        String s="abaabasc";
//        int ans=0;
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                String str=s.substring(i,j+1);
//                if(pallindromic(str)){
//                    ans++;
//                }
//            }
//        }
//        System.out.print(ans);

//        String s="abaabasc";
//        int c=1;
//        char ch=s.charAt(0);
//        for(int i=0;i<s.length();i++){
//            if(ch==s.charAt(i)){
//                c++;
//            }
//            else{
//                c--;
//                if(c==0){
//                    ch=s.charAt(i);
//                    c=1;
//                }
//            }
//        }
//        System.out.print(ch);



//        String s="abbabacc";
//        String str="";
//        for(int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)!=s.charAt(i+1)){
//                str+=s.charAt(i);
//            }
//        }
//        str+=s.charAt(s.length()-1);
//        System.out.print(str);

//        int[] arr={54,546,548,60};
//        StringBuilder ans=new StringBuilder();
//        for (int i=1;i<arr.length;i++){
//            for (int j=0;j<arr.length-i;j++){
//                String s1=arr[j] +""+arr[j+1];
//                String s2=arr[j+1]+""+arr[j];
//                if(Long.parseLong(s2)>Long.parseLong(s1)){
//                    int t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                }
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            ans.append(arr[i]);
//        }
//        System.out.print(ans.toString());
//        String s="cbaeicde";
//        int ans=0;
//        int c=0;
//        for (int i=0;i<s.length();i++){
//            if(isvowel(s.charAt(i))){
//                c++;
//            }
//            else{
//                ans=Math.max(c,ans);
//                c=0;
//            }
//        }
//        System.out.print(ans);
//        String s="acb";
//        String str="";
//        for(int i=0;i<s.length()-1;i++){
//            int k=(int)s.charAt(i+1)-(int)s.charAt(i);
//            str+=s.charAt(i);
//            str+=k;
//        }
//        str+=s.charAt(s.length()-1);
//        System.out.print(str);


//        String s="aaabbccds";
//        String str="";
//        int c=1;
//        char ch=s.charAt(0);
//        for(int i=1;i<s.length();i++){
//            if(ch==s.charAt(i)){
//                c++;
//            }
//            else{
//                if(c==1){
//                    str+=s.charAt(i-1);
//                    ch=s.charAt(i);
//                }
//                else{
//                    str+=s.charAt(i-1);
//                    str+=c;
//                    ch=s.charAt(i);
//                    c=1;
//                }
//            }
//        }
//        str+=s.charAt(s.length()-1);
//        System.out.print(str);
//        String s="abC";
//        String str="";
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(Character.isUpperCase(ch)){
//                str+=Character.toLowerCase(ch);
//            }
//            else{
//                str+=Character.toUpperCase(ch);
//            }
//        }
//        System.out.print(str);
//        String s="aaabbccds";
//        String str="";
//        char ch=s.charAt(0);
//        int c=1;
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i)==ch){
//                c++;
//            }
//            else{
//                str+=s.charAt(i-1);
//                str+=c;
//                c=1;
//                ch=s.charAt(i);
//            }
//        }
//        str+=s.charAt(s.length()-1);
//        str+=c;
//        System.out.print(str);

//        int k= sc.nextInt();
//        String s=sc.next();
//        int st=printsubstring(s);
//        System.out.print(st);

//        int k=2;
//        String s="abba";
//        int flip_a=kartik(s,'a',k);
//        int flip_b=kartik(s,'b',k);
//        System.out.print(Math.max(flip_a,flip_b));

//        String s = "hello";
//        for (int i = 1; i <=s.length(); i++) {
//            for (int j = i ; j <= s.length(); j++)
//            {
//                int k=j-i;
//                System.out.println(s.substring(k,j));
//            }
//        }









    }
//    public static int kartik(String s,char ch,int k){
//        int ans=0;
//        int start=0;
//        int end=0;
//        int flip=0;
//        while(end<s.length()){
//            if(s.charAt(end)==ch){
//                flip++;
//            }
//            while(flip>k){
//                if(s.charAt(start)==ch){
//                    flip--;
//                }
//                start++;
//            }
//            ans=Math.max(ans,end-start+1);
//            end++;
//        }
//        return ans;
//    }
//    public static int printsubstring(String s){
//        int c=0;
//        boolean [] visited=new boolean[s.length()];
//        for (int len=1;len<=s.length();len++){
//            for (int j=len;j<=s.length();j++){
//                int i=j-len;
//                long num=Long.parseLong(s.substring(i,j));
//                if(cb(num) && isvisited(visited,i,j)){
//                    c++;
//                    for (int k=i;k<j;k++){
//                        visited[k]=true;
//                    }
//                }
//            }
//        }
//        return c;
//    }
//    public static boolean isvisited(boolean[]visited,int i,int j){
//        for (int k=i;k<j;k++){
//            if(visited[k]==true){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean cb(long num){
//        if(num==0 || num==1) {
//            return false;
//        }
//        int[] arr={ 2,3,5,7,11,13,17,19,23,29 };
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]==num){
//                return true;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            if(num%arr[i]==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isvowel(char ch){
//        if(ch=='a' || ch=='e' || ch=='o' || ch=='u' ||ch=='i'){
//            return true;
//        }
//        return false;
//    }
//    public static boolean pallindromic(String s){
//        int i=0;
//        int j=s.length()-1;
//        while(i<j){
//            if(s.charAt(i)!=s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
//    public static int answer_doo(int[] arr , int[] arr1) {
//        int n1 = arr.length;
//        int n2 = arr1.length;
//        int sum = 0;
//        int index1 = 0, index2 = 0;
//        int current_index1 = 0;
//        int current_index2 = 0;
//        int i = 0, j = 0;
//        while (index1 < n1 || n2 > index2) {
//            int sum1 = 0, sum2 = 0;
//            for (i = index1; i < n1; i++) {
//                for (j = index2; j < n2; j++) {
//                    if (arr[i] == arr1[j]) {
//                        current_index1 = i;
//                        current_index2 = j;
//                        break;
//                    }
//                }
//                if (j < n2 && arr[i] == arr1[j]) {
//                    break;
//                }
//            }
//            if (i == n1 && j == n2) {
//                current_index1 = n1 - 1;
//                current_index2 = n2 - 1;
//            }
//            for (i = index1; i <= current_index1; i++) {
//                sum1 += arr[i];
//            }
//            for (i = index2; i <= current_index2; i++) {
//                sum2 += arr1[i];
//            }
//            if (sum1 > sum2) {
//                sum += sum1;
//            } else {
//                sum += sum2;
//            }
//            index1 = current_index1;
//            index2 = current_index2;
//            if (index1 == n1 - 1 || index2 == n2 - 1) {
//                if (n1 > n2) {
//                    current_index1 = n1 - 1;
//                } else {
//                    current_index2 = n2 - 1;
//                }
//            }
//            index1++;
//            index2++;
//        }
//        return sum;
//    }
//    public static void nextpermutation(int[] arr){
//        int p=-1;
//        int n=arr.length;
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]<arr[i+1]){
//                p=i;
//                break;
//            }
//        }
//        if(p==-1){
//            reverse(arr,0,n-1);
//            return;
//        }
//        int q=-1;
//        for(int i=n-1;i>p;i--){
//            if(arr[i]>arr[p]){
//                q=i;
//                break;
//            }
//        }
//        int t=arr[p];
//        arr[p]=arr[q];
//        arr[q]=t;
//        reverse(arr,p+1,n-1);
//    }
//    public static void reverse(int[]arr,int i,int j){
//        while(i<j){
//            int t=arr[i];
//            arr[i]=arr[j];
//            arr[j]=t;
//        }
//    }
//    public static void permute(int[] arr,int start,List<List<Integer>> res){
//        if(start==arr.length-1){
//            List<Integer> permutation=new ArrayList<>();
//            for (int num:arr){
//                permutation.add(num);
//            }
//            res.add(permutation);
//        }
//        for(int i=start;i<arr.length;i++){
//            swap(arr,start,i);
//            permute(arr,start+1,res);
//            swap(arr,start,i);
//        }
//    }
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    private static void permute(int[] arr, int start, List<List<Integer>> result) {
//        if (start == arr.length - 1) {
//            List<Integer> permutation = new ArrayList<>();
//            for (int num : arr) {
//                permutation.add(num);
//            }
//            result.add(permutation);
//
//        }
//
//    for (int i = start; i < arr.length; i++) {
//        swap(arr, start, i);
//        permute(arr, start + 1, result);
//        swap(arr, start, i);
//    }
//}
//    private static void swap(int[] arr, int i, int j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//}






//    public static int sumofdigit(int n){
//        int s=0;
//        while(n>0){
//            int r=n%10;
//            s+=r;
//            n/=10;
//        }
//        return s;
//    }
//    public static int sumofprimefactor(int n){
//        int s=0;
//        while(n%2==0){
//            s+=2;
//            n/=2;
//        }
//        for(int i=3;i*i<=n;i+=2){
//            while(n%i==0){
//                s+=sumofdigit(i);
//                n/=i;
//            }
//        }
//        if(n>2){
//            s+=sumofdigit(n);
//        }
//        return s;
//    }
//    public static boolean boston(int n){
//        int sum=sumofdigit(n);
//
//        int primefactor=sumofprimefactor(n);
//
//        return sum==primefactor;
//    }
//
//    public static int sumofprimefactor(int num){
//        int sum=0;
//        while(num%2==0){
//            sum+=2;
//            num/=2;
//        }
//        for(int i=3; i*i<=num; i+=2){
//            while(num%i==0){
//                sum+=sumofdigit(i);
//                num/=i;
//            }
//        }
//        if(num>2){
//            sum+=sumofdigit(num);
//        }
//        return sum;
//    }
//
//    public static int sumofdigit(int n){
//        int sum=0;
//        while(n>0){
//            int r=n%10;
//            sum+=r;
//            n=n/10;
//        }
//        return sum;
//    }
}
