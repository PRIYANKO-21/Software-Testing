package operations.matrix;

public class MatrixOperations {

    public int[][] additionOfMatrices(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1.length;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] subtractionOfMatrices(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1.length;
        int[][] result1 = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result1[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        return result1;
    }

    public int[][] matrixMultiplication(int[][] mat1,
                                        int[][] mat2) {
        int N = mat1.length;
        int[][] prod = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                prod[i][j] = 0;

                for (int k = 0; k < N; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return prod;
    }

    public int[][] powerMatrix(int[][] matrix, int power) {
        int N = matrix[0].length;
        int[][] result = new int[N][N];
        if(power<0){
            return null;
        }
        if(power == 0)
            return identityOfMatrix(N);

        else if(power == 1)
            return matrix;

        if(power % 2 == 0)
            result = powerMatrix(matrixMultiplication(matrix, matrix), power / 2);

        else
            result = matrixMultiplication(powerMatrix(matrixMultiplication(matrix, matrix), power / 2), matrix);

        return result;
    }

    // Function to return identity matrix of dimension N x N.
    public int[][] identityOfMatrix(int N) {
        int[][] I = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        }
        return I;
    }

    public int[][] transposeOfMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }

    public int determinant3x3(int[][] matrix){
        int d=matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[2][1]*matrix[1][2]);
        d=d-(matrix[1][0]*(matrix[0][1]*matrix[2][2]-matrix[0][2]*matrix[2][1]));
        d=d+(matrix[2][0]*(matrix[0][1]*matrix[1][2]-matrix[1][1]*matrix[0][2]));
        return d;
    }

    public int  matrixDeterminantOne(int A[][], int n)

    {

        //int n=3;
        int D = 0; // Initialize result

        //  Base case : if matrix contains single element
        if (n == 1)
            return A[0][0];

        else
            D=A[0][0]*A[1][1]-A[0][1]*A[1][0];

        return D;

    }


    // find the cofactor of given sub-matrix
    public int[][] getCofactorOfMatrix(int A[][], int p, int q, int n)
    {
        int i = 0, j = 0;
        int temp[][]=new int[2][2];
        // Looping for each element of the matrix
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                //  Copying into temporary matrix only those element
                //  which are not in given row and column
                if (row != p && col != q)
                {
                    temp[i][j++] = A[row][col];

                    // Row is filled, so increase row index and
                    // reset col index
                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
        return temp;
    }

    // find adjoint of matrix
    public  int[][] adjointOfMatrix(int A[][])
    {
        int N=3;
        int adj[][]=new int[3][3];
        if (N == 1)
        {
            adj[0][0] = 1;
            return adj;
        }

        // temp is used to store cofactors of A[][]
        int sign = 1;
        int temp[][]=new int[2][2];

        for (int i=0; i<N; i++)
        {
            for (int j=0; j<N; j++)
            {
                // Get cofactor of A[i][j]
                temp=getCofactorOfMatrix(A, i, j, N);

                // sign of adj[j][i] positive if sum of row
                // and column indexes is even.
                sign = ((i+j)%2==0)? 1: -1;

                // Interchanging rows and columns to get the
                // transpose of the cofactor matrix
                adj[j][i] = (sign)*(matrixDeterminantOne(temp,3));
            }
        }
        return adj;
    }

    // find the inverse of given matrix
    public float[][] inverseOfMatrix(int A[][])
    {
        int N=3;
        float [][] inverse=new float[3][3];
        // Find determinant of A[][]
        int det =determinant3x3(A);
        if (det == 0)
        {
            System.out.println("Singular matrix, can't find its inverse");
            return inverse;
        }

        // Find adjoint
        int adj[][]=new int[3][3];
        adj=adjointOfMatrix(A);

        // Find Inverse using formula "inverse(A) = adj(A)/det(A)"
        for (int i=0; i<N; i++)
            for (int j=0; j<N; j++)
                inverse[i][j] = adj[i][j]/(float)(det);

        return inverse;
    }
}
