package UsingObjectsParameters;

//Returning an object.
class ReturnObject {
int a;

ReturnObject(int i) {
a = i;
}

ReturnObject incrByTen() {
	ReturnObject temp = new ReturnObject(a+10);
return temp;
}
}
