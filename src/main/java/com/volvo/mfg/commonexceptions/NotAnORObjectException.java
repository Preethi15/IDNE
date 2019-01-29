package com.volvo.mfg.commonexceptions;

public class NotAnORObjectException extends RuntimeException{
	
	private static final long serialVersionUID = 2L;

	public NotAnORObjectException(){
		super();
	}

	public NotAnORObjectException(String message){
		super(message);
	}
	
	public NotAnORObjectException(String message, Throwable cause){
		super(message, cause);
	}
}