class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int max = -1;
        int curr = arr[arr.length-1];
        int count = 1;
        
        for(int i = arr.length-1; i > 0; i--)
            if(arr[i-1] == curr){
                count++;
            }else{
                if(count == curr)
                    return curr;
                curr = arr[i-1];
                count = 1;
            }
            
        return count == curr ? curr : max;
    }
}