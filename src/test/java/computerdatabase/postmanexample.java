package computerdatabase;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class postmanexample extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://videogamedb.uk")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("PostmanRuntime/7.31.1");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "928aa946-0d0e-47dc-91f2-d6822963f0ca")
  );
  
  private Map<CharSequence, String> headers_1 = Map.of("Postman-Token", "cf9a11a3-5980-49bc-96e2-4c47e21056bc");
  
  private Map<CharSequence, String> headers_2 = Map.of("Postman-Token", "63f4f42d-3710-4184-a29f-372000e2c585");
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "db4b9b67-5461-4fdc-9d04-2e3b4a83ed5f"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODk0NTg2MCwiZXhwIjoxNjc4OTQ5NDYwfQ.Oe4Uj6VUqPHZPOz2oqu1E-y757B1FX9qfoJ8wW5-Pp0")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "5dc94033-3665-486d-b02a-d434a957b44d"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODk0NTg2MCwiZXhwIjoxNjc4OTQ5NDYwfQ.Oe4Uj6VUqPHZPOz2oqu1E-y757B1FX9qfoJ8wW5-Pp0")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("Postman-Token", "b380a63c-9486-49c8-bebb-8a17f265aa8b"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODk0NTg2MCwiZXhwIjoxNjc4OTQ5NDYwfQ.Oe4Uj6VUqPHZPOz2oqu1E-y757B1FX9qfoJ8wW5-Pp0")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "ae3a1114-e3bd-4ff7-844c-7072f88e967d")
  );


  private ScenarioBuilder scn = scenario("postmanexample")
    .exec(
      http("request_0")
        .post("/api/authenticate")
        .headers(headers_0)
        .body(RawFileBody("computerdatabase/postmanexample/0000_request.json"))
    )
    .pause(1)
    .exec(
      http("request_1")
        .get("/api/videogame")
        .headers(headers_1)
    )
    .pause(1)
    .exec(
      http("request_2")
        .get("/api/videogame/2")
        .headers(headers_2)
    )
    .pause(1)
    .exec(
      http("request_3")
        .post("/api/videogame")
        .headers(headers_3)
        .body(RawFileBody("computerdatabase/postmanexample/0003_request.json"))
    )
    .pause(1)
    .exec(
      http("request_4")
        .put("/api/videogame/3")
        .headers(headers_4)
        .body(RawFileBody("computerdatabase/postmanexample/0004_request.json"))
    )
    .pause(1)
    .exec(
      http("request_5")
        .delete("/api/videogame/2")
        .headers(headers_5)
    )
    .pause(1)
    .exec(
      http("request_6")
        .post("/api/authenticate")
        .headers(headers_6)
        .body(RawFileBody("computerdatabase/postmanexample/0006_request.json"))
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
