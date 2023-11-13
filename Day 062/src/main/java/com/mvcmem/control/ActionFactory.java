package com.mvcmem.control;

import com.mvcmem.action.Action;
import com.mvcmem.action.IdCheckAction;
import com.mvcmem.action.IndexAction;
import com.mvcmem.action.RegFormAction;
import com.mvcmem.action.zipCheckAction;
import com.mvcmem.action.RegProcAction;

public class ActionFactory {
	private static ActionFactory factory;
	private ActionFactory() {}
	
	public static synchronized ActionFactory getInstance() {
		if(factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
	
		switch(cmd) {
		case "index":
			action = new IndexAction();
			break;
		
		case "regForm":
			action = new RegFormAction();
			break;	
			
		case "regProc":
			action = new RegProcAction();
			break;
			
		case "idCheck":
			action = new IdCheckAction();
			break;
			
		case "zipCheck":
			action = new zipCheckAction();
			break;
		
		default:
			action = new IndexAction();
			break;
		}
		return action;
	}
}
