package BigNumbers;

import java.math.BigInteger;

public class bigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger A = BigInteger.valueOf(989898);
BigInteger B = BigInteger.valueOf(989898);
//A.add(B);
int r = 3009090;
BigInteger C = BigInteger.valueOf(1);
for(long i = 1;i<=r;i++) {
	C = C.multiply(BigInteger.valueOf(i));
}
System.out.println(C);

	}

}
