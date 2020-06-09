package org.jux.samples.design.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class SnapNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(SnapNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String snapNotFoundHandler(SnapNotFoundException ex) {
		return ex.getMessage();
	}
}
