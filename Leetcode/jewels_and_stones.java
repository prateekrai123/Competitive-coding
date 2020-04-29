class Solution {
    public int numJewelsInStones(String j, String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(j.contains(String.valueOf(s.charAt(j)))){
                count++;
            }
        }
        return count;
    }
}