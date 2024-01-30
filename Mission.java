package project;


import java.util.Date;

public class Mission extends Campaign {

	private String title;
	private String status;
	private Date fromDate;
	private Date toDate;
	
	public Mission()
	{
		fromDate = new java.util.Date();
		toDate = new java.util.Date();
	}
	
	public Mission(String id, String name, String t, String s)
	{   
		super(id, name);
		title = t;
		status = s;
		fromDate = new java.util.Date();
		toDate =  new java.util.Date();
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public void setStatus(String s)
	{
		status = s;
	}
	
	public void setFromDate(Date d)
	{
		fromDate = d;
	}
	
	public void setToDate(Date d)
	{
	 	toDate = d;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getStatus()
	{
		return status;
	}

	public java.util.Date getFromDate()
	{
		return fromDate;
	}
	
	public java.util.Date getToDate()
	{
		return toDate;
	}
	
	@Override
	public String toString()
	{
		return "\n Mission title: " + title +
				"\n Start date: " + fromDate + "\n End date: " + toDate + "\n Status:" + status;
	}
}
