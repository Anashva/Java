package Lecture59;

import java.util.*;

public class MST01 {
//    static TreeMap<Integer,TreeSet<Integer>> mp;
//    static TreeSet<Integer>[] map;
//    static TreeSet<Integer> set;
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        mp=new TreeMap<>();
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        map=new TreeSet[n+1];
//        set=new TreeSet<>();
//        if(m==0){
//            System.out.println(0);
//            return;
//        }
//        for (int i=1;i<=n;i++) {
//            map[i]=new TreeSet<>();
//            mp.put(i, new TreeSet<>());
//            set.add(i);
//        }
//        for (int i=1;i<=m;i++){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            mp.get(a).add(b);
//            mp.get(b).add(a);
//            map[a].add(a);
//            map[b].add(b);
//        }
//        int ans=0;
//        for (int i=1;i<=n;i++){
//            if(set.remove(i)){
//                ans++;
////                dfs
//                dfs(i);
//            }
//        }
//        System.out.println(ans-1);
////        System.out.println(prims());
//    }
//    public static void dfs(int i){
//        Stack<Integer> st=new Stack<>();
//        for (int x:set){
//            if(!mp.get(i).contains(x)){
//                st.push(x);
//            }
//        }
//        while (!st.isEmpty()){
//            int s=st.pop();
//            if(!set.contains(s)){
//                continue;
//            }
//            set.remove(s);
//            for (int x:set){
//                if(!mp.get(s).contains(x)){
//                    st.push(x);
//                }
//            }
//
//        }
//    }
//    public static int prims(){
//        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
//        pq.add(new Pair(1,0));
//        HashSet<Integer> st=new HashSet<>();
//        int sum=0;
//        while(!pq.isEmpty()){
////            remove
//            Pair rv=pq.poll();
////            ignore
//            if(st.contains(rv.vtx)){
//                continue;
//            }
////            mark visited
//            st.add(rv.vtx);
//
////            self  work
//            sum+=rv.cost;
////            add nbrs
//            for (int nbrs=1;nbrs<=mp.size();nbrs++){
//                if(!st.contains(nbrs)){
//                    int cost=0;
//                    if (mp.get(rv.vtx).contains(nbrs)){
//                        cost++;
//                    }
//                    pq.add(new Pair(nbrs,cost));
//                }
//            }
//        }
//        return sum;
//    }
//    static class Pair{
//        int vtx;
//        int cost;
//        public Pair(int vtx,int cost){
//            this.vtx=vtx;
//            this.cost=cost;
//        }
//    }


        static TreeSet<Integer>[] arr;
        static TreeSet<Integer> set;

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            arr = new TreeSet[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new TreeSet<>();
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                arr[a].add(b);
                arr[b].add(a);
            }
            set = new TreeSet<>();
//		for (HashSet<Integer> a : arr) {
//			System.out.print(a + " ");
//		}
            for (int i = 0; i < n; i++) {
                set.add(i);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (set.remove(i)) {
                    ans++;
                    dfs(i);
                }
            }
            System.out.println(ans - 1);

        }

        public static void dfs(int x) {
            List<Integer> ll = new ArrayList<Integer>();
            for (int i : set) {
                if (!arr[x].contains(i)) {
                    ll.add(i);
                }
            }

            for (int i : ll) {
                set.remove(i);
            }
            for (int i : ll) {
                dfs(i);
            }

        }

    }
