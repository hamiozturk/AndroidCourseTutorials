
public class Maas extends Isci {

	private double maas;
	
	public Maas(String isim, String adres, int yas) {
		super(isim, adres, yas);
		// TODO Auto-generated constructor stub
		setMaas(maas);
	}
	
	public void mesajYaz(){
		System.out.println(getIsim() + " taraf�ndan iletildi. Maa� s�n�f�");
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	

}
