//Day_3
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom_arr = new int[125];
        int[] magazine_arr = new int[125];
        for(int i=0;i<ransom_arr.length;i++){
            ransom_arr[i]=0;
        }
        for(int i=0;i<ransomNote.length();i++){
            int x = ransomNote.charAt(i);
            ransom_arr[x]+=1;
        }
        for(int i=0;i<magazine_arr.length;i++){
            magazine_arr[i]=0;
        }
        for(int i=0;i<magazine.length();i++){
            int x = magazine.charAt(i);
            magazine_arr[x]+=1;
        }
        for(int i=0;i<ransom_arr.length;i++){
            if(magazine_arr[i]>=ransom_arr[i]){
                
            } 
            else{
                    return false;
                }
            
        }
        return true;
    }
}
