class Solution {
    public int trap(int[] h) {
        
        int rain = 0;
        int l = h.length;

        int maxl[] = new int[l];
        int maxr[] = new int[l];

        maxl[0] = 0;
        int cm = 0;
        for (int i = 0; i< l;i++) {
            maxl[i] = cm;
            if(cm < h[i]) cm = h[i];
        }

        maxr[0] = 0;
        cm = 0;
        for (int i = l-1; i >= 0;i--) {
            maxr[i] = cm;
            if(cm < h[i]) cm = h[i];
        }

        int total = 0;
        for (int i = 0; i < l; i++)
            total += Math.max(0, Math.min(maxl[i], maxr[i]) - h[i]);
        return total;

    }
}