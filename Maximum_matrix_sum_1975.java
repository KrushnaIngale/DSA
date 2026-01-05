public class Maximum_matrix_sum_1975 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, -3},
            {-4, 5, 6},
            {7, 8, -9}
        };
        Maximum_matrix_sum_1975 solver = new Maximum_matrix_sum_1975();
        long result = solver.maxMatrixSum(matrix);
        System.out.println(result);
    }
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        long sum=0;
        int negCount=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value=matrix[i][j];
                sum+=Math.abs(value);
                if(value<0){
                    negCount++;
                }
                min=Math.min(min,Math.abs(value));
            }
        }
        if(negCount%2==0){
            return sum;
        }else{
            return sum-2*min;
        }
    }
}
