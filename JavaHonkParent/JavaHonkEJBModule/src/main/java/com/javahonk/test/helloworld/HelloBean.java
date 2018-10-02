package com.javahonk.test.helloworld;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.script.ScriptEngineManager;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean implements Hello {
	ScriptEngineManager manager = new ScriptEngineManager(null);
    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello() {
		return "Hello World";
    	
    }

}
