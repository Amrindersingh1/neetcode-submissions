class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sl = s.length();
        int tl = t.length();

        if (sl != tl ) return false;

        int map[] = new int[26];
        for (int i = 0; i< sl; i++) {
            int sc = s.charAt(i) - 'a';
            int tc = t.charAt(i) - 'a';
            map[sc] = map[sc] + 1;
            map[tc] = map[tc] - 1;
        }

        for (int i = 0; i< 26; i++) {
            if(map[i]!=0) return false;
        }

        return true;

    }
}
