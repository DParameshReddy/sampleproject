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
public class Demoapitest  extends Simulation {

     private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://jsonplaceholder.typicode.com")
            .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
            .acceptHeader("application/json");
private static ChainBuilder getPosts =
        repeat(2,"myCounter").on(
                exec(
                        http("getPosts :  #{myCounter}")
                                .get("/posts/#{myCounter}")
                                .check(status().is(200))
                               ));

    private static ChainBuilder getComments =
            repeat(3).on(
                    exec(http("getComments")
                            .get("/comments")
                            .check(status().is(200))
                            .check(jsonPath("$[1].id").is("2"))
                 ));




    private ScenarioBuilder scenario  = scenario("Demoapitest")
            .exec(getComments)
            .pause(4)
            .exec(getPosts)
            .pause(4)
            .exec(getComments);

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
