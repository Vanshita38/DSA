class Solution
{
public static int search(int[] arr, int target) {
int fi = -1;
int mid = -1;
int start = 0;
int end = arr.length-1;
while(start<=end)
{
    mid = start+(end-start)/2;
    if(arr[mid] == target)
    {
       fi = mid;
        break; 
    }
    if(arr[start] <= arr[mid])
    {
    if(arr[start] <= target && target <= arr[mid]) end = mid-1;
    else start = mid+1;
    }
    else
    {
    if(arr[mid] <= target && target <= arr[end]) start = mid+1;
    else end = mid-1;
    }
}
return fi;
}
}


 