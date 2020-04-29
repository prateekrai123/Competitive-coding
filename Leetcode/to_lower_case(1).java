class Solution {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<90){
                int temp = (int)str.charAt(i);
                temp = temp%65;
                temp += 97;
                s.append(String.valueOf((char)temp));
            }
            else{
                s.append(String.valueOf(str.charAt(i)));
            }
        }
        return String.valueOf(s);
    }
}