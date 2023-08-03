class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==0)
            count++;
        }
        else
        {
        for(int i=0;i<flowerbed.length;i++)
        {
            if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0)
            {
                count++;
                flowerbed[i]=1;
            }
            else if(i==(flowerbed.length-1) && flowerbed[i]==0 && flowerbed[i-1]==0)
            {
                count++;
                break;
            }
            else if(flowerbed[i]==1)
            continue;
            else if(i!=0 && i!=(flowerbed.length-1) && flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                count++;
                flowerbed[i]=1;
            }
        }
        }
        if(count>=n)
        return true;
        else
        return false;
    }
}
