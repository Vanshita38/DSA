class Solution {
    public void duplicateZeros(int[] arr) {
        int e,f,g;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                f = arr.length-1;
                e = f-1;
                while(e>i)
                {
                    arr[f] = arr[e];
                    e--;
                    f--;
                }
                try{
                i++;
                arr[i] = 0;
                }catch(ArrayIndexOutOfBoundsException ae)
                {
                    i--;
                }
            }
        }
        
    }
}