class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count =0;
        String start = strs[0];
        String end = strs[strs.length()-1];

        while(count<start.length() && count<end.length()){

            if(start.chartAt(count) == end.charAt(count)){
                count++;
            }
            else{
                break;
            }
        } 
        return start.substring(0,count);
        

    }
}
