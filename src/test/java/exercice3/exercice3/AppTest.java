package exercice3.exercice3;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void test() {
    	Manager m1=new Manager(20);
    	vendeur v1=new vendeur(10);
    	vendeur v2=new vendeur(20);
    	emploie e1=new emploie (2010);
    	emploie e2=new emploie (2020);
    	ArrayList <allEmploie> listEmploie=new ArrayList <allEmploie>(); 
    	listEmploie.add(e1);
    	listEmploie.add(e2);
    	listEmploie.add(v1);
    	listEmploie.add(v2);
    	listEmploie.add(m1);
    	double salaireTotal=0;
    	for (int i=0;i<listEmploie.size();i++) {
    		salaireTotal += listEmploie.get(i).salaire();
    	}
    	
    }
}
