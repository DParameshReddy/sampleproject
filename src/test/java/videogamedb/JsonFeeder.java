package videogamedb;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class JsonFeeder extends Simulation {
    private HttpProtocolBuilder httpprotocol = http
            .baseUrl("https://www.videogamedb.uk/api")
            .acceptHeader("application/json")
            .contentTypeHeader("application/json");

    //private static FeederBuilder.FileBased<String> csvFeeder =csv("Data/csvFeeder.csv").circular();
private static FeederBuilder.FileBased<Object> jsonFeeder = jsonFile("Data/jsonFeeder.json").random();

    private static ChainBuilder getspecificGame =
            feed(jsonFeeder)
                    .exec(http("create video game - #{name}")
                            .get("/videogame/#{id}")
                            .check(jmesPath("name").isEL("#{name}"))
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
            .repeat(2).on(
                    exec(getspecificGame)
                            .pause(2)
            );
    {
        setUp(scn.injectOpen(atOnceUsers(5))).protocols(httpprotocol);
    }
}
