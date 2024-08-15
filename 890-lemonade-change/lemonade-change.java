class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] amount = new int[2];
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    amount[0]++;
                    break;
                case 10:
                    amount[1]++;
                    if (amount[0] > 0)
                        amount[0]--;
                    else
                        return false;
                    break;
                case 20:
                    if (amount[1] > 0 && amount[0] > 0) {
                        amount[1]--;
                        amount[0]--;
                    } else if (amount[0] > 2)
                        amount[0] -= 3;
                    else
                        return false;
                    break;
            }

        }
        return true;
    }
}