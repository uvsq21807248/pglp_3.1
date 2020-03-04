package exercice3.exercice3;

public class Manager extends allEmploie {
private final  int base=1500;
private int NombresEmploies;

public Manager(int NombresEmploies) {
	this.NombresEmploies=NombresEmploies;
}

public double salaire(){
	return base+(NombresEmploies*100);
	}
}
