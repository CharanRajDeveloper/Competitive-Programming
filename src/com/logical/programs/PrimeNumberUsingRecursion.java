package com.logical.programs;

class PrimeNumberUsingRecursion {
	static boolean isPrime(int n, int i) {
		if (n <= 2) {
			return (n == 2) ? true : false;
		}
		if (n % i == 0) {
			return false;
		}
		if (i * i > n) {
			return true;
		}
		return isPrime(n, i + 1);
	}

	public static void main(String[] args) {
		int n = 47;
		if (isPrime(n, 2) == true)
			System.out.println("Yes, " + n + " is a Prime Number");
		else
			System.out.println("No, " + n + " is not a Prime Number");
	}
}
