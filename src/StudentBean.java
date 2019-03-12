
public class StudentBean 
{
	private int rollno;
	private String name;
	private AdressBean ad;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAd(AdressBean ad) {
		this.ad = ad;
	}
	public void printStudentInfo()
	{
		System.out.println("rollno="+rollno+"name="+name);
		ad.printAddress();
	}
	
	
}
