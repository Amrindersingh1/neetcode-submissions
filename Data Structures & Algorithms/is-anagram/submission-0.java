class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sl = s.length();
        int tl = t.length();

        if (sl != tl ) return false;

        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i< sl; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            map.compute(sc, (key, curr) -> curr == null ? 1 : curr + 1);
            map.compute(tc, (key, curr) -> curr == null ? -1 : curr - 1);
        }

        for (int i = 0; i< sl; i++) {
            if(map.get(s.charAt(i))!=0) return false;
        }

        return true;

    }
}
