class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int e = 0;
        int f = numbers.length-1;
        while(e<f)
        { 
            if(numbers[e]+numbers[f] == target)
            {
                result[0] = e+1;
                result[1] = f+1;
                break;
            }
            else if(numbers[e]+numbers[f] < target) e++;
            else f--;
        }
        return result;
    }
}