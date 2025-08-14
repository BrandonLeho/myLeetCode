class Solution {
    public String largestGoodInteger(String num) {
        String good = "/";
        int count = 1;
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1)) {
                count++;
                if (count == 3 && num.charAt(i) > good.charAt(0)) {
                    good = "" + num.charAt(i) + num.charAt(i) + num.charAt(i);
                }
            } else {
                count = 1;
            }
        }
        return good == "/" ? "" : good;
    }
}