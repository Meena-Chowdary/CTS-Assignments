package com.cts.matrices.ui;

public class sort1D {
		static int [] sort(int [] a) {
			int n=a.length;
			int t;
			for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					if(a[i]>a[j]) {
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			return a;
		}
		public static void main(String [] args) {
			int [] arr={4,2,6,1};
			int len=arr.length;
			int [] res=sort(arr);
			System.out.println("Sorted 1D array is : ");
			for(int i=0;i<len;i++)
				System.out.print(res[i]+"\t");
		}

}
