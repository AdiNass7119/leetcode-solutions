class Solution {
    public String convert(String s, int n) {
        if (n == 1) return s;

        String[] a = new String[n];
        for (int i = 0; i < n; i++) a[i] = "";

        int r = 0, d = 1;

        for (char c : s.toCharArray()) {
            a[r] += c;

            if (r == 0) d = 1;
            if (r == n - 1) d = -1;

            r += d;
        }

        String ans = "";
        for (String x : a) ans += x;

        return ans;
    }
}