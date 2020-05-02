class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> jewel = new HashSet();
        for(char c : J.toCharArray()){
            jewel.add(c);
        }
        for(char s : S.toCharArray()){
            if(jewel.contains(s)){
                count++;
            }
        }
    return count;
    }
}
