class Solution {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        Collections.sort(timePoints);
        for(int i = 0; i < timePoints.size(); i++){
            String time1 = timePoints.get(i);
            String time2 = "";
            if(i == timePoints.size() - 1){
                time2 = timePoints.get(0);
            }else{
                time2 = timePoints.get(i+1);
            }
            
            if(time1.equals(time2)){return 0;}

            int hour1 = Integer.parseInt(time1.substring(0, 2));
            int hour2 = Integer.parseInt(time2.substring(0, 2));
            int min1 = Integer.parseInt(time1.substring(3, 5));
            int min2 = Integer.parseInt(time2.substring(3, 5));
            int timeDif = Math.abs((hour1 * 60 + min1) - (hour2 * 60 + min2));

            if(i == timePoints.size() - 1){
                hour1 = 23 - hour1;
                min1 = 60 - min1;
                timeDif = ((hour1 + hour2) * 60) + (min1 + min2);
            }
            
            min = Math.min(timeDif, min);
        }
        return min;
    }
}