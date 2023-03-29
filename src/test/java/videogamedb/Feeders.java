package videogamedb;

import java.time.Duration;
import java.util.*;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;
import io.gatling.core.scenario.Scenario;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;
public class Feeders extends Simulation{
     private HttpProtocolBuilder httpprotocol = http
             .baseUrl("https://www.videogamedb.uk/api")
             .acceptHeader("application/json")
             .contentTypeHeader("application/json");

    private static FeederBuilder.FileBased<String> csvFeeder =csv("Data/csvFeeder.csv").circular();


    private static ChainBuilder getspecificGame =
            feed(csvFeeder)
                    .exec(http("create video game - #{gameId}")
                            .get("/videogame/#{gameId}")
                            .check(jmesPath("name").isEL("#{gameName}"))
                            .check(bodyString().saveAs("responsebody"))
                  )
                    .exec(
                            session -> {
                                System.out.println("session");
                                System.out.println("responsebodyis :" + session.getString("responsebody"));
                                return session;
                            }
                    );

    private ScenarioBuilder scn = scenario("getvideogame")
            .repeat(10).on(
                    exec(getspecificGame)
                            .pause(2)
            );
    {
        setUp(scn.injectOpen(atOnceUsers(5))).protocols(httpprotocol);
    }
    }




