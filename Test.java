package com.lata.demo.core.collections;

import java.util.TreeMap;

public class Test{

    private static TreeMap<String,String> data;

    static {data=new TreeMap();}
    
    public String getingNumber(String name ) {
    	if(name==null || !data.containsKey(name))
    		return null;
    	else
    		return data.get(name);
    	}

    public boolean getingName(String number){ 
    	if(number==null || !data.containsValue(number))
    		return false;
    	else
    		return true;
    	}

    public boolean putingNumber( String name, String number ) {
    	if(name==null && number==null)
    		return false;
    	else
    	{
    		data.put(name, number);
    		return true;
    	}
    	}

    public TreeMap<String,String> printing() {return data; }

}
