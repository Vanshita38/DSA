class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List <Integer>list  = new ArrayList<>();
         for(int e = 1;e<mountain.length;e++)
         {
            if(mountain[e-1]<mountain[e] && mountain[e]>mountain[e+1]) list.add(e);
         }
         return list;
    }
}