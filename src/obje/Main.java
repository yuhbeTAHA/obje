package obje;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();

		product.setName("Casper bilmemne");
		product.setPrice(14587.48);
		product.setDiscoundRate(18);
		System.out.println(product.getName());
		System.out.println("Fiyat" + product.getPrice());
		System.out.println("�ndirimli Fiyat" + product.getLastPrice());
	}

}
