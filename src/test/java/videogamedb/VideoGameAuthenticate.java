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

public class VideoGameAuthenticate extends Simulation {

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://www.videogamedb.uk/api")
            .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
            .acceptHeader("application/json")
            .contentTypeHeader("application/json");

    private static ChainBuilder authenticate = exec(http("Authentication to gaming db")
            .post("/authenticate")
            .body(StringBody(
                    "{\n" +
                            "  \"password\": \"admin\",\n" +
                            "  \"username\": \"admin\"\n" +
                            "}"
            )).check(jmesPath("token").saveAs("access")));

    private static ChainBuilder CreateaGame = exec(http("creating a game")
            .post("/videogame")
            .header("Authorization","Bearer #{access}")
            .body(StringBody(
                    "{\n" +
                            "  \"category\": \"Platform\",\n" +
                            "  \"name\": \"PUBG\",\n" +
                            "  \"rating\": \"Mature\",\n" +
                            "  \"releaseDate\": \"2019-05-04\",\n" +
                            "  \"reviewScore\": 85\n" +
                            "}"
            )));

    public static ScenarioBuilder scenario = scenario("Authenticate")
            .exec(authenticate)
            .exec(CreateaGame);

    {
        setUp(scenario.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
    }
}
