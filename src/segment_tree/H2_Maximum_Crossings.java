package segment_tree;

import java.util.Scanner;
public class H2_Maximum_Crossings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt()-1;
            }
            long ans=0;
            SegmentTree st=new SegmentTree(n);
            for(int i=0;i<n;i++){
                ans+=st.query(1,0,n-1,arr[i],n-1);
                st.update(1,0,n-1,arr[i],1);
            }
            System.out.println(ans);
        }
    }
    static class SegmentTree{
        int[] tree;
        SegmentTree(int n){
            tree=new int[4*n];
        }
        public void update(int node,int start,int end,int pos,int val){
            if(start==end){
                tree[node]+=val;
                return ;
            }
            int mid=(start+end)/2;
            if(pos<=mid){
                update(2*node,start,mid,pos,val);
            }
            else{
                update(2*node+1,mid+1,end,pos,val);
            }
            tree[node]=tree[2*node]+tree[2*node+1];
        }

        public int query(int node,int start,int end,int l,int r){
            if(r<start || l>end){
                return 0;
            }
            if(l<=start && end<=r){
                return tree[node];
            }
            int mid=(start+end)/2;
            int left=query(2*node,start,mid,l,r);
            int right=query(2*node+1,mid+1,end,l,r);
            return left+right;
        }
    }
}
