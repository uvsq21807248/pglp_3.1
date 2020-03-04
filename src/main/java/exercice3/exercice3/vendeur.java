package exercice3.exercice3;

public class vendeur extends allEmploie{
final private int base =2000;
private int commision;
public vendeur (int commision){ 
this.commision=commision;}
public double salaire(){return base+commision;}}

