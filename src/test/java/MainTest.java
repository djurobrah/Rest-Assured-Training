import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import io.restassured.module.jsv.JsonSchemaValidator.*;

import static io.restassured.RestAssured.given;
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
        assertEquals(1, 1);
    }

    //@formatter:off
    //@formatter:on

    @Test
    public void test_StatusCodeShouldBe200()
    {
        //@formatter:off
        given().
                when().
                    get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                    assertThat().
                        statusCode(200);
        //@formatter:on
    }
}