package operations.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixOperationsTest {

    @Test
    public void testMatrixAdd(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{5,6},{7,8}};
        int[][] expected={{6,8},{10,12}};
        int[][] actual=matrixOperations.additionOfMatrices(matrix1,matrix2);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testMatrixSubtract(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{5,6},{7,8}};
        int[][] expected={{4,4},{4,4}};
        int[][] actual=matrixOperations.subtractionOfMatrices(matrix2,matrix1);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testMatrixMultiply(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{5,6},{7,8}};
        int[][] expected={{19,22},{43,50}};
        int[][] actual=matrixOperations.matrixMultiplication(matrix1,matrix2);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testPower1(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] expected={{1,0},{0,1}};
        int[][] actual=matrixOperations.powerMatrix(matrix1,0);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testPower2(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] expected={{1,2},{3,4}};
        int[][] actual=matrixOperations.powerMatrix(matrix1,1);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testPower3(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] expected={{7,10},{15,22}};
        int[][] actual=matrixOperations.powerMatrix(matrix1,2);
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testPower4(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] matrix1={{1,2},{3,4}};
        int[][] actual=matrixOperations.powerMatrix(matrix1,-2);
        Assertions.assertNull(actual);
    }

    @Test
    public void testTranspose(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] mat={{1,2},{3,4}};
        int[][] expected={{1,3},{2,4}};
        int[][] actual=matrixOperations.transposeOfMatrix(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testInverse1(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] mat={{1,0,0},{0,1,0},{0,0,1}};
        float[][] expected={{1,0,0},{0,1,0},{0,0,1}};
        float[][] actual=matrixOperations.inverseOfMatrix(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testInverse2(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] mat={{0,0,0},{0,0,0},{0,0,0}};
        float[][] expected={{0,0,0},{0,0,0},{0,0,0}};
        float[][] actual=matrixOperations.inverseOfMatrix(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                Assertions.assertEquals(expected[i][j],actual[i][j]);
            }
        }
    }

    @Test
    public void testDeterminant3x3(){
        MatrixOperations matrixOperations=new MatrixOperations();
        int[][] mat={{1,2,6},{4,5,11},{10,12,2}};
        int actual=matrixOperations.determinant3x3(mat);
        Assertions.assertEquals(70,actual);

    }
}
