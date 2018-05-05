package Inheritance;

//Here, Box is extended to include weight.
//BoxWeight now uses super to initialize its Box attributes.
class BoxWeight extends Box {
	double weight; // weight of box
	// initialize width, height, and depth using super()
	
	// construct clone of an object
	BoxWeight(BoxWeight ob) { // pass object to constructor
	super(ob);
	weight = ob.weight;
	}
	//	constructor for BoxWeight
	// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
	super(w, h, d); // call superclass constructor
	weight = m;
	}
	
	// default constructor
	BoxWeight() {
	super();
	weight = -1;
	}
	// constructor used when cube is created
	BoxWeight(double len, double m) {
	super(len);
	weight = m;
	}
	
}