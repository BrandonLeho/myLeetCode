class Solution {
    public boolean primeSubOperation(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        int[] primes = generatePrimes(max);

        int n = nums.length;
        int l = 0, h = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                l = nums[i] - (nums[i + 1] - 1);
                h = nums[i];
                int p = getPrime(primes, l, h);
                if (p == h) {
                    return false;
                } else {
                    nums[i] = nums[i] - p;
                }
            }
        }

        return true;
    }

    public int[] generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primesList = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }

        return primesList.stream().mapToInt(Integer::intValue).toArray();
    }

    int getPrime(int[] primes, int l, int h){
        for(int i=0; i<primes.length; i++){
            if(l<=primes[i] && primes[i]<h){
                return primes[i];
            }
        }
        return h;
    }
}