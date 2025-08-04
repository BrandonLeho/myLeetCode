class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1) {
            return 1;
        }
        int max = 0;
        int count = 0;
        int last = 0;
        int curr1 = fruits[0];
        int curr2 = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            curr1 = fruits[i];
            curr2 = curr1;
            for (int j = i; j < fruits.length; j++) {
                if (fruits[j] != curr1 && curr1 == curr2) {
                    curr2 = fruits[j];
                    count++;
                    for (int k = j - 1; k > 0; k--) {
                        if (fruits[k] != curr2 && fruits[k] != curr1) {
                            break;
                        }
                        if (fruits[k] == curr2) {
                            count++;
                        }
                    }
                } else if (fruits[j] == curr1 || fruits[j] == curr2) {
                    count++;
                    last = j;
                } else {
                    break;
                }
            }

            if (curr1 == curr2 && i != 0) {
                curr2 = fruits[i - 1];
                for (int k = i - 1; k > 0; k--) {
                    if (fruits[k] != curr2 && fruits[k] != curr1) {
                        break;
                    }
                    if (fruits[k] == curr2 || fruits[k] == curr1) {
                        count++;
                    }
                }
            }

            if (count > max) {
                max = count;
            }
            i = last;
            count = 0;
        }
        return max;
    }
}