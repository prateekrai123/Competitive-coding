class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                s.append("[.]");
            }
            else{
                s.append(String.valueOf(address.charAt(i)));
            }
        }
        return String.valueOf(s);
    }
}