package com.volvo.mfg.commonexceptions;
import org.openqa.selenium.WebDriverException;

public class ElementNotEditable extends WebDriverException{

		private static final long serialVersionUID = 2L;

		public ElementNotEditable() {
			super();}
		
		public ElementNotEditable(String message){
			super(message);}
		
		public ElementNotEditable(String message, Throwable thr){
			super(message, thr);}
}
