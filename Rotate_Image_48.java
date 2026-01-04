class Rotate_Image_48 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Rotate_Image_48 rotator = new Rotate_Image_48();
        rotator.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void rotate1(int[][] matrix) {
        int[][]ans=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                ans[j][matrix.length-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for (int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i=0;i<matrix.length;i++){
            int l=0;int r=matrix.length-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}