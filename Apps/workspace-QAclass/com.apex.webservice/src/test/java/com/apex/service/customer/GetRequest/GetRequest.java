package com.apex.service.customer.GetRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.webservice.RestApiHelper;
import com.apex.webservice.RestResponse;

public class GetRequest {

	@Test
	public void testwithcredentials() throws ClientProtocolException, IOException {

		RestResponse response = RestApiHelper.performGetRequest("http://www.thomas-bayer.com/sqlrest/CUSTOMER/3", null);

		System.out.println(response.toString());
		Assert.assertEquals(response.getStatuscode(), 200);

	}

	@Test
	public void testwithallcredential() throws Exception {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "application/xml");
		RestResponse response = RestApiHelper.performGetRequest("http://www.thomas-bayer.com/sqlrest/CUSTOMER/",
				headers);
		Assert.assertEquals(response.getStatuscode(), 200);
		System.out.println(response.getResponsebody());

	}
	@Test
	public void testwithwrongcredential() throws Exception{
		
		String url="http://www.thomas-bayer.com/sqlrest/CUSTOMER/50";
		
		Map<String,String>headers=new HashMap<String,String>();
		headers.put("Accept", "application/xml");
		headers.put("Accept", "application/json");
	RestResponse response=RestApiHelper.performGetRequest(url, headers);
	System.out.println(response.toString());
		System.out.println(response.getResponsebody());
	}
	
																																																																																																																																																																																																																																																																																																																																																																																																																																				
}