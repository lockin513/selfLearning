public class lemonade_change {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int five = 0;
            int ten = 0;
            int flag = 1;
            for(int i=0;i<bills.length;i++)
            {
                if(bills[i]==5)five++;
                else if(bills[i]==10)
                {
                    if(five!=0)
                    {
                        five--;
                        ten++;
                    }
                    else {
                        flag = 0;
                        break;
                    }
                }
                else{
                    if(five>=1 && ten>=1)
                    {
                        five--;
                        ten--;
                    }
                    else if(five>=3) five-=3;
                    else{
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag==1)return true;
            else return false;
        }
    }
}
