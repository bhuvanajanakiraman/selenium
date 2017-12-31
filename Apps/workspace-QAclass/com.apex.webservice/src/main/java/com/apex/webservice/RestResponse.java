package com.apex.webservice;

public class RestResponse {

	private int statuscode;
	private String responsebody;
	

	public int getStatuscode() {
		return statuscode;
	}

	public String getResponsebody() {
		return responsebody;
	}

	public RestResponse(int statuscode, String responsebody) {
		super();
		this.statuscode = statuscode;
		this.responsebody = responsebody;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("statuscode :%1s body : %2s", this.statuscode,this.responsebody);
}
		
	
}

