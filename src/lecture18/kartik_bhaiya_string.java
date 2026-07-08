package lecture18;

public class kartik_bhaiya_string {
    public static void main(String[] args) {
        int k=2;
        String s="abaabaababaabaaa";
        int flip_a=maxlen(s,'a',k);
        int flip_b =maxlen(s,'b',k);
        System.out.println(Math.max(flip_b,flip_a));

    }
    public static int maxlen(String s,char ch,int k){
        int start=0;
        int end=0;
        int flip=0;
        int ans=0;
        while(end<s.length()){
//            grow
            if(s.charAt(end)==ch){
                flip++;
            }
//            shrink
            while(flip>k && start<=end){
                if(s.charAt(start)==ch){
                    flip--;
                }
                start++;

            }
//            anas update
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
