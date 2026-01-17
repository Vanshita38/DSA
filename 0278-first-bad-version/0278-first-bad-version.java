/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int elem = 1;
        int mid = 1;
        boolean found = true;
        int start = 0;
        int end = n;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            found = isBadVersion(mid);
            if(found == true)
            {
                elem = mid;
                end = mid-1;

            }
            else
            {
                start = mid+1;
            }
       
        }
         return elem;
    }
}