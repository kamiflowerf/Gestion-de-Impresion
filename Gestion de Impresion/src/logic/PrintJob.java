package logic;

import java.util.Date;

/*Representa un trabajo de impresión con atributos
para el usuario, la hora de envío y la prioridad.*/
public class PrintJob {
	
	private String userName;
	private Date sentDate;
	private String priority;
	
	//Constructor
	public PrintJob(String userName, Date sentDate, String priority) {
		super();
		this.userName = userName;
		this.sentDate = sentDate;
		this.priority = priority;
	}
	
	//Getters and setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
}
