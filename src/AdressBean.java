
public class AdressBean 
{
	private int flatno;
	private String city;
	private int pin;
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void printAddress()
	{
		System.out.println("flatno="+flatno+"city="+city+"pin="+pin);
	}
	

}
