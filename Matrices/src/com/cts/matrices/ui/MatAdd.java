package com.cts.matrices.ui;

public class MatAdd {
		public static void main(String[] args) {
			int [][] a={{1,2},{1,2}};
			int [][] b={{4,5},{4,5}};
			int [][]c=new int [2][2];
			int n_a=a.length;
			int n_b=b.length;
			if(n_a==n_b) {
				for(int i=0;i<n_a;i++) {
					for(int j=0;j<n_a;j++) {
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				for(int i=0;i<n_a;i++) {
					for(int j=0;j<n_a;j++) {
						System.out.print(c[i][j]+"\t");
					}
				System.out.println();
				}
			}
		}
	}
				
			
