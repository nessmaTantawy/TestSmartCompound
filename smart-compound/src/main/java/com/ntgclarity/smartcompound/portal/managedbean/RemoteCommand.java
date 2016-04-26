package com.ntgclarity.smartcompound.portal.managedbean;

import java.util.Map;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.ntgclarity.smartcompound.common.entity.Employee;

@ManagedBean
public class RemoteCommand {
	
	public void execute(){

		  FacesContext context = FacesContext.getCurrentInstance();
		    Map<String, String> map = context.getExternalContext().getRequestParameterMap();
		    String parameter1 = map.get("parameter1");
		    String parameter2 = map.get("parameter2");
		    
		    System.out.println(parameter1 );
		    System.out.println(parameter2);
		    
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "RemoteCommand", "parameter1 ="+parameter1+"\n parameter2 ="+parameter2));

	}

}
