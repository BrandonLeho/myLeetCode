class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        PriorityQueue<Integer> sortedGifts = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(gifts).boxed().forEach(sortedGifts::add);

        for(int i = 0; i < k; i++){
            sortedGifts.add((int)Math.sqrt(sortedGifts.poll()));
        }

        for(int n : sortedGifts){
            sum += n;
        }

        return sum;
    }
}