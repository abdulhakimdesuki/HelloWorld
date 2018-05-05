package UsingObjectsParameters;

class EqualObject {
  int a;
  int b;
  
  EqualObject(int par1, int par2){
	  a = par1;
	  b = par2;
  }
	
  boolean MtEqual (EqualObject Ob){
	  if (Ob.a==a && Ob.b==b) return true;
	  else
		  return false;
  }
}
