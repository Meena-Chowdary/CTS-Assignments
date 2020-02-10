package com.cts.matrices.ui;

public class MatTranspose{
	static int[][] transpose(int[][] m1,int r,int c){
		int[][] res=new int[c][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				res[j][i]=m1[i][j];
		}
		return res;
	}
	public static void main(String[] args) {
		int r=3,c=3;
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] output=transpose(mat,r,c);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print("\t"+output[i][j]);
			System.out.println("\n");
		}
	}
}