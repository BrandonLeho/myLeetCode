class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int output = 0;
        for(int i = 0; i < seats.length; i++){
            int dif = Math.abs(students[i] - seats[i]);
            output += dif;
        }
        return output;
    }
}