package com.wayx.system.modle;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

public class User implements ServletContextAware,ServletRequestAware,ServletResponseAware,SessionAware{
  private String userName;
  private String password;
  private HttpServletResponse response;
  private HttpServletRequest request;
  private ServletContext servletContext;
  private Map sessionMap;
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response=arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}

	@Override
	public void setServletContext(ServletContext arg0) {
	  this.servletContext=arg0;
	}
	public String login(){
		
		
		 String referer="";
		 if("".equals(referer))return "success";
		  userName=request.getParameter("userName");
		  password=request.getParameter("password");
		  
		 if(null!=referer&&userName.length()>0&&password.length()>0){
			  int onlineUserCount=0;
			  synchronized(servletContext){
				  try{
					  onlineUserCount=(Integer)servletContext.getAttribute("onlineUserCount");
				  }catch(Exception e){
					  e.printStackTrace();
				  }
				  servletContext.setAttribute("onlineUserCount", onlineUserCount+1);
			  }
			 return "success";
			 
		 }else{
			 return "input";
		 }
		
	}
	public String logout(){
		if(sessionMap instanceof SessionMap){
			((SessionMap)sessionMap).invalidate();
		}
		
		int onlineUserCount=0;
		synchronized(servletContext){
			try{
				onlineUserCount=(Integer)servletContext.getAttribute("onlineUserCount");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			servletContext.setAttribute("onlineUserCount", onlineUserCount-1);
		}
		return "success";
	}

	@Override
	public void setSession(Map arg0) {
		this.sessionMap=arg0;
	}

}
