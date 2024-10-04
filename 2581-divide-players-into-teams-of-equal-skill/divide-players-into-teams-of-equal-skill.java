class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        long output = 0, temp = skill[0] + skill[n-1];
        for(int i = 0; i < n/2; i++){
            if(temp != skill[i] + skill[n-(i+1)]){
                return -1;
            }
            output += skill[i] * skill[n-(i+1)];
        }
        return output;
    }
}