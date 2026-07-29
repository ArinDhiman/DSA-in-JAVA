class Solution {
    public int numTrees(int n) {
        return count(1,n);
    }
    public static int count(int start,int end){
        if(start>=end){
            return 1;
        }
        int ans=0;
        for(int i=start;i<=end;i++){
            int left=count(start,i-1);
            int right=count(i+1,end);
            ans=ans+(left*right);
        }
        return ans;
    }
}