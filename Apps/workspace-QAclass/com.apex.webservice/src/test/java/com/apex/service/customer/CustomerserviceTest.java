package com.apex.service.customer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerserviceTest {

	@Test
	public void TestwithexistingUsrer() throws Exception {
		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER/3";
		// Create the client

		HttpClient client = HttpClientBuilder.create().build();

		// create the Request message
		HttpGet request = new HttpGet(url);

		// create the response message
		HttpResponse response = client.execute(request);
		// assert status code
		int statuscode = response.getStatusLine().getStatusCode();
		AssertJUnit.assertEquals(statuscode, 200);
		System.out.println(statuscode);
		// assert status message
		String statusmsg = response.getStatusLine().getReasonPhrase();
		System.out.println(statusmsg);
		AssertJUnit.assertEquals(statusmsg, "OK");

		// Assert data
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line +"/n");
		}

		System.out.println(result.toString() );

		String responseString = result.toString();
		AssertJUnit.assertTrue(responseString.contains("<FIRSTNAME>Michael</FIRSTNAME>"));
		// Assert.assertTrue(responseString.endsWith("</CUSTOMER>"));

	}

	@Test
	public void TestPost() throws Exception {

		String url = "http://www.thomas-bayer.com/sqlrest/CUSTOMER";
		HttpClient client1 = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);
		StringEntity input = new StringEntity("<CUSTOMER>"+"<ID>456</ID>"+"<FIRSTNAME>Toshibis</FIRSTNAME>"+"<LASTNAME>Labamba</LASTNAME>"+"<STREET>542 Upland Pl.</STREET>"+"<CITY>Kharkiv</CITY>"+"</CUSTOMER>");
		post.setEntity(input);

		HttpResponse response1 = client1.execute(post);
	
		int statuscode = response1.getStatusLine().getStatusCode();
		AssertJUnit.assertEquals(statuscode, 201);
		System.out.println(statuscode);

		// assert status message

		String statusmsg = response1.getStatusLine().getReasonPhrase();
		System.out.println(statusmsg);
		AssertJUnit.assertEquals(statusmsg, "OK");

		BufferedReader br = new BufferedReader(new InputStreamReader((response1.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

	}

	public void TestUpdate() {
	}

	public void TestDelete() {

	}

}
