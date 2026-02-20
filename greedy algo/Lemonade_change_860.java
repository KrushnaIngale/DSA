public class Lemonade_change_860 {
    public static void main(String[] args) {
        int[] bills={5,5,10,10,20};
        Lemonade_change_860 l=new Lemonade_change_860();
        System.out.println(l.lemonadeChange(bills));
    }
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>2){
                    five=five-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
