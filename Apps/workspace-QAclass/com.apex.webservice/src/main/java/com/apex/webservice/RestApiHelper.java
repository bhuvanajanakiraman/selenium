package com.apex.webservice;

import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestApiHelper {

	public static RestResponse performGetRequest(String url, Map<String, String> headers) {

		try {
			HttpClient client = HttpClientBuilder.create().build();
			// create a request

			HttpGet request = new HttpGet(url);
			if (headers != null) {
				for (String str : headers.keySet()) {
					request.addHeader(str, headers.get(str));

				}

			}

			// create the response message
			HttpResponse response = client.execute(request);
			ResponseHandler<String> body = new BasicResponseHandler();
			RestResponse restResponse = new RestResponse(response.getStatusLine().getStatusCode(),
					body.handleResponse(response));
			return restResponse;

			// System.out.println(restResponse);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
