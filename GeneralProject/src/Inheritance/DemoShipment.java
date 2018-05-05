package Inheritance;

class DemoShipment {

	public static void main(String[] args) {
    Shipment  Shipment1 = new Shipment(10, 20, 15, 10, 3.41);
    Shipment  Shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
    double vol;

    vol = Shipment1.volume();
    System.out.println("Volume of shipment1 is " + vol);
    System.out.println("Weight of shipment1 is "  + Shipment1.weight);
    System.out.println("Shipping cost: $" + Shipment1.cost);
    System.out.println();
    
    vol = Shipment2.volume();
    System.out.println("Volume of shipment2 is " + vol);
    System.out.println("Weight of shipment2 is "
    + Shipment2.weight);
    System.out.println("Shipping cost: $" + Shipment2.cost);
	}

}
