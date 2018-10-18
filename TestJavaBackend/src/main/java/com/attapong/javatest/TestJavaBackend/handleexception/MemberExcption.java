package com.attapong.javatest.TestJavaBackend.handleexception;

public class MemberExcption extends Exception {
	private static final long serialVersionUID = -2944845369414013811L;

	private String serviceName;
	private String errorCode;
	
	public MemberExcption(Throwable e) {
		super(e);
	}
	
	public MemberExcption(String serviceName, String errorCode, String errorMessage) {
		super(errorMessage);
		this.serviceName = serviceName;
		this.errorCode = errorCode;
	}
	
	public MemberExcption(String serviceName, String errorCode, String errorMessage, Throwable e) {
		super(errorMessage, e);
		this.serviceName = serviceName;
		this.errorCode = errorCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}