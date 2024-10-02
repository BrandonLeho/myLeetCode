class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int temp[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp); 

        if(arr.length==0){
            return new int[]{};
        }
        
        hm.put(temp[0], 1);

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > temp[i - 1]) {
                hm.put(temp[i], hm.get(temp[i - 1]) + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}