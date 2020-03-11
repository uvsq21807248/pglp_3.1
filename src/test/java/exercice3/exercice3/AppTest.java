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
    	emploie e1=new emploie (2010);
    	emploie e2=new emploie (2020);
    	ArrayList <allEmploie> listEmploie=new ArrayList <allEmploie>(); 
    	listEmploie.add(e1);
    	listEmploie.add(e2);
    }
    	
    }

