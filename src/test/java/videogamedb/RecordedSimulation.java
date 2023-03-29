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

public class RecordedSimulation extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://www.videogamedb.uk")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .acceptHeader("application/json")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36");
  


  private ScenarioBuilder scn = scenario("RecordedSimulation")
    .exec(
      http("Jsoncheck")
        .get("/api/videogame")
              //.check(status().is(200)).check(status().in(200,200)).check(status().not(400))
              //.check(jsonPath("$[?(@.id==2)].name").is("Gran Turismo 4"))
              .check(jmesPath("[? id == `2`].name").ofList().is(List.of("Gran Turismo 3")))

    )
    .pause(1)
    .exec(
      http("second")
        .get("/api/videogame")
              .check(jmesPath("[1].id").saveAs("gameId"))

    )
    .pause(10)
    .exec(
      http("THIRD - #{gameId}")
        .post("/api/authenticate")

        .body(RawFileBody("videogamedb/recordedsimulation/0002_request.json"))
    )
    .pause(2)
    .exec(
      http("fourth - ")
        .post("/api/videogame/#{gameId}")
        .check(jmesPath("name").is("Gran Turismo 4"))
        .body(RawFileBody("videogamedb/recordedsimulation/0003_request.json"))
    )
    .pause(1)
    .exec(
      http("Fifth")
        .put("/api/videogame/5")

        .body(RawFileBody("videogamedb/recordedsimulation/0004_request.json"))
    )
    .pause(1)
    .exec(
      http("LAst")
        .delete("/api/videogame/8")

    )
          .exec(
          session -> {
            //System.out.println(session);
            //System.out.println("Session id set to " + session.getString("gameId"));
            return session;
          }
          )

          .exec(
                  http("lateststatuscheck - ")
                          .post("/api/videogame/0")

                          .check(jmesPath("name").is("Gran Turismo 4"))
                          .check(bodyString().saveAs("responsebody"))
                          .body(RawFileBody("videogamedb/recordedsimulation/0003_request.json"))
          )
          .exec(
                  session -> {
                    System.out.println(session);
                    System.out.println("Responsebody is " +session.getString("responsebody") );
                    return session;
                  }
                  );


  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
