package structural.adapter;

public class MobilePhone {
	
	public static void main(String[] args)
	{
		MobilePhone phone = new MobilePhone();
		phone.chargeMobile();
	}
	
	public void chargeMobile()
	{
		Target target = new MobilePhoneCharager();
		System.out.println("Mobile phone is charging with "+target.get10Volt().getVolt()+" Volts");
	}

}
