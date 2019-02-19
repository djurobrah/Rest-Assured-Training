import io.restassured.http.ContentType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.get;
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

    @Test
    public void test_postComment()
    {
        Comment comment = new Comment("Telo komentara!", 5);
        //@formatter:off
        given().
                contentType("application/json; charset=utf-8").
                body(comment).
        when().
                post("http://localhost:3000/comments").
        then().
                assertThat().
                    statusCode(201).
                    and().
                    body(matchesJsonSchemaInClasspath("comment-schema.json"));
        //@formatter:on
    }
}
