import java.util.*;

class Solution {

    private static final int MOD = 1_000_000_007;

    public int assignEdgeWeights(int[][] edges) {

        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int maxDepth = bfs(adj);

        return modPow(2, maxDepth - 1);
    }

    private int bfs(Map<Integer, List<Integer>> adj) {

        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.offer(new int[]{1, 0});
        visited.add(1);

        int maxDepth = 0;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int node = curr[0];
            int depth = curr[1];

            maxDepth = Math.max(maxDepth, depth);

            for (int neighbor : adj.getOrDefault(node, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.offer(new int[]{neighbor, depth + 1});
                }
            }
        }

        return maxDepth;
    }

    private int modPow(long base, int exp) {

        long result = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return (int) result;
    }
}