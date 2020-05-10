class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> finalStr = new ArrayList<>();
        int k=1;
        for(int i=0;i<target.length;i++){
            while(k!=target[i]){
                finalStr.add("Push");
                finalStr.add("Pop");
                k++;
            }
            finalStr.add("Push");
            k++;
        }
        
    return finalStr;    
    }
}
