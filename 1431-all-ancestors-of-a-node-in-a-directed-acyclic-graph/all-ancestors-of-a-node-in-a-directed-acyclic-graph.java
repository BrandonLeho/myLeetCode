class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, list, new boolean[n]);
        }

        for (int i = 0; i < n; i++) {
            list.get(i).sort(Integer::compareTo);
        }

        return list;
    }

    private void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> list, boolean[] visit) {
        visit[curr] = true;
        for (int dest : graph[curr]) {
            if (!visit[dest]) {
                list.get(dest).add(parent);
                dfs(graph, parent, dest, list, visit);
            }
        }
    }
}