package com.cts.matrices.ui;

public class SumOfElements {
		static int[] allSum(int[][] m1,int r,int c) {
			int[] res=new int[4];
			int us=0,ls=0,ps=0,sc=0;
			if(r==c) {
				  for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						if(i<j) 
							res[0]=us+m1[i][j];
						else if(j<i)
							res[1]=ls+m1[i][j];
						else if(i==j)
							res[2]=ps+m1[i][j];
						else if((i+j)==(r-1))
							res[3]=sc+m1[i][j];
					}
				}

				}
				return res;
		}
		public static void main(String[] args) {
			int r=3,c=3;
			int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
			int[] out=allSum(mat,r,c);
			System.out.println("Upper sum is :"+ out[0]);
			System.out.println("lower sum is :"+ out[1]);
			System.out.println("principal sum is :"+ out[2]);
			System.out.println("secondary sum is :"+ out[3]);
		}
	}
