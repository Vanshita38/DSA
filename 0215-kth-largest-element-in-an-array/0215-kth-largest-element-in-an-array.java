class Solution {
    public static int findKthLargest(int[] x, int k) {
        //if(x.length == 1 && k == 1) return x[k-1];
      
int ci,y,ri,lci,rci,swi,g,lb,ub;
swi = 0;
lb = 0;
ub = x.length-1;
y = lb+1;
while(y<=ub)
{
ci = y;
while(ci>lb)
{
    ri =(ci-1)/2;
    if(x[ci]>x[ri])
    {
        g = x[ci];
        x[ci] = x[ri];
        x[ri] = g;
        ci = ri;
    }
    else break;
}
y++;
}
int i = 0;
while(i<=k && ub>= lb)
{
g = x[lb];
x[lb] = x[ub];
x[ub] = g;
ub--;
ri = lb;
while(ri<ub)
{
    lci = (ri*2)+1;
    rci = lci+1;
    if(lci>ub) break;
    if(rci>ub) swi = lci;
else
{
    if(x[lci] > x[rci] || x[lci] == x[rci]) swi = lci;
    else swi = rci;
}
if(x[swi]>x[ri])
{
    g = x[swi];
    x[swi] = x[ri];
    x[ri] = g;
    ri = swi;
}
else break;
}
i++;
}
int e = x.length-k;
return x[e];
  }
public static void main(String gg[])
{
int arr[] = {1};
System.out.println(findKthLargest(arr,1));
return;
}
}