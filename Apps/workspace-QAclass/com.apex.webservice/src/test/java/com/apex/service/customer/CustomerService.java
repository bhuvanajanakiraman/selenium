package com.apex.service.customer;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerService {

	@Test
	public void testwithcredentials() throws ClientProtocolException, IOException {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/3";

		// create a client
		HttpClient client = HttpClientBuilder.create().build();
		// create a request

		HttpGet request = new HttpGet(url);

		// create the response message
		HttpResponse response = client.execute(request);

		// get the response message
		int statuscode = response.getStatusLine().getStatusCode();
		System.out.println(statuscode);
		// get the status msg
		String statusmsg = response.getStatusLine().getReasonPhrase();
		System.out.println(statusmsg);
		// get the content from the response
		ResponseHandler<String> body = new BasicResponseHandler();
		String getbody = body.handleResponse(response);
		System.out.println(getbody);
		Assert.assertEquals(statuscode, 200);

	}
	


}
