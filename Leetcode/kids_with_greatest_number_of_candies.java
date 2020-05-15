class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            if(i>max){
                max = i;
            }
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max){
                res.add(i,false);
            }
            else{
                res.add(i,true);
            }
        }
        return res;
    }
}