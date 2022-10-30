package com.chenshanmugarajah.truehousecost.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Service;

@Service
public class TravelService {

	public TravelService() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTravelDetails(String startLocation, String endLocation) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest getRequest = (HttpRequest) HttpRequest.newBuilder()
				.uri(new URI("https://api.external.citymapper.com/api/1/directions/transit?start=" + startLocation + "&end=" + endLocation))
				.header("Citymapper-Partner-Key", "xJCJ7juC7tZLKBW2TXShONKJb6k4M66h")
				.GET()
				.build();
		HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		return getResponse.body();
	}

}
