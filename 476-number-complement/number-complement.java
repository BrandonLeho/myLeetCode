class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        char[] binaryChar = binaryString.toCharArray();
        for(int i = 0; i < binaryChar.length; i++){
            if(binaryChar[i] == '0'){
                binaryChar[i] = '1';
            }
            else{
                binaryChar[i] = '0';
            }
        }
        String modifiedBinaryString = new String(binaryChar);
        long binaryInt = Long.parseLong(modifiedBinaryString, 2);
        return (int)(binaryInt);
    }
}
