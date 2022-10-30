package com.chenshanmugarajah.truehousecost.service;

import org.springframework.stereotype.Service;

@Service
public class StampDutyService {

	public double calculateStampDuty(int purchasePrice, boolean isFirstTimeBuyer, boolean isAdditional) {
		double stampDuty = 0;
		// first time buyer and price under 625_000
		if (isFirstTimeBuyer && purchasePrice <= 625_000) {
			if (purchasePrice <= 425_000) {
				return 0;
			} else {
				stampDuty = (int) ((purchasePrice-425_000) * 0.05);
				return stampDuty;
			}
		}
		// not first time buyer or first time buyer with purchase price above 625_000
		if (purchasePrice > 1_500_000) {
			stampDuty += (int) ((purchasePrice-1_500_000) * (!isAdditional ? 0.12 : 0.15));
			purchasePrice -= (purchasePrice - 1_500_000);
		}
		if (purchasePrice > 925_000) {
			stampDuty += (int) ((purchasePrice-925_000) * (!isAdditional ? 0.10 : 0.13));
			purchasePrice -= (purchasePrice - 925_000);
		}
		if (purchasePrice > 250_000) {
			stampDuty += (int) ((purchasePrice-250_000) * (!isAdditional ? 0.05 : 0.08));
			purchasePrice -= (purchasePrice - 250_000);
		}
		if (isAdditional) {
			stampDuty += 250_000 * 0.03;
		}
		return stampDuty;
	}

}
