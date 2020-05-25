package com.meritamerica.assignment7_v2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
 public class NegativeAmountException extends Exception {
	
	public NegativeAmountException(String msg) {
	super(msg);

}
}
