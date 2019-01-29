package com.volvo.mfg.commonexceptions;

import org.openqa.selenium.WebDriverException;

public class ElementNotVisible extends WebDriverException{
	
	private static final long serialVersionUID = 2L;

	public ElementNotVisible() {
		super();}
	
	public ElementNotVisible(String message){
		super(message);}
	
	public ElementNotVisible(String message, Throwable thr){
		super(message, thr);}
}
