class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int n = hours.length;
        //if(n == 1 && hours[0] >= target) return 1;
        int e = 0;
        for(e = 0;e<n;e++)
        {
            if(hours[e] >= target) break;
        }
        return n-e;
    }
}