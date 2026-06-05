class Solution {

    static class Pair {
        long cnt;
        long wave;

        Pair(long c, long w) {
            cnt = c;
            wave = w;
        }
    }

    String s;
    Pair[][][][] memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x < 0) return 0;

        s = String.valueOf(x);

        memo = new Pair[s.length()][11][11][2];

        return dfs(0, 10, 10, 0, true).wave;
    }

    private Pair dfs(int pos,
                     int prev1,
                     int prev2,
                     int started,
                     boolean tight) {

        if (pos == s.length()) {
            return new Pair(started == 1 ? 1 : 0, 0);
        }

        if (!tight && memo[pos][prev1][prev2][started] != null) {
            return memo[pos][prev1][prev2][started];
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;

        long totalCnt = 0;
        long totalWave = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextTight = tight && d == limit;

            if (started == 0 && d == 0) {

                Pair nxt = dfs(
                        pos + 1,
                        10,
                        10,
                        0,
                        nextTight
                );

                totalCnt += nxt.cnt;
                totalWave += nxt.wave;
            } else {

                Pair nxt = dfs(
                        pos + 1,
                        d,
                        prev1,
                        1,
                        nextTight
                );

                long add = 0;

                if (prev1 != 10 && prev2 != 10) {

                    boolean peak =
                            prev1 > prev2 && prev1 > d;

                    boolean valley =
                            prev1 < prev2 && prev1 < d;

                    if (peak || valley) {
                        add = nxt.cnt;
                    }
                }

                totalCnt += nxt.cnt;
                totalWave += nxt.wave + add;
            }
        }

        Pair ans = new Pair(totalCnt, totalWave);

        if (!tight) {
            memo[pos][prev1][prev2][started] = ans;
        }

        return ans;
    }
}