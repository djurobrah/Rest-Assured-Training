import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
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
                        statusCode(200).
                        and().
                        contentType(ContentType.JSON);
        //@formatter:on
    }

    @Test
    public void test_commentUsesSchema()
    {
        System.out.println(System.getProperty("java.class.path"));

        //@formatter:off
        given().
                when().
                    get("http://localhost:3000/comments/1").
                then().
                    assertThat().
                        statusCode(200).
                        and().
                        contentType(ContentType.JSON).
                        and().
                        body(matchesJsonSchemaInClasspath("comment-schema.json"));
        //@formatter:on
    }
}