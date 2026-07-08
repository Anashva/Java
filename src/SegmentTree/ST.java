package SegmentTree;

public class ST {
    int n;
    int[] tree;
    ST(int [] nums){
        n=nums.length;
        tree=new int[4*n];
        build(0,0,n-1,nums);
    }
    public void build(int node,int start,int end,int[] nums){
        if(start==end){
            tree[node]=nums[start];
            return;
        }
        int mid=(start+end)/2;
        build(2*node+1,start,mid,nums);
        build(2*node+2,mid+1,end,nums);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }
    public void update(int node,int start,int end,int idx,int val){
        if(start==end){
            tree[node]+=val;
            return;
        }
        int mid=(start+end)/2;
        update(2*node+1,start,mid,idx,val);
        update(2*node+2,mid+1,end,idx,val);
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }
    public long query(int node,int start,int end,int l,int r){
        if(r<start || l>end){
            return 0;//no overlap
        }
        if(l<=start && end<=r){
            return tree[node];//complete overlap
        }
        //partial overlap
        int mid=(start+end)/2;
        long left=query(2*node+1,start,mid,l,r);
        long right=query(2*node+2,mid+1,end,l,r);
        return left+right;
    }
}
