package com.commonutils;

import java.util.HashMap;

import javax.naming.Context;



public class Pagecon {

private HashMap<Context, Object> pageContext = new HashMap();
    
    
    public void setPageContext(Context key, Object value) {
    	 pageContext.put(key, value);
    }
    
    public Object getPageContext(Context key) {
    	return pageContext.get(key);
    }
}
