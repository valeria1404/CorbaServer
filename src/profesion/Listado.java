package profesion;

import java.io.Serializable;
import java.util.Date;

public class Listado implements Serializable{
	private long numList;
	private String CodeSociety;
	private Date dateList;
	private double ValAction;
	
	public long getNumList() {
		return numList;
	}
	public void setNumList(long numList) {
		this.numList = numList;
	}
	public String getCodeSociety() {
		return CodeSociety;
	}
	public void setCodeSociety(String codeSociety) {
		CodeSociety = codeSociety;
	}
	public Date getDateList() {
		return dateList;
	}
	public void setDateList(Date dateList) {
		this.dateList = dateList;
	}
	public double getValAction() {
		return ValAction;
	}
	public void setValAction(double valAction) {
		ValAction = valAction;
	}
	
	public String toString () {
		return("Num="+numList+ "Date="+dateList+"Society="+CodeSociety+"ValAction"+ValAction);
		
	}
	
	
	
}
