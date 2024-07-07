class Solution {
    public int numWaterBottles(int nb, int ne) {
        int tot=nb;
        while(nb>=ne)
        {
            tot+=nb/ne;
            nb=(nb/ne)+(nb%ne);
        }
        return tot;
        
    }
}