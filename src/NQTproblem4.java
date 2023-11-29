
public class NQTproblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ip = 1234;
int R = 2;
int sum =0;
while(ip != 0) {
	sum = sum + ip%10;
	ip = ip/10;
}
int Rsum =0;
while(R != 0) {
	Rsum = Rsum + sum;
	R--;
}
int ans =0;
while(Rsum != 0) {
	ans = ans + Rsum%10;
	Rsum = Rsum/10;
}
System.out.println(ans);
	}

}
