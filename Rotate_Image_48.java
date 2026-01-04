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
    public void rotate(int[][] matrix) {
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
}