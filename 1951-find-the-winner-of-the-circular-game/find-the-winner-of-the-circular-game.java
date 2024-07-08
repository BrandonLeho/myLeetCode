class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        int output = 0;

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        while (circle.size() > 1) {
            int next_to_remove = (output + k - 1) % circle.size();
            circle.remove(next_to_remove);
            output = next_to_remove;
        }

        return circle.get(0);
    }
}