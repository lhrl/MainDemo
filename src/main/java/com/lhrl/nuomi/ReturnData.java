package com.lhrl.nuomi;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class ReturnData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7748681426907714261L;

}
