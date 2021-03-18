package com.market79.webapp.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class Util {
	public void setDtoParameter(Object dto, HashMap<String, String> map) throws Exception {
		for(String key : map.keySet()){
	        for (Field field : dto.getClass().getDeclaredFields()){
	            field.setAccessible(true);
	            if(key.equals(field.getName())) {
	            	this.invokeMethod(dto, key, map.get(key));
	            }
	        }
        }
	}
	
	
	public void invokeMethod(Object obj, String methodToInvoke, Object value) throws Exception {
		Method[] methods = obj.getClass().getMethods();
        String firstString = methodToInvoke.substring(0, 1).toUpperCase();
        String modifiedString = "set" + firstString + methodToInvoke.substring(1, methodToInvoke.length());
        for (Method method : methods) {
            if (method.getName().equals(modifiedString)) {
                method.invoke(obj, value);
            }
        }
    }
}
