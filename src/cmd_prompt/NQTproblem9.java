package cmd_prompt;


public class NQTproblem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,20,3,10,5};
int max =0;
int secMax =0;
int lc =0;
for(int i =0;i<arr.length;i++) {
	if(max < arr[i]) {
	lc = i;
		max = arr[i];
	}
}
int temp = arr[arr.length-1];
arr[arr.length-1] = max;
arr[lc] = temp;
max =0;
for(int i =0;i<arr.length;i++) {
	if(max < arr[i]) {
	secMax = max;
		max = arr[i];
	}
}
System.out.println("Secondary Maximum : " + secMax);
System.out.println("Final Maximum : " + max);
	}

}
