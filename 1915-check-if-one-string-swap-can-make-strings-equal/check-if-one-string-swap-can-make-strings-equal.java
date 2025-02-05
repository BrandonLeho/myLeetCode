class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] s3 = s1.toCharArray();
        Arrays.sort(s3);
        char[] s4 = s2.toCharArray();
        Arrays.sort(s4);

        if(!Arrays.equals(s3, s4))
            return false;

        int count = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                count++;
            if(count > 2)
                return false;
        }

        return true;
    }
}