package com.chenshanmugarajah.truehousecost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenshanmugarajah.truehousecost.dto.ResponseOrderDTO;
import com.chenshanmugarajah.truehousecost.dto.UserOrderDTO;
import com.chenshanmugarajah.truehousecost.service.CarInsuranceService;
import com.chenshanmugarajah.truehousecost.service.LawyerService;
import com.chenshanmugarajah.truehousecost.service.MortgageService;
import com.chenshanmugarajah.truehousecost.service.StampDutyService;
import com.chenshanmugarajah.truehousecost.service.TravelService;

import java.io.IOException;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("api/v1/")
public class TrueHouseCostController {

	private MortgageService mortgageService;
	private StampDutyService stampDutyService;
	private CarInsuranceService carInsuranceService;
	private TravelService travelService;
	private LawyerService lawyerService;
	
	@Autowired
	public TrueHouseCostController(MortgageService mortgageService, StampDutyService stampDutyService, CarInsuranceService carInsuranaceService, TravelService travelService, LawyerService lawyerService) {
		super();
		this.mortgageService = mortgageService;
		this.stampDutyService = stampDutyService;
		this.carInsuranceService = carInsuranaceService;
		this.travelService = travelService;
		this.lawyerService = lawyerService;
	}
	
	private Logger logger = LoggerFactory.getLogger(TrueHouseCostController.class);
	
	@PostMapping(value = "/calculateTrueHouseCost")
	public ResponseEntity<ResponseOrderDTO> calculateTrueHouseCost(@RequestBody UserOrderDTO uod) {
		logger.info("Request payload: " + uod.toString());
		ResponseOrderDTO rod = new ResponseOrderDTO();
		
		double mortgageMonthlyPayment = mortgageService.getMonthlyPayment(uod.getMortgageTerm(), uod.getMortgageRate(), uod.getDeposit(), uod.getPurchasePrice());
		double stampDuty = stampDutyService.calculateStampDuty(uod.getPurchasePrice(), uod.getIsFirstTimeBuyer(), uod.getIsAdditionalProperty());
		double carInsurance = 0.0;
		try {
			carInsurance = carInsuranceService.getCarInsuranceAverage(uod.getCouncilName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String travelData = "";
		try {
			travelData = travelService.getTravelDetails("51.524247,-0.106410", "51.507752,-0.110081");
		} catch (URISyntaxException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
		double lawyerFees = lawyerService.calculateLawyerFees(uod.getPurchasePrice(), uod.isNewBuild(), uod.isGovernmentScheme(), uod.isHelpToBuyISA(), uod.isLifetimeISA(), uod.isRightToBuyScheme(), uod.isAuction(), uod.isLeaseHold(), uod.isEngland());
		
		rod.setMortgageMonthlyPayment(mortgageMonthlyPayment);
		rod.setStampDuty(stampDuty);
		rod.setCarInsurance(carInsurance);
		rod.setCityMapperData(travelData);
		rod.setLawyerFees(lawyerFees);
		rod.setTotalFees(mortgageMonthlyPayment + stampDuty + carInsurance + lawyerFees);
		
		return ResponseEntity.ok(rod);
	}

}
