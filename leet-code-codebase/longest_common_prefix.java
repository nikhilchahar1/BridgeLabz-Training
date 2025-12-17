class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int l = strs[0].length();
        for(int i=0;i<l;i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) return sb.toString();
            else{
                sb.append(strs[0].charAt(i));
            }
        }
        return sb.toString();
    }
}