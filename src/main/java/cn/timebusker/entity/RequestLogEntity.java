package cn.timebusker.entity;

public class RequestLogEntity {
	
	private String requestUrl;
	
	private String requestType;
	
	private String requestParams;
	
	private String requestCategory;
	
	private String requestDesc;

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public String getRequestCategory() {
		return requestCategory;
	}

	public void setRequestCategory(String requestCategory) {
		this.requestCategory = requestCategory;
	}

	public String getRequestDesc() {
		return requestDesc;
	}

	public void setRequestDesc(String requestDesc) {
		this.requestDesc = requestDesc;
	}

}
