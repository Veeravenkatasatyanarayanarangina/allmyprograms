package com.example.demo.exception;

import java.util.NoSuchElementException;

import org.hibernate.PropertyNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Controller
@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model)
	{
		return "null pointer Exception ";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String handleParseException()
	{
		return "student id is null";
	}
	
	@ExceptionHandler(value = NoSuchElementException.class)
	public String handleNosuchElement()
	{
		return "id is not found please verify it....";
	}
}
