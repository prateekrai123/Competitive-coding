class Solution {
    public int subtractProductAndSum(int n) {
        int diff=0,sum=0,prod=1;
        while(n!=0){
            int temp = n%10;
            n = n/10;
            prod *= temp;
            sum += temp;
        }
        diff = prod - sum;
        return diff;
    }
}