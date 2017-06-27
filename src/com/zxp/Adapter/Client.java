package com.zxp.Adapter;

public class Client {
	public static void main(String[] args){
		
		Target concreteTarget=new ConcreteTarget();
		concreteTarget.request();
		
		Target adpter=new Adapter();
		adpter.request();
	}
	
}
