class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()!= s2.length()) {
            return false;
        } else {
            char[] s1array = s1.toCharArray();
            char[] s2array = s2.toCharArray();
            
            Arrays.sort(s1array);
            Arrays.sort(s2array);
            
            boolean result = Arrays.equals(s1array,s2array);
            if(result) {
                return true;
            } else {
                return false;
            }
        }
        
    }
}
