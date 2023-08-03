class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int cost = 0;
        if(mainTank<5)
        {
            return (mainTank)*10;
        }
        if(mainTank>=5 && additionalTank<1)
        {
            return 50;
        }
        if(mainTank>=5 && additionalTank>=1)
        {
            mainTank -= 5;
            additionalTank -= 1;
            cost = 6*10;
        }
        int value = mainTank/4;
        if(additionalTank >= value)
        {
            cost += (mainTank+value)*10;
        }
        else if(value>0)
        {
            cost += (mainTank+additionalTank)*10;
        }
        else
        {
            cost += (mainTank)*10;
        }
        return cost;
    }
}
