class Solution {
    public boolean isAnagram(String s, String t) {

        // SOL1 :
        // Map<Character,Integer> mp1 = new HashMap<>();
        // Map<Character,Integer> mp2 = new HashMap<>();
        // for(char ch : s.toCharArray())
        //     mp1.put(ch, mp1.getOrDefault(ch, 0) + 1) ;
        // for(char ch : t.toCharArray())
        //     mp2.put(ch, mp2.getOrDefault(ch, 0) + 1) ;
        // return mp1.equals(mp2);


        // SOL2 :
        if(s.length()!=t.length())
            return false;
        
        return true;
    }
}
