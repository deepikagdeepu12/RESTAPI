package com.tap.rest.resource.service.copy;

import java.util.ArrayList;
import java.util.List;



import com.resouce.Model;

public class MyService 
{
	
	public  List<Model> get()
	{
		Model m1=new Model(1l,"helo","deep");
		Model m2=new Model(2l,"hiiii","bhanu");
		List<Model> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		
		
		return list ;
		
	}

}
