package project;



public class Resources extends Mission{
	
	private String resourceId;
	private String resourceName;
	
	public Resources()
	{}
	
	public Resources(String ResId, String ResName, String campName, String campId, String t, String s)
	{
		super(campName, campId, t, s);
		resourceId = ResId;
		resourceName = ResName;		
	}
	
	public void setResId(String id)
	{
		resourceId = id;
	}
	
	public void setResName(String name)
	{
		resourceName = name;
	}
	
	public String getResId()
	{
		return resourceId;
	}
	
	public String getResName()
	{
		return resourceName;
	}
	
	public String toString()
	{
		return super.toString() +"\n Resource ID: " + resourceId + "\n Resource Name:" 
								+ resourceName;
	}
}
