package com.maruthi.dell;

class Sales implements Department{

	private String name;

	public void setName(String sName){
		this.name = sName;		
	}

	public void display(){

		System.out.println(getClass().getName());
		System.out.println("Name :" + name);		
	}	
}