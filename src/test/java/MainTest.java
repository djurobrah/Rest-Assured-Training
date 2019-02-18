import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.* ;
import org.hamcrest.Matchers.*;

import io.restassured.module.jsv.JsonSchemaValidator.*;

import static org.junit.Assert.*;



public class MainTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void main()
    {
        assertEquals(1,1);
    }

    @Test
    public void test1()
    {
        assertEquals(1,1);
    }
}