package cmd_prompt;

import java.util.Scanner;

public class serach_in_matrix {
static int search(int arr[][],int target,int row,int column) {
	for(int i =0;i<column;i++) {
		if(arr[0][i] == target | arr[row-1][i] == target) {
			return target;
		}else {
			if(arr[0][i] < target & arr[row-1][i] > target) {
				return serchIn1D(arr,target,row,column,i);
			}
		}
	}
	return -1;
}
static int serchIn1D(int arr[][],int target,int row,int column,int sColumn) {
	for(int i = 1;i<row-1;i++) {
		if(arr[i][sColumn] == target) {
			return target;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is an optimization of linear search in 2D array
Scanner sc = new Scanner(System.in);
int row = 2;
int column =2;
int arr[][] = new int[row][column];
for(int i =0;i<row;i++) {
	for(int j =0;j<column;j++) {
		arr[i][j] = sc.nextInt();
		
	}
}
for(int i =0;i<row;i++) {
	for(int j =0;j<column;j++) {
		System.out.print(arr[i][j] + " ");
	}
	System.out.println();
}
System.out.println(search(arr,4,row,column));
	}

}
