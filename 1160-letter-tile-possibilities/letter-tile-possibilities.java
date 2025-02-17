class Solution {
    private final Map<Character, Integer> tilesCount = new HashMap<>();

    public int numTilePossibilities(String tiles) {
        for (int i = 0; i < tiles.length(); i++) {
            final char c = tiles.charAt(i);

            tilesCount.put(c, tilesCount.getOrDefault(c, 0) + 1);
        }

        return dfs();
    }

    private int dfs() {
        int res = 0;

        for (Map.Entry<Character, Integer> entry : tilesCount.entrySet()) {
            final char k = entry.getKey();
            final int v = entry.getValue();

            if (v > 0) {
                res++;

                tilesCount.put(k, v - 1);

                res += dfs();

                tilesCount.put(k, v);
            }
        }

        return res;
    }
}