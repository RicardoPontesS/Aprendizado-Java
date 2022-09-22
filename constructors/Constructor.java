public class Constructor {
	
	public static void main(String[] args) {
		Car van = new Car("fiat", "ducato", 10, 45, 9);
		
		System.out.println("Marca: "+van.brand);
		System.out.println("Modelo: "+van.model);
		System.out.println("Numero de passageiros: "+van.passengersNumber);
		System.out.println("Capacidade de combustivel: "+van.fuelCapacity);
		System.out.println("Consumo de combustivel: "+van.fuelConsumption);
	}
	
}
