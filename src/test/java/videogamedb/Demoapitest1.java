
package videogamedb;
        import java.time.Duration;
        import java.util.*;

        import ch.qos.logback.core.CoreConstants;
        import ch.qos.logback.core.net.SyslogOutputStream;
        import io.gatling.javaapi.core.*;
        import io.gatling.javaapi.http.*;
        import io.gatling.javaapi.jdbc.*;

        import static io.gatling.javaapi.core.CoreDsl.*;
        import static io.gatling.javaapi.http.HttpDsl.*;
        import static io.gatling.javaapi.jdbc.JdbcDsl.*;
public class Demoapitest1  extends Simulation {

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://jsonplaceholder.typicode.com")
            .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
            .acceptHeader("application/json");


    private static ChainBuilder postMethod =
            exec(http("postMethod")
                    .post("/posts")
                    .body(StringBody(
                            "{\n" +
                                    "    title: 'Paramesh',\n" +
                                    "    body: 'posting',\n" +
                                    "    userId: 4125,\n" +
                                    "  }"
                    )));



    private ScenarioBuilder scenario  = scenario("Demoapitest")
            .exec(postMethod)
            .pause(4);


//             .exec(
//                     http("Second request")
//                             .get("/photos")
//                             .check(status().is(200))
//                             .check(bodyString().saveAs("photosresponse"))
//             )
//             .exec(
//                     session -> {
//                         System.out.println(session);
//                         System.out.println("session respose is" + session.getString("photosresponse"));
//                         return session; }
//             )
//
//
//             .exec(
//                     http("first request")
//                             .get("/comments")
//                             .check(status().is(200))
//                             .check(bodyString().saveAs("Bodyresponse"))
//
//             )
//             .exec(
//                     session -> {
//                         System.out.println(session);
//                         System.out.println("session respose is" + session.getString("Bodyresponse"));
//                         return session;
//                     }
//             );

    {
        setUp(scenario.injectOpen(atOnceUsers(10))).protocols(httpProtocol);
    }













}
