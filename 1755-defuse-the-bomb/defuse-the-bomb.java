class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] decode = new int[code.length];
        if(k == 0)
            return decode;

        int[] wrap = new int[code.length * 3];
        int mid = wrap.length / 3;
        for(int i = 0; i < wrap.length; i++){
            if(i < mid)
                wrap[i] = code[i];
            else if(i < mid * 2)
                wrap[i] = code[i - mid];
            else
                wrap[i] = wrap[i - mid];
        }
        
        
        for(int i = 0; i < decode.length; i++){
            for(int j = 0; j < Math.abs(k); j++){
                if(k < 0){
                    decode[i] += wrap[mid * 2 - 1 + i - j];
                } else {
                    decode[i] += wrap[i + j + 1];
                }
            }
        }

        return decode;
    }
}