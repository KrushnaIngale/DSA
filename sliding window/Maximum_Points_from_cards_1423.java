public class Maximum_Points_from_cards_1423 {
    public static void main(String[] args) {
        int[] cardPoints={1,2,3,4,5,6,1};
        int k=3;
        Maximum_Points_from_cards_1423 m=new Maximum_Points_from_cards_1423();
        System.out.println(m.maxScore(cardPoints,k));
    }
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum=leftSum;
        int rt=cardPoints.length-1;
        for(int i=k-1;i>-1;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[rt--];
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}
