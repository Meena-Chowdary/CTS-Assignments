package com.cts.matrices.ui;

public class MatMul {
	static int[][] multiply(int[][] m1,int[][] m2,int r1,int c1,int c2){
		int[][] res=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++)
					res[i][j]+=m1[i][k]*m2[k][j];
		}
		}
		return res;
	}
	public static void main(String[] args) {
		int r1=2,c1=2,r2=2,c2=2;
		int[][] mat1= {{1,2},{4,5}};
		int[][] mat2= {{1,1},{1,1}};
		if(c1==r2) {
			int[][] output=multiply(mat1,mat2,r1,c1,c2);
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++)
					System.out.print("\t"+output[i][j]);
				System.out.println("\n");
			}
		}else 
			System.out.println("Enter values such that c1 and r2 are same");
	}
}
