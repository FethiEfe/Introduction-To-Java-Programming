package chapter05;
/*(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0 +
0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
more accurate results, carefully select the order of computation. For example, in
computing the following series, you will obtain more accurate results by computing
from right to left rather than from left to right:
1 +
1
2 +
1
3 + c +
1
n
Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.*/
public class Exercise_5_23 {

	public static void main(String[] args) {
	double n = 2;
	double sum = 0;
	while(n <= 50_000) {
		sum += 1/n;
		n++;
		
	
	}
	System.out.println(1+ sum);
	
	double n1 = 50_000;
	double sum1 = 0;
	while(n1 > 1) {
		sum1 += 1/n1;
		n1--;
		
	
	}
	System.out.println(1+ sum1);
	
	}
	

}
