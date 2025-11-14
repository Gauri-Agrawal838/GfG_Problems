class Solution {

    public static int mergeStones(int[] stones, int k) {

        // code here

        int n = stones.length;

 

        // Check if it's possible to get 1 pile

        if ((n - 1) % (k - 1) != 0) {

            return -1;

        }

 

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {

            prefix[i + 1] = prefix[i] + stones[i];

        }

 

        // dp[i][j][t] = min cost to merge from i to j into t piles

        int[][][] dp = new int[n][n][k + 1];

 

        // Initialize DP with large values

        for (int i = 0; i < n; i++) {

            Arrays.fill(dp[i][i], 0);

        }

 

        // Solve intervals by increasing length

        for (int len = 2; len <= n; len++) {

            for (int i = 0; i + len - 1 < n; i++) {

                int j = i + len - 1;

 

                for (int t = 2; t <= k; t++) {

                    dp[i][j][t] = Integer.MAX_VALUE;

 

                    // Split ranges

                    for (int m = i; m < j; m += (k - 1)) {

                        if (dp[i][m][1] == Integer.MAX_VALUE || dp[m + 1][j][t - 1] == Integer.MAX_VALUE)

                            continue;

                        dp[i][j][t] = Math.min(dp[i][j][t],

                                dp[i][m][1] + dp[m + 1][j][t - 1]);

                    }

                }

 

                // If we can merge t piles → 1 pile

                dp[i][j][1] = dp[i][j][k] == Integer.MAX_VALUE

                        ? Integer.MAX_VALUE

                        : dp[i][j][k] + prefix[j + 1] - prefix[i];

            }

        }

 

        return dp[0][n - 1][1];

    }

 

}

 