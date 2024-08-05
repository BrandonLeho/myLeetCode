class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for(String i : arr){
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
        for(String i : arr){
            if(counter.get(i) == 1){
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return "";
    }
}