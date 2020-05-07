class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder s1 = new StringBuilder("");
        s1.append(Integer.toBinaryString(x));
        StringBuilder s2 = new StringBuilder("");
        s2.append(Integer.toBinaryString(y));
        s1 = s1.reverse();
        s2 = s2.reverse();
        while(s1.length()!=32){
            s1.append("0");
        }
        while(s2.length()!=32){
            s2.append("0");
        }
        int count = 0;
        for(int i=0;i<32;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}