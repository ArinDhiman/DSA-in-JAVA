class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s="";
        int count=0;
        while(s.length()<b.length()){
            s+=a;
            count++;
        }
        if(zAlgo(b,s)){
            return count;
        }
        s+=a;
        count++;
        if(zAlgo(b,s)){
            return count;
        }
        return -1;
    }
    public boolean zAlgo(String b, String s) {
        String str = b + "#" + s;
        int[] z = new int[str.length()];
        int i = 1;
        while (i<str.length()){
            int j = 0;
            while (i+j<str.length()&&str.charAt(j)==str.charAt(i + j)){
                j++;
            }
            z[i]=j;
            if (z[i]==b.length()){
                return true;
            }
            i++;
        }
        return false;
    }
}