package com.ways.system.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	   private File myFile;
	   private String myFileContentType;
	   private String myFileFileName;
	   private String destPath;

  
	@Override
	public String execute(){
		String path="/opt/";
		File destFile=new File(path,myFileFileName);
		
		 try {
			FileUtils.copyFile(myFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			return this.ERROR;
		}
		
		return this.SUCCESS;
	}


	public File getMyFile() {
		return myFile;
	}


	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}


	public String getMyFileContentType() {
		return myFileContentType;
	}


	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}


	public String getMyFileFileName() {
		return myFileFileName;
	}


	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}


	public String getDestPath() {
		return destPath;
	}


	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	
	
}
