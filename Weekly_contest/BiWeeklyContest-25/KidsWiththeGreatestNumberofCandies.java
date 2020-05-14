class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> liss = new ArrayList();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                liss.add(true);
            }
            else liss.add(false);
        }
    return liss;
    }
}
