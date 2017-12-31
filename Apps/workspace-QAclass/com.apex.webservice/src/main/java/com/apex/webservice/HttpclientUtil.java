package com.apex.webservice;

import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpclientUtil {
	
	public static HttpResponse getrequest(String url, Map<String,String>headers){
		
		
		try{
			HttpClient client = HttpClientBuilder.create().build();
			
			//create request
		HttpGet request=new HttpGet(url);
		if(headers!=null){
			for (String  str : headers.keySet()) {
				request.addHeader(str,headers.get(str));
				
			}
		}
		//get the response
		HttpResponse response1= client.execute(request);
		//get the responsebody

		ResponseHandler<String> responsebody=new BasicResponseHandler();
		 RestResponse response=new RestResponse(response1.getStatusLine().getStatusCode(), responsebody.handleResponse(response1));
		 return (HttpResponse) response ;
		}
		
		catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
	}

}
	public static HttpResponse postrequest(String url,String requestmsg){
		
		
		return null;
		
	}
	
}
