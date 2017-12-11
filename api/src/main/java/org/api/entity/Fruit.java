package org.api.entity;

import java.io.Serializable;

import lombok.Data;
@Data
public class Fruit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3079919799846017137L;
	
	private int id;
	
	private String fruitName;
	
	private String fruitColor;

}
