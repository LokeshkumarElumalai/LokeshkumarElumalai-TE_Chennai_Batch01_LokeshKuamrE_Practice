package com.te.thirdofoct;

public class AmazonTypeCastingTest {

	public static void main(String[] args) {
		
		    // UpCasting : FlipKartPayment ---->FlipKartTypeCasting
			AmazonTypeCasting fp1 = new AmazonPayment();
			fp1.product();

			// DownCasting : FlipKartTypeCasting ----->AddToKart
			AmazonAddToCart fp2 = (AmazonAddToCart) fp1;
			fp2.product();
			fp2.store();

			// DownCasting : AddToKart ----->FlipKartPayment
			AmazonPayment fp3 = (AmazonPayment) fp2;
			fp3.product();
			fp3.store();
			fp3.payment();

			// DownCasting : FlipKartTypeCasting ---->FlipKartPayment
			AmazonPayment fp4 = (AmazonPayment) fp1;
			fp4.product();
			fp4.store();
			fp4.payment();

			// UpCasting : AddToKart ---->FlipKartTypeCasting
			AmazonTypeCasting fp5 = new AmazonAddToCart();
			fp5.product();

			// DownCasting : FlipKartTypeCasting ----->AddToKart
			AmazonAddToCart fp6 = (AmazonAddToCart) fp1;
			fp6.product();
			fp6.store();

	}

}
