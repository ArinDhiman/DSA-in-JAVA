class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=n-1;
        int b=m-1;
        int c=m+n-1;
        while(a>=0){
            if(b>=0 && nums1[b]>nums2[a]){
                nums1[c]=nums1[b];
                b--;
            }else{
                nums1[c]=nums2[a];
                a--;
            }
            c--;
        }
    }
}