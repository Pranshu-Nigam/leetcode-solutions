import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int i = 0;  //child
        int j = 0;  //cookie

        Arrays.sort(g);
        Arrays.sort(s);

        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }
            else
            j++;
        }
        return i;
    }
}