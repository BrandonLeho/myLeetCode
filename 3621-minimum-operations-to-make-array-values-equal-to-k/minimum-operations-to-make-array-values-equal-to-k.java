class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;

        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        List<Integer> list = new ArrayList<>(set);
        

        for(int i = 0; i < list.size(); i++){
            if(k > list.get(i))
                return -1;
            if(k < list.get(i))
                count++;
        }

        return count;
    }
}