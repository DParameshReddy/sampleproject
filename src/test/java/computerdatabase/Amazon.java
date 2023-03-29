package computerdatabase;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Amazon extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://fls-eu.amazon.in")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
  ;
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("accept", "text/html, */*; q=0.01"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536"),
    Map.entry("x-requested-with", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("content-type", "text/plain;charset=UTF-8"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "text/plain;charset=UTF-8"),
    Map.entry("Origin", "https://www.amazon.in"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_7 = Map.ofEntries(
    Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("cache-control", "max-age=0"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "none"),
    Map.entry("sec-fetch-user", "?1"),
    Map.entry("upgrade-insecure-requests", "1"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536")
  );
  
  private Map<CharSequence, String> headers_18 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536"),
    Map.entry("x-requested-with", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_24 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_26 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_29 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_31 = Map.ofEntries(
    Map.entry("accept", "application/json, text/plain, */*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_32 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536")
  );
  
  private Map<CharSequence, String> headers_34 = Map.ofEntries(
    Map.entry("accept", "application/json, text/plain, */*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("if-modified-since", "Wed, 15 Mar 2023 12:56:47 GMT"),
    Map.entry("if-none-match", "W/\"f0493fff086dfeb0113b3589989d27d3\""),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_35 = Map.ofEntries(
    Map.entry("accept", "application/json, text/plain, */*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("if-modified-since", "Wed, 15 Mar 2023 12:57:02 GMT"),
    Map.entry("if-none-match", "W/\"50d5028b0666b72467d03f19be4fd287\""),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_37 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "application/json; charset=utf-8"),
    Map.entry("Origin", "https://www.amazon.in"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_43 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "text/plain;charset=UTF-8"),
    Map.entry("Origin", "https://www.amazon.in"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_44 = Map.of("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36");
  
  private Map<CharSequence, String> headers_46 = Map.ofEntries(
    Map.entry("Accept", "application/x-mpegURL, application/vnd.apple.mpegurl, application/json, text/plain"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_47 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536")
  );
  
  private Map<CharSequence, String> headers_50 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_59 = Map.ofEntries(
    Map.entry("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_60 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "iframe"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_62 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_63 = Map.ofEntries(
    Map.entry("accept", "application/json, text/javascript, */*; q=0.01"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_76 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_86 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("cache-control", "max-age=0"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_91 = Map.ofEntries(
    Map.entry("accept", "text/css,*/*;q=0.1"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "style"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_95 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://www.amazon.in"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "script"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_101 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_103 = Map.ofEntries(
    Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("sec-fetch-user", "?1"),
    Map.entry("upgrade-insecure-requests", "1"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536")
  );
  
  private Map<CharSequence, String> headers_115 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_121 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("x-client-data", "CIq2yQEIprbJAQjBtskBCKmdygEI+JXLAQiTocsBCOOXzQE=")
  );
  
  private Map<CharSequence, String> headers_124 = Map.ofEntries(
    Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "iframe"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("upgrade-insecure-requests", "1"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_130 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Access-Control-Request-Headers", "content-type"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://d1lxz4vuik53pc.cloudfront.net"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_131 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://d1lxz4vuik53pc.cloudfront.net"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_133 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("cache-control", "max-age=0"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536")
  );
  
  private Map<CharSequence, String> headers_135 = Map.ofEntries(
    Map.entry("accept", "text/html,*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("device-memory", "8"),
    Map.entry("downlink", "10"),
    Map.entry("dpr", "1.25"),
    Map.entry("ect", "4g"),
    Map.entry("rtt", "50"),
    Map.entry("sec-ch-device-memory", "8"),
    Map.entry("sec-ch-dpr", "1.25"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "15.0.0"),
    Map.entry("sec-ch-viewport-width", "1536"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("viewport-width", "1536"),
    Map.entry("x-requested-with", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_137 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "text/plain;charset=UTF-8"),
    Map.entry("Origin", "https://www.amazon.in"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_138 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "identity;q=1, *;q=0"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("range", "bytes=0-"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "video"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private String uri01 = "https://4b64d6fa612f.us-east-1.playback.live-video.net/api/video/v1/us-east-1.408268288382.channel.dw9fM61kv78W.m3u8";
  
  private String uri02 = "https://unagi-eu.amazon.com/1/events";
  
  private String uri03 = "https://player.live-video.net/1.0.0-rc.141/amazon-ivs-wasmworker.min.wasm";
  
  private String uri04 = "https://loadus.exelator.com/load";
  
  private String uri05 = "https://aax-eu.amazon-adsystem.com/s";
  
  private String uri06 = "https://unagi.amazon.in/1/events/com.amazon.csm.csa.prod";
  
  private String uri07 = "https://video-weaver.bom01.hls.live-video.net/v1/playlist/Cp0FToFGbVxPFivA277AFW8GuOsfo1TLx0siLdrS4F-S7HCTySMCCp1iDt4UlVeqZ8Qzqznof1QmSdgK8c-YmE2Gh8D2Bu5A2XisVDpbeFKb8sYk7rILU6bcssi88ANGP9GDnKBpnnO4AjDDyfSCY5TeuSxjb2GmBRDSLiwmAhXLrkbo1JqRsoQGfwjUMHdFL0IBeEBkTYB7JUAMTeF_RCE91eM8joqYZWSJFpI5SxrsdhH80bJRAzR499K-TQB1JU-2kUz_bg0eEVsTS_vuu1_ipEsuE1xdS1ww5xHSno3EE4ZgnRY8EWPlSKaG6g973EiwFoCD3QNaX-n4Pt8Ble2kUWMoN5v48R4rYXxNNEdodZ6PKInHZcgI_Lmzy1P4ejHLgPz0jj3xx4bhFskVAzCuKrBnAFChZgbzdN3zeJLpijmY_URwOEyQNW49nXX3YHMQBQ78i6kAzmS6XjAEYGCFj60TgIvjFAl54ekrnD1PXmSbgVxnFarsTiSLDzptyj_SODfefSnoaR3dWNUGM610ZliIeLctSQmu5Kkd5o7-19h_Y1HBA9F--lXjaziIvdQZ6PbA71NOrY9V_uV-2NbTk8QpQQUVv1qxlJ7FMylAwbblCRxqIk8_J80y219irUCLe35ibfBRQ4H6Pfh2RRMhwLi_rnscpgsLhphabG8dNgVsnAtyVcY-JRf3RWKP75hIAZeAIeLK9xeNE9-ZQ1c6ZP05khLdpuaOXsJCP_Ca-9ffoxJDmwGjPWDRknvdov3DQ81UNvHa_-nSNhs4mR73WcxFmaewnhqkRMhc93nvTlGIiONfCR1-H_iirazvvgdXeqTgvBcBA_KsZFDhhJQ0zi6efgaAtP8c9syiC-R5mAS5HelqI_-4KTxhnNj1Ggz3yH54YsUWVZYCuOUgASoJdXMtd2VzdC0yMIsG.m3u8";
  
  private String uri08 = "https://d1lxz4vuik53pc.cloudfront.net/ii/1664280591753/inner.html";
  
  private String uri09 = "https://d2ef20sk9hi1u3.cloudfront.net";
  
  private String uri10 = "https://rtb-csync.smartadserver.com/redir";
  
  private String uri11 = "https://odr.mookie1.com/t/v2";
  
  private String uri12 = "https://images-eu.ssl-images-amazon.com/images";
  
  private String uri13 = "https://d5glw3nnbe3pc.cloudfront.net/transcode/storyTeller/A2MRJASP2ENBCI/1637586921345/2624383f-7f18-4a76-b84b-66889794ae6f/1637586579067sbv.mp4";
  
  private String uri14 = "https://aan.amazon.in/cem";
  
  private String uri15 = "https://d3sbedvipl8ovw.cloudfront.net/v2/poller";
  
  private String uri16 = "https://d2330pufzy0cvr.cloudfront.net";
  
  private String uri17 = "https://www.amazon.in";
  
  private String uri18 = "https://m.media-amazon.com/images/I";
  
  private String uri20 = "https://dr3fr5q4g2ul9.cloudfront.net";
  
  private String uri21 = "https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js";
  
  private String uri22 = "https://aax-eu.amazon.in";
  
  private String uri23 = "https://completion.amazon.in/api/2017/suggestions";
  
  private String uri24 = "https://player.stats.live-video.net";

  private ScenarioBuilder scn = scenario("Amazon")
    .exec(
      http("request_0")
        .get(uri17 + "/nav/ajax/hMenuDesktopFirstLayer?ajaxTemplate=hMenuDesktopFirstLayer&pageType=Gateway&hmDataAjaxHint=1&isFreshRegion=false&isFreshCustomer=false&isPrimeMember=false&isPrimeDay=false&isSmile=false&regionalStores%5B%5D=ctnow&regionalStores%5B%5D=ctnow&isBackup=false&firstName=false&navDeviceType=desktop&hashCustomerAndSessionId=e4a55f573616ecbaa2f680d07641484fe57408cc&environmentVFI=AmazonNavigationCards%2Fdevelopment%40B6118467590-AL2_x86_64&languageCode=en_IN&customerCountryCode=IN")
        .headers(headers_0)
        .resources(
          http("request_1")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0001_request.bin")),
          http("request_2")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0002_request.bin")),
          http("request_3")
            .post(uri06)
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/amazon/0003_request.json")),
          http("request_4")
            .get(uri18 + "/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21aPhFy+riL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&MIPTuSwt")
            .headers(headers_4),
          http("request_5")
            .get(uri12 + "/I/41H4XraWzVL._RC%7C718N4mZsLZL.css,41qQV6vRlzL.css,11OsNOdrK6L.css,31JFqU7wKnL.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41yQj5y2obL.css,01yCq3WXEcL.css,110Nj+wUGYL.css,31OvHRW+XiL.css,01R53xsjpjL.css,11iUHDm4--L.css,41yKpEQVJkL.css,01YWmXMYw8L.css_.css?AUIClients/NavDesktopUberAsset&CPEI/vSp")
            .headers(headers_4),
          http("request_6")
            .get(uri12 + "/I/4171sdbgqbL.css?AUIClients/AmazonGatewayAuiAssets&BtBz/LBn")
            .headers(headers_4),
          http("request_7")
            .get(uri17 + "/")
            .headers(headers_7),
          http("request_8")
            .get(uri12 + "/I/01rGP6HIADL.js?AUIClients/GenericObservableJS"),
          http("request_9")
            .get(uri12 + "/I/11y85pohsPL._RC%7C41jWkdimWrL.js_.js?AUIClients/AmazonGatewayAuiAssets"),
          http("request_10")
            .get(uri18 + "/61ZS63EQSsL.js?AUIClients/AmazonUIjQuery"),
          http("request_11")
            .get(uri12 + "/I/31YI0nnbQAL.js?AUIClients/AmazonGatewayHerotatorJS"),
          http("request_12")
            .get(uri12 + "/S/apesafeframe/ape/sf/desktop/DAsf-1.50.139b902.js?csm_attribution=APE-SafeFrame"),
          http("request_13")
            .get(uri12 + "/I/01suh3pFoYL.js?xcp"),
          http("request_14")
            .get(uri18 + "/51QTt0kZ0-L.js?AUIClients/CardJsRuntimeBuzzCopyBuild"),
          http("request_15")
            .get(uri18 + "/11Y+5x+kkTL._RC%7C51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01pTleTFZOL.js_.js?AUIClients/AmazonUI&MFdCk5El"),
          http("request_16")
            .get(uri12 + "/I/215ieazFO0L.js?xcp"),
          http("request_17")
            .get(uri12 + "/I/41AN3YMKFYL._RC%7C714DuZosJiL.js,01F+A05ogQL.js,01phmzCOwJL.js,01eOvPdxG7L.js,71T+UV0Q3mL.js,41gNKoK0s7L.js,115pV8Rl02L.js,01+pnQJuQ0L.js,21+aV0AEB8L.js,11k47yUMOjL.js,41rU9l+NGKL.js,51t-JTxfnwL.js,317BC63dC8L.js,11lEMI5MhIL.js,31c7Fn9h9gL.js,01LEzWzrPZL.js,01AqeWA7PKL.js_.js?AUIClients/NavDesktopUberAsset&pYZxqR4I"),
          http("request_18")
            .post(uri17 + "/ah/ajax/counter?ctr=desktop_ajax_atf&exp=1678885140235&rId=VN1DTKYZS6Z27WKXEJ59&mkId=A21TJRUUN4KGV&h=0eec8d356a8d34ac973d770383e5ee6460c5b15cf24581ac248ba253336c3de9")
            .headers(headers_18),
          http("request_19")
            .get(uri12 + "/I/01qqGFb4mKL.js?xcp"),
          http("request_20")
            .get(uri12 + "/S/apesafeframe/ape/sf/desktop/sf-1.50.139b902.html"),
          http("request_21")
            .get(uri12 + "/S/apesafeframe/ape/sf/desktop/sf-1.50.139b902.html"),
          http("request_22")
            .get(uri12 + "/I/010rvoEcCnL.css?AUIClients/ShareWidgetTriggerAssets")
            .headers(headers_4),
          http("request_23")
            .get(uri12 + "/I/013waUm2DWL.css?AUIClients/HuddlesChatboxJS")
            .headers(headers_4),
          http("request_24")
            .get(uri22 + "/e/xsp/getAdj?placementId=589e332a-17d0-4382-b320-05e6f4ddc521&src=511&slot=right-2&rid=010107aa800ea57eb889897e15767b0eec9d835f4499cd53b907f4e34cf9e031ac19&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_24),
          http("request_25")
            .get(uri22 + "/e/xsp/getAdj?placementId=e44985f6-46f4-4231-90aa-f5c16f7c50aa&src=511&slot=desktop-ad-center-1&rid=010107aa800ea57eb889897e15767b0eec9d835f4499cd53b907f4e34cf9e031ac19&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_24),
          http("request_26")
            .head(uri23)
            .headers(headers_26),
          http("request_27")
            .get(uri16 + "/carousel-products/c5e3806f-5144-45ff-bc63-e8418c1dfe6c-6024E0A881BF97C3934F2F2C8B358370.json"),
          http("request_28")
            .get(uri12 + "/I/21pj1OVABnL.js?AUIClients/ShareWidgetTriggerAssets"),
          http("setghsrgfh")
            .get(uri22 + "/x/px/RM5MXNasXEwujk9IzomW4TMAAAGG5VhiUAMAAAH_AQBvbm9fdHhuX2JpZDEgICBOL0EgICAgICAgICAgICBVGmpu/nii/%7B%22ni%22:true%7D")
            .headers(headers_29),
          http("rhjsrfd")
            .get(uri22 + "/x/px/RIW07QxzBfOqtYxe1wDEQ7YAAAGG5VhiUAMAAAH_AQBvbm9fdHhuX2JpZDEgICBOL0EgICAgICAgICAgICAtziId/nii/%7B%22ni%22:true%7D")
            .headers(headers_29),
          http("sdfh")
            .get(uri15 + "?portalOptions=%7B%0A++++%22enableFlagshipGWDesktop%22%3A+true%2C%0A++++%22widgetDimensions%22%3A+%7B%22height%22%3A%22400px%22%7D%2C%0A++++%22assetInjectionWaitEvents%22%3A+%5B%22gwLayoutReady%22%5D%2C%0A%7D")
            .headers(headers_31),
          http("srgh")
            .get(uri17 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluLz8%3D%22%2C%22adElementId%22%3A%22ape_Gateway_right-2_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22right-2%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adProgramId%22%3A%220%22%2C%22adCreativeId%22%3A%220%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_32),
          http("etrfhg")
            .get(uri17 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluLz8%3D%22%2C%22adElementId%22%3A%22ape_Gateway_desktop-ad-center-1_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22desktop-ad-center-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adProgramId%22%3A%220%22%2C%22adCreativeId%22%3A%220%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_32),
          http("eth")
            .get(uri16 + "/broadcast/c5e3806f-5144-45ff-bc63-e8418c1dfe6c.json")
            .headers(headers_34),
          http("requsdfghest_35")
            .get(uri16 + "/broadcast/c5e3806f-5144-45ff-bc63-e8418c1dfe6c.json")
            .headers(headers_35),
          http("sdfg")
            .get(uri12 + "/I/11FeRkgIdIL.css?xcp")
            .headers(headers_4),
          http("request_37")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0037_request.json")),
          http("request_38")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0038_request.json")),
          http("request_39")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0039_request.json")),
          http("request_40")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0040_request.json")),
          http("request_41")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0041_request.json")),
          http("request_42")
            .post(uri02 + "/com.amazon.eel.amazonlive.metrics.nexus")
            .headers(headers_37)
            .body(RawFileBody("computerdatabase/amazon/0042_request.json")),
          http("request_43")
            .post(uri02 + "/com.amazon.csm.nexusclient.prod")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0043_request.json")),
          http("request_44")
            .get(uri03)
            .headers(headers_44),
          http("request_45")
            .post(uri17 + "/gp/product/sessionCacheUpdateHandler.html")
            .headers(headers_18)
            .formParam("sessionCacheUpdateFlag", "1")
            .formParam("pageType", "Gateway")
            .formParam("browserWidth", "1519")
            .formParam("browserHeight", "414")
            .formParam("token", "fVoboEDsYMjWCjzTN8sCObLZif2/oaBmQ3S2N5KuRr8=")
            .check(status().is(404)),
          http("request_46")
            .get(uri01 + "?player_version=1.0.0")
            .headers(headers_46),
          http("request_47")
            .get(uri17 + "/rd/uedata?ld&v=0.243452.0&id=VN1DTKYZS6Z27WKXEJ59&sw=1536&sh=864&vw=1519&vh=414&m=1&sc=VN1DTKYZS6Z27WKXEJ59&ue=3&bb=23&ns=176&ne=222&cf=266&af=352&fn=352&be=2789&fp=237&fcp=237&pc=4988&tc=-627&na_=-627&ul_=-163&_ul=-163&rd_=-1678885019878&_rd=-1678885019878&fe_=-621&lk_=-621&_lk=-621&co_=-621&_co=-621&sc_=-1678885019878&rq_=-613&rs_=-439&_rs=-30&dl_=-135&di_=3036&de_=3037&_de=3061&_dc=4988&ld_=4988&_ld=-1678885019878&ntd=0&ty=1&rc=0&hob=2&hoe=4&ld=4990&t=1678885024868&ctb=1&rt=cf:49-3-3-36-2-23-1_af:51-5-3-36-2-25-0_ld:285-14-7-206-7-241-0&ec=1&ecf=0&csmtags=aui|aui:aui_build_date:3.23.1-2023-03-12|mutObsYes|navbar|gwCFImgCache|mutObsActive|ABPStatusNotEnabled:Gateway:right-2:desktop|ABPStatusNotEnabled:Gateway:desktop-ad-center-1:desktop|fourColumn|fourColumnRevised|flexLayout|cssGridLayout|adrender:Gateway:right-2:desktop|adrender:589e332a-17d0-4382-b320-05e6f4ddc521|adrender:safeframe:Gateway:right-2:desktop|adrender:safeframe:589e332a-17d0-4382-b320-05e6f4ddc521|adrender:Gateway:right-2:desktop:creativetemplatename:unknown|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:creativetemplatename:unknown|adrender:Gateway:right-2:desktop:creativeid:0|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:creativeid:0|adrender:Gateway:right-2:desktop:programid:0|adrender:589e332a-17d0-4382-b320-05e6f4ddc521:programid:0|adrender:Gateway:desktop-ad-center-1:desktop|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa|adrender:safeframe:Gateway:desktop-ad-center-1:desktop|adrender:safeframe:e44985f6-46f4-4231-90aa-f5c16f7c50aa|adrender:Gateway:desktop-ad-center-1:desktop:creativetemplatename:unknown|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa:creativetemplatename:unknown|adrender:Gateway:desktop-ad-center-1:desktop:creativeid:0|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa:creativeid:0|adrender:Gateway:desktop-ad-center-1:desktop:programid:0|adrender:e44985f6-46f4-4231-90aa-f5c16f7c50aa:programid:0|aui:sw:ppft:page_proxy:active|aui:sw:ppft:np:enabled:true|fls-eu-amazon-in|adblk_no|perfYes|fy_cdn_fr|fy_cdn_mp|csm-feature-touch-enabled:false&viz=visible:3&pty=Gateway&spty=desktop&pti=desktop&tid=JZXDKYMH6K3Q0K195P4D&aftb=1&ui=2")
            .headers(headers_47),
          http("request_48")
            .get(uri07)
            .headers(headers_46),
          http("request_49")
            .post(uri06)
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/amazon/0049_request.json")),
          http("request_50")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3Ddesktop-5-active%26cf0%3D5173%26pc0%3D5173%26ld0%3D5173%26t0%3D1678885025051%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5173")
            .headers(headers_50),
          http("request_51")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3Ddesktop-4-active%26cf0%3D5139%26pc0%3D5139%26ld0%3D5139%26t0%3D1678885025017%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5139")
            .headers(headers_50),
          http("request_52")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3DjQueryWindowLoad%26cf0%3D5019%26pc0%3D5019%26ld0%3D5019%26t0%3D1678885024897%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5019")
            .headers(headers_50),
          http("request_53")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26sw%3D1536%26sh%3D864%26vw%3D1519%26vh%3D414%26m%3D1%26sc%3DVN1DTKYZS6Z27WKXEJ59%26ue%3D3%26bb%3D23%26ns%3D176%26ne%3D222%26cf%3D266%26af%3D352%26fn%3D352%26be%3D2789%26fp%3D237%26fcp%3D237%26pc%3D4988%26tc%3D-627%26na_%3D-627%26ul_%3D-163%26_ul%3D-163%26rd_%3D-1678885019878%26_rd%3D-1678885019878%26fe_%3D-621%26lk_%3D-621%26_lk%3D-621%26co_%3D-621%26_co%3D-621%26sc_%3D-1678885019878%26rq_%3D-613%26rs_%3D-439%26_rs%3D-30%26dl_%3D-135%26di_%3D3036%26de_%3D3037%26_de%3D3061%26_dc%3D4988%26ld_%3D4988%26_ld%3D-1678885019878%26ntd%3D0%26ty%3D1%26rc%3D0%26hob%3D2%26hoe%3D4%26ld%3D4990%26t%3D1678885024868%26ctb%3D1%26rt%3Dcf%3A49-3-3-36-2-23-1_af%3A51-5-3-36-2-25-0_ld%3A285-14-7-206-7-241-0%26ec%3D1%26ecf%3D0%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.23.1-2023-03-12%7CmutObsYes%7Cnavbar%7CgwCFImgCache%7CmutObsActive%7CABPStatusNotEnabled%3AGateway%3Aright-2%3Adesktop%7CABPStatusNotEnabled%3AGateway%3Adesktop-ad-center-1%3Adesktop%7CfourColumn%7CfourColumnRevised%7CflexLayout%7CcssGridLayout%7Cadrender%3AGateway%3Aright-2%3Adesktop%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%7Cadrender%3Asafeframe%3AGateway%3Aright-2%3Adesktop%7Cadrender%3Asafeframe%3A589e332a-17d0-4382-b320-05e6f4ddc521%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Acreativetemplatename%3Aunknown%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Acreativetemplatename%3Aunknown%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Acreativeid%3A0%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Acreativeid%3A0%7Cadrender%3AGateway%3Aright-2%3Adesktop%3Aprogramid%3A0%7Cadrender%3A589e332a-17d0-4382-b320-05e6f4ddc521%3Aprogramid%3A0%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%7Cadrender%3Asafeframe%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Cadrender%3Asafeframe%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%3Acreativetemplatename%3Aunknown%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%3Acreativetemplatename%3Aunknown%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%3Acreativeid%3A0%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%3Acreativeid%3A0%7Cadrender%3AGateway%3Adesktop-ad-center-1%3Adesktop%3Aprogramid%3A0%7Cadrender%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%3Aprogramid%3A0%7Caui%3Asw%3Appft%3Apage_proxy%3Aactive%7Caui%3Asw%3Appft%3Anp%3Aenabled%3Atrue%7Cfls-eu-amazon-in%7Cadblk_no%7CperfYes%7Cfy_cdn_fr%7Cfy_cdn_mp%7Ccsm-feature-touch-enabled%3Afalse%26viz%3Dvisible%3A3%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1%26ui%3D2:5001")
            .headers(headers_50),
          http("request_54")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26sc0%3Dportal-bb%26pc0%3D91%26ld0%3D91%26t0%3D1678885019993%26sc1%3Daui%3Asw%3Appft%3Acallback_ricb%26bb1%3D112%26pc1%3D1920%26ld1%3D1920%26t1%3D1678885021798%26sc2%3Dgw-ftGr-desktop-hero-1-visible%26cf2%3D229%26pc2%3D229%26ld2%3D229%26t2%3D1678885020107%26sc3%3DheroAf%26cf3%3D230%26pc3%3D230%26ld3%3D230%26t3%3D1678885020108%26sc4%3Dh1Af%26cf4%3D231%26pc4%3D231%26ld4%3D231%26t4%3D1678885020109%26sc5%3Ddesktop-grid-1-visible%26cf5%3D234%26pc5%3D234%26ld5%3D234%26t5%3D1678885020112%26sc6%3Ddesktop-grid-2-visible%26cf6%3D234%26pc6%3D234%26ld6%3D234%26t6%3D1678885020112%26sc7%3Ddesktop-grid-3-visible%26cf7%3D275%26pc7%3D275%26ld7%3D275%26t7%3D1678885020153%26sc8%3Ddesktop-grid-1-D1-visible%26cf8%3D276%26pc8%3D276%26ld8%3D276%26t8%3D1678885020154%26sc9%3Dgateway-asset-load%26cf9%3D333%26pc9%3D333%26ld9%3D333%26t9%3D1678885020211%26sc10%3DjQueryReady%26cf10%3D334%26pc10%3D334%26ld10%3D334%26t10%3D1678885020212%26sc11%3Ddesktop-grid-4-visible%26cf11%3D347%26pc11%3D347%26ld11%3D347%26t11%3D1678885020225%26sc12%3Ddesktop-grid-5-visible%26cf12%3D349%26pc12%3D349%26ld12%3D349%26t12%3D1678885020227%26sc13%3Ddesktop-grid-6-visible%26cf13%3D350%26pc13%3D350%26ld13%3D351%26t13%3D1678885020229%26sc14%3Ddesktop-grid-7-visible%26cf14%3D352%26pc14%3D352%26ld14%3D352%26t14%3D1678885020230%26sc15%3DspLoadJs%26cf15%3D368%26pc15%3D368%26ld15%3D368%26t15%3D1678885020246%26sc16%3DgwGridInit%26cf16%3D368%26pc16%3D369%26ld16%3D369%26t16%3D1678885020247%26sc17%3Ddesktop-top-visible%26cf17%3D394%26pc17%3D394%26ld17%3D394%26t17%3D1678885020272%26sc18%3DnavCF%26cf18%3D405%26pc18%3D405%26ld18%3D405%26t18%3D1678885020283%26sc19%3Ddesktop-1-visible%26cf19%3D417%26pc19%3D417%26ld19%3D417%26t19%3D1678885020295%26sc20%3Ddesktop-2-visible%26cf20%3D560%26pc20%3D560%26ld20%3D561%26t20%3D1678885020439%26sc21%3Ddesktop-btf-grid-1-visible%26cf21%3D562%26pc21%3D562%26ld21%3D562%26t21%3D1678885020440%26sc22%3Ddesktop-btf-grid-2-visible%26cf22%3D565%26pc22%3D565%26ld22%3D565%26t22%3D1678885020443%26sc23%3Dhero-first-image%26cf23%3D593%26pc23%3D593%26ld23%3D593%26t23%3D1678885020471%26sc24%3Ddesktop-btf-grid-3-visible%26cf24%3D597%26pc24%3D597%26ld24%3D597%26t24%3D1678885020475%26sc25%3Ddesktop-btf-grid-4-visible%26cf25%3D605%26pc25%3D605%26ld25%3D605%26t25%3D1678885020483%26sc26%3Dadplacements%3AsfImpression%3AGateway%3Aright-2%3Adesktop%26bb26%3D676%26pc26%3D2406%26ld26%3D2136%26t26%3D1678885022014%26sc27%3Dadplacements%3AsfImpression%3A589e332a-17d0-4382-b320-05e6f4ddc521%26bb27%3D676%26pc27%3D2406%26ld27%3D2136%26t27%3D1678885022014%26sc28%3Ddesktop-3-visible%26cf28%3D714%26pc28%3D714%26ld28%3D714%26t28%3D1678885020592%26sc29%3Ddesktop-4-visible%26cf29%3D720%26pc29%3D720%26ld29%3D720%26t29%3D1678885020598%26sc30%3Dadplacements%3AsfImpression%3AGateway%3Adesktop-ad-center-1%3Adesktop%26bb30%3D771%26pc30%3D2423%26ld30%3D2143%26t30%3D1678885022021%26sc31%3Dadplacements%3AsfImpression%3Ae44985f6-46f4-4231-90aa-f5c16f7c50aa%26bb31%3D771%26pc31%3D2423%26ld31%3D2143%26t31%3D1678885022021%26sc32%3Ddesktop-btf-grid-5-visible%26cf32%3D773%26pc32%3D773%26ld32%3D773%26t32%3D1678885020651%26sc33%3Ddesktop-grid-1-D1-active%26cf33%3D827%26pc33%3D827%26ld33%3D827%26t33%3D1678885020705%26sc34%3DgwAUIReady%26cf34%3D841%26pc34%3D841%26ld34%3D841%26t34%3D1678885020719%26sc35%3Ddesktop-btf-grid-6-visible%26cf35%3D924%26pc35%3D924%26ld35%3D924%26t35%3D1678885020802%26sc36%3Ddesktop-btf-grid-8-visible%26cf36%3D934%26pc36%3D934%26ld36%3D934%26t36%3D1678885020812%26sc37%3Ddesktop-top-active%26cf37%3D955%26pc37%3D955%26ld37%3D955%26t37%3D1678885020833%26sc38%3Ddesktop-btf-grid-3-active%26cf38%3D1079%26pc38%3D1079%26ld38%3D1079%26t38%3D1678885020957%26sc39%3Ddesktop-btf-grid-8-active%26cf39%3D1080%26pc39%3D1080%26ld39%3D1080%26t39%3D1678885020958%26sc40%3DAmazonLiveReact%26bb40%3D1184%26be40%3D2018%26pc40%3D2096%26ld40%3D2096%26t40%3D1678885021974%26sc41%3Ddesktop-btf-grid-7-visible%26cf41%3D1724%26pc41%3D1724%26ld41%3D1724%26t41%3D1678885021602%26sc42%3Daui%3Asw%3Apage_proxy%3Arequest_feature_tags%26bb42%3D1921%26cf42%3D2143%26af42%3D2411%26pc42%3D2411%26ld42%3D2411%26t42%3D1678885022289%26sc43%3Ddesktop-btf-grid-9-visible%26cf43%3D1992%26pc43%3D1992%26ld43%3D1992%26t43%3D1678885021870%26sc44%3Ddesktop-btf-grid-10-visible%26cf44%3D1994%26pc44%3D1994%26ld44%3D1994%26t44%3D1678885021872%26sc45%3Ddesktop-btf-grid-11-visible%26cf45%3D2146%26pc45%3D2146%26ld45%3D2146%26t45%3D1678885022024%26sc46%3Ddesktop-btf-grid-12-active%26cf46%3D2267%26pc46%3D2267%26ld46%3D2267%26t46%3D1678885022145%26sc47%3Ddesktop-5-visible%26cf47%3D2411%26pc47%3D2411%26ld47%3D2411%26t47%3D1678885022289%26sc48%3Ddesktop-7-visible%26cf48%3D2459%26pc48%3D2459%26ld48%3D2459%26t48%3D1678885022337%26sc49%3DgwBTFGridInit%26cf49%3D2684%26pc49%3D2684%26ld49%3D2684%26t49%3D1678885022562%26sc50%3DcsmCELLSframework%26bb50%3D2794%26pc50%3D2794%26ld50%3D2794%26t50%3D1678885022672%26sc51%3DcsmCELLSpdm%26bb51%3D2795%26pc51%3D2797%26ld51%3D2797%26t51%3D1678885022675%26sc52%3DcsmCELLSvpm%26bb52%3D2797%26pc52%3D2797%26ld52%3D2797%26t52%3D1678885022675%26sc53%3DcsmCELLSfem%26bb53%3D2797%26pc53%3D2797%26ld53%3D2797%26t53%3D1678885022675%26sc54%3Due_sushi_v1%26bb54%3D2798%26pc54%3D2801%26ld54%3D2801%26t54%3D1678885022679%26sc55%3DjQueryDomReady%26cf55%3D3038%26pc55%3D3038%26ld55%3D3038%26t55%3D1678885022916%26sc56%3Ddesktop-btf-grid-12-visible%26cf56%3D3074%26pc56%3D3074%26ld56%3D3074%26t56%3D1678885022952%26sc57%3DSocialShareJS%26bb57%3D3279%26be57%3D3765%26pc57%3D3765%26ld57%3D3765%26t57%3D1678885023643%26sc58%3DgwLayoutReady%26cf58%3D3279%26pc58%3D3279%26ld58%3D3279%26t58%3D1678885023157%26sc59%3Dgw-hero-btf-populate%26cf59%3D3460%26pc59%3D3460%26ld59%3D3460%26t59%3D1678885023338%26sc60%3Ddesktop-1-active%26cf60%3D4200%26pc60%3D4200%26ld60%3D4200%26t60%3D1678885024078%26sc61%3Ddesktop-2-active%26cf61%3D4233%26pc61%3D4233%26ld61%3D4233%26t61%3D1678885024111%26sc62%3Dgw-ftGr-desktop-hero-2-visible%26cf62%3D4336%26pc62%3D4336%26ld62%3D4336%26t62%3D1678885024214%26sc63%3Dgw-ftGr-desktop-hero-4-visible%26cf63%3D4337%26pc63%3D4337%26ld63%3D4337%26t63%3D1678885024215%26sc64%3Dgw-ftGr-desktop-hero-6-visible%26cf64%3D4337%26pc64%3D4337%26ld64%3D4337%26t64%3D1678885024215%26sc65%3Dgw-ftGr-desktop-hero-7-visible%26cf65%3D4337%26pc65%3D4337%26ld65%3D4337%26t65%3D1678885024215%26sc66%3Ddesktop-3-active%26cf66%3D4694%26pc66%3D4694%26ld66%3D4694%26t66%3D1678885024572%26sc67%3Dgw-ftGr-desktop-hero-3-visible%26cf67%3D4987%26pc67%3D4987%26ld67%3D4987%26t67%3D1678885024865%26sc68%3Dgw-ftGr-desktop-hero-5-visible%26cf68%3D4987%26pc68%3D4987%26ld68%3D4987%26t68%3D1678885024865%26ctb%3D1:5001")
            .headers(headers_50),
          http("request_55")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3Ddesktop-7-active%26cf0%3D5388%26pc0%3D5388%26ld0%3D5388%26t0%3D1678885025266%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5388")
            .headers(headers_50),
          http("request_56")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3DgwHerotatorActive%26cf0%3D5419%26pc0%3D5419%26ld0%3D5419%26t0%3D1678885025297%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5419")
            .headers(headers_50),
          http("request_57")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Alcp%26lcp%3D303%26pc%3D5761%26at%3D5761%26t%3D1678885025639%26csmtags%3DbrowserQuiteFn%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5831")
            .headers(headers_50),
          http("request_58")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3AbrowserQuiteFn%26pc%3D5754%26at%3D5754%26t%3D1678885025632%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5832")
            .headers(headers_50),
          http("request_59")
            .post(uri24 + "/")
            .headers(headers_59)
            .formParam("data", "eyJldmVudCI6ICJtYXN0ZXJfbWFuaWZlc3RfcmVhZHkiLCAicHJvcGVydGllcyI6IHsiYmFja2VuZCI6ICJtZWRpYXBsYXllciIsICJicm93c2VyIjogIjUuMCAoV2luZG93cyBOVCAxMC4wOyBXaW42NDsgeDY0KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTExLjAuMC4wIFNhZmFyaS81MzcuMzYiLCAiYnJvd3Nlcl9mYW1pbHkiOiAiY2hyb21lIiwgImJyb3dzZXJfdmVyc2lvbiI6ICIxMTEuMCIsICJjb250ZW50X2lkIjogImR3OWZNNjFrdjc4VyIsICJjb3JlX3ZlcnNpb24iOiAiMS4wLjAtcmMuMTQxIiwgImN1c3RvbWVyX2lkIjogIjQwODI2ODI4ODM4MiIsICJkb21haW4iOiAiYW1hem9uLmluIiwgImhpZGRlbiI6IGZhbHNlLCAiaG9zdCI6ICJ3d3cuYW1hem9uLmluIiwgImxpdmUiOiB0cnVlLCAibG93X2xhdGVuY3kiOiBmYWxzZSwgIm11dGVkIjogdHJ1ZSwgIm9zX25hbWUiOiAiV2luZG93cyIsICJvc192ZXJzaW9uIjogIjEwIiwgInBsYXRmb3JtIjogIndlYiIsICJwbGF5X3Nlc3Npb25faWQiOiAiODMyOTQxODk4MjQyNDkxNGI1YTgzMGM1MGZhM2ZlMTAiLCAicGxheWVyIjogIndlYiIsICJxdWFsaXR5IjogImF1dG8iLCAidGltZV90b19tYXN0ZXJfcGxheWxpc3RfcmVhZHkiOiAxMzcsICJ0aW1lX3RvX21hc3Rlcl9wbGF5bGlzdF9yZXF1ZXN0IjogMTAsICJ1cmwiOiAiaHR0cHM6Ly93d3cuYW1hem9uLmluLyIsICJ1c2VyX2FnZW50IjogIk1vemlsbGEvNS4wIChXaW5kb3dzIE5UIDEwLjA7IFdpbjY0OyB4NjQpIEFwcGxlV2ViS2l0LzUzNy4zNiAoS0hUTUwsIGxpa2UgR2Vja28pIENocm9tZS8xMTEuMC4wLjAgU2FmYXJpLzUzNy4zNiIsICJ2aWRlb19idWZmZXJfc2l6ZSI6IDAsICJ2b2x1bWUiOiAxfX0="),
          http("request_60")
            .get(uri05 + "/iu3?d=amazon.in&slot=navFooter&a2=01014b56b988dd8964df75af43f54c43c78c2b97a35316442ae6c5c22b93f7d758a9&old_oo=0&ts=1678885020260&s=AbJK9lKZiyESQ7fWpIaSFbmuVLd5yWTD91XJNMpJenVx&gdpr_consent=&gdpr_consent_avl=&cb=1678885020260")
            .headers(headers_60),
          http("request_61")
            .get(uri05 + "/v3/pr?exlist=mp_imdb_nsln_n-eq-HMT2&fv=1.0&a=cm&dmt=1&gdpr_consent=&ep=ChiAlU1xX0Py6CDEij08XvSSYacMvxHuVcaPdN59q7a97-Z7CvmKq3sqpgQSTUcSC0W--B171hiI24Z5hF_frYiBIkUMPXp09-GMwJor85pwq6i5kZYuyaicn5hSRnvh")
            .headers(headers_60),
          http("request_62")
            .get(uri11 + "?tagid=V2_393725&AMAZON_REGION_SPECIFIC_ENDPOINT=aax-eu.amazon-adsystem.com/s&src.visitorID=FAOox1JxTHa3CIQXlvQFLw")
            .headers(headers_62),
          http("request_63")
            .get(uri23 + "?limit=11&prefix=&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onfocus&wc=&lop=en_IN&last-prefix=%00&avg-ks-time=0&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_64")
            .get(uri10 + "/?partnerid=145&partneruserid=7OZNvivNRIudbmmwJWWWYg&redirurl=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3DequativHMT%26id%3D%26sspid%3DSMART_USER_ID&gdpr_consent=")
            .headers(headers_29),
          http("request_65")
            .get(uri04 + "/?p=204&g=8889&j=0")
            .headers(headers_62),
          http("request_66")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0066_request.bin")),
          http("request_67")
            .get(uri05 + "/ecm3?rcode=1&ex=imdb.com")
            .headers(headers_29),
          http("request_68")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3DTimeToFirstSuggestion%3Adesktop%26bb0%3D6708%26be0%3D7548%26pc0%3D7548%26ld0%3D7548%26t0%3D1678885027426%26csmtags%3Daui%3Asw%3Abrowser%3Aregister%3Asupported%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7548")
            .headers(headers_50),
          http("request_69")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D7655%26at%3D7655%26t%3D1678885027533%26csmtags%3DstartVL%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7655")
            .headers(headers_50),
          http("request_70")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Avl90%26vl90%3D259%26pc%3D7657%26at%3D7657%26t%3D1678885027535%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7657")
            .headers(headers_50),
          http("request_71")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Avl50%26vl50%3D-96%26pc%3D7656%26at%3D7656%26t%3D1678885027534%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7656")
            .headers(headers_50),
          http("request_72")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Avl100%26vl100%3D3060%26pc%3D7657%26at%3D7657%26t%3D1678885027535%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7657")
            .headers(headers_50),
          http("request_73")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D7658%26at%3D7658%26t%3D1678885027536%26csmtags%3DendVL%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7658")
            .headers(headers_50),
          http("request_74")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Asi%26si%3D171%26pc%3D7658%26at%3D7658%26t%3D1678885027536%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7658")
            .headers(headers_50),
          http("request_75")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26m%3D1%26sc%3Dcsa%3Aatfsi%26atfsi%3D171%26pc%3D7658%26at%3D7658%26t%3D1678885027536%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7658")
            .headers(headers_50),
          http("request_76")
            .get(uri20 + "/?9c8a91bd-15b4-8518-c9fc-91d6151d69c0")
            .headers(headers_76),
          http("request_77")
            .get(uri09 + "/?9c8a91bd-15b4-8518-c9fc-91d6151d69c0")
            .headers(headers_76),
          http("request_78")
            .get(uri23 + "?limit=11&prefix=s&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=%00&avg-ks-time=566&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_79")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0079_request.bin")),
          http("request_80")
            .get(uri23 + "?limit=11&prefix=sh&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=%00&avg-ks-time=436&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_81")
            .get(uri23 + "?limit=11&prefix=shi&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=sh&avg-ks-time=370&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_82")
            .get(uri23 + "?limit=11&prefix=shir&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=shi&avg-ks-time=349&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_83")
            .get(uri23 + "?limit=11&prefix=shirt&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=shir&avg-ks-time=330&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_84")
            .get(uri23 + "?limit=11&prefix=shirts&suggestion-type=WIDGET&suggestion-type=KEYWORD&page-type=Gateway&alias=aps&site-variant=desktop&version=3&event=onkeypress&wc=&lop=en_IN&last-prefix=shirt&avg-ks-time=325&fb=1&session-id=262-7890721-2689554&request-id=VN1DTKYZS6Z27WKXEJ59&mid=A21TJRUUN4KGV&plain-mid=44571&client-info=amazon-search-ui")
            .headers(headers_63),
          http("request_85")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DVN1DTKYZS6Z27WKXEJ59%26ctb%3D1%26sc0%3DSearchNonAcceptance%3Adesktop%26bb0%3D9188%26be0%3D9188%26pc0%3D9188%26ld0%3D9188%26t0%3D1678885029066%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:9188")
            .headers(headers_50),
          http("request_86")
            .get("/1/remote-weblab-triggers/1/OE/A21TJRUUN4KGV:262-7890721-2689554:VN1DTKYZS6Z27WKXEJ59$s:wl-client-id%3DCSMTriger%2Cwl%3DASV_AS_FS_STALE_MD_592121%2FT1:1234")
            .headers(headers_86),
          http("request_87")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0087_request.bin")),
          http("request_88")
            .post(uri02 + "/com.amazon.csm.nexusclient.prod")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0088_request.json")),
          http("request_89")
            .get(uri18 + "/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21aPhFy+riL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&MIPTuSwt")
            .headers(headers_4),
          http("request_90")
            .get(uri12 + "/I/41H4XraWzVL._RC%7C718N4mZsLZL.css,41qQV6vRlzL.css,11OsNOdrK6L.css,31JFqU7wKnL.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41yQj5y2obL.css,01yCq3WXEcL.css,110Nj+wUGYL.css,31OvHRW+XiL.css,01R53xsjpjL.css,11iUHDm4--L.css,41yKpEQVJkL.css,01YWmXMYw8L.css_.css?AUIClients/NavDesktopUberAsset&CPEI/vSp")
            .headers(headers_4),
          http("request_91")
            .get(uri12 + "/I/01mI9NDJJTL._RC%7C01Hw8JIiKbL.css,11AQMRD3rsL.css,71K2D4eQgyL.css,01aTTaL5f8L.css,010ntAIO6fL.css,01j7jSSP2yL.css,013Xm+zjr6L.css,41h2OmYEqwL.css,01mYUbZszyL.css,01+A2nZ3DKL.css,11IaasccbKL.css,01m4HdUj51L.css,11ABzUvcTsL.css,31nVNWpONgL.css,01dy0wz97BL.css,01Ph6sZAceL.css,01t92z-YvaL.css,01h5jb0krML.css_.css?AUIClients/SearchAssets&R2ZQbiq0")
            .headers(headers_91),
          http("request_92")
            .get(uri12 + "/I/31nlqjt2PrL.css?AUIClients/DetailPageAllOffersDisplayAssets&jVGJ2ERz")
            .headers(headers_91),
          http("request_93")
            .get(uri12 + "/I/01+6LDwsu8L._RC%7C01ixfc-7StL.css,21dv0pdmGZL.css,11oqoK-MptL.css,01+neHskhqL.css,01mfj61BPYL.css,01Luz-sfd0L.css,01CXpQgAC8L.css,01LfrrxE-KL.css,31wUat9O8SL.css,31oq6AE42vL.css,01n1t1A5XLL.css,01tcv8og6CL.css,01uVg0XT9XL.css,01OpjCq+SSL.css,41Y5FbwH52L.css,11eb8etJ5QL.css,0171-O+nBwL.css,01L7G1u+L5L.css,21K0oo63ZeL.css,01rdVnPkgmL.css,21Z9bojV5YL.css,01K0fSFz6eL.css,014eilLW+IL.css,01MU0Cb7yFL.css,017ZL57GkjL.css,01CHSSMW4hL.css_.css?AUIClients/SearchPartnerAssets&UNuukQ40")
            .headers(headers_91),
          http("request_94")
            .get(uri12 + "/I/01tJTKp89CL._RC%7C21GzhyHwjOL.css,01Q-bj+2dgL.css,01dy0wz97BL.css,21Xt6HV2QcL.css,01EsS3sB+PL.css,01fjhMA6eZL.css,01XR1PRX6GL.css,01SGj-l7qnL.css,11ZMJvzBqdL.css,01Ph6sZAceL.css,01M6XwEY1qL.css,711OnqDRaaL.css,01wiI2pQqRL.css,01MPYXlmzdL.css,11gm9Pqo3ZL.css,01JsvXDH4cL.css,01GgmOtso9L.css,01iweABC--L.css,0143nwm-WoL.css_.css?AUIClients/ProductUIAssets&Uk1kgw5I")
            .headers(headers_91),
          http("request_95")
            .get(uri12 + "/I/11mVszy8FIL.js?AUIClients/AmazonRushAssetLoader")
            .headers(headers_95),
          http("request_96")
            .get(uri12 + "/I/21jfY81shVL._RC%7C01mbLYIbb6L.js,41NPz88sBEL.js,41LSTLTuyyL.js,11jWtxew3JL.js,017HkCEd5gL.js,21DHhna6ycL.js,21EWUEKXTEL.js,01DTApdmRGL.js,11P9+f2WoeL.js,11s69IMeXSL.js,01peSwKV8mL.js,01Sdh4wVe3L.js,01MYMDYOc0L.js,01SSs1udVFL.js,017MBv9t0oL.js,01Se6rdZ16L.js,21fbsMlRZ+L.js,0102ySY2JzL.js,01-0s1MjxEL.js,015FiitmhFL.js,017cIAbvZsL.js,21QT3gUErJL.js,01MJ-h1wjNL.js_.js?AUIClients/ProductUIAssets&MPpaNqz9")
            .headers(headers_95),
          http("request_97")
            .get(uri12 + "/I/21cuxCuJB9L.js?AUIClients/AmazonRushRouter")
            .headers(headers_95),
          http("request_98")
            .get(uri12 + "/I/41kCtwlCFqL.js?AUIClients/AmazonRushFramework")
            .headers(headers_95),
          http("request_99")
            .get(uri12 + "/I/11A1Q93BHbL._RC%7C31YYsFFQrXL.js,31Iq4x9+ecL.js,01BPbuoKVCL.js,31GfnrIX3CL.js,01+nIi7vQ6L.js,315IZLuJm+L.js,31sAffTU-DL.js,01r1r3sVlxL.js,21Ys41aj48L.js,115Ysi-lEWL.js,01XQQDMWkKL.js,012z3lMdhOL.js,11dFVWwNCJL.js,01b82LFIRTL.js,11w8z9cET7L.js,015CwW0puPL.js,21jeZDicdtL.js,01MsgM7hzDL.js,21dMhWokf7L.js,21dI9VFkXVL.js,01FA0ZefFJL.js_.js?AUIClients/SearchAssets&e3KkAr+V")
            .headers(headers_95),
          http("request_100")
            .get(uri12 + "/I/01zKhl-DyGL._RC%7C21ojI99jc4L.js,41pa4zoYJAL.js,01N0G7oHRlL.js,31afBQnlthL.js,21Gn8WTjh2L.js,11viIoOEOPL.js,01PRkM1aDfL.js,21hiWgu4ezL.js,21wma4EBp3L.js,01TF4KwVp5L.js,21p-Cc6hWJL.js,31M5iaJEqeL.js,21SubJ7cGnL.js,119j-jV1U3L.js,01+foxqLRaL.js,21eU3SvX0yL.js,21fAUGxUxsL.js,51muTcl-zGL.js,3162FDfYmPL.js,01ly-sHeg8L.js,31jhe2Yp4qL.js,01acF69nbrL.js,31CF7mNdGYL.js,21i4Nr0pHgL.js,21zQdE9ch2L.js,21ptL48PNRL.js,11jC1BUSQzL.js,013Fzw-eTvL.js,21QnPVLIO1L.js,31i0Hd4f3IL.js,01993rJ5roL.js,011gqdvx+zL.js,01HV1B-ydIL.js,01RWIxvuYCL.js,012USBOk43L.js,01GsEhoWBNL.js,01iuGGm5FYL.js,51ioflNCb7L.js_.js?AUIClients/SearchPartnerAssets&NXicBBrC")
            .headers(headers_95),
          http("request_101")
            .get(uri22 + "/e/loi/imp?b=JHwJLcbvEcAiQFNTYkdbghkAAAGG5ViJcAMAAAH2AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICDS6aJa")
            .headers(headers_101),
          http("request_102")
            .get(uri12 + "/I/41kMM1nt+hL.js?xcp")
            .headers(headers_95),
          http("request_103")
            .get(uri17 + "/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=shirts&crid=8YLQCXRZ1IFJ&sprefix=shirts%2Caps%2C335")
            .headers(headers_103),
          http("request_104")
            .get(uri22 + "/e/loi/imp?b=JA1NkuY8LpHnE8lsC4xQupEAAAGG5ViJWgMAAAH2AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICAIbIP1")
            .headers(headers_101),
          http("request_105")
            .get(uri22 + "/e/loi/imp?b=JJGMbRuZ79Pad8DFNFW5L8EAAAGG5ViKhgMAAAH2AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICDa-1wx")
            .headers(headers_101),
          http("request_106")
            .get(uri12 + "/I/41SQxOS-78L.js?xcp")
            .headers(headers_95),
          http("request_107")
            .get(uri22 + "/e/loi/imp?b=JHYI7kZRxag93pJTYvif-uAAAAGG5ViKhgMAAAH2AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICAGwfg9")
            .headers(headers_101),
          http("request_108")
            .get(uri18 + "/61ZS63EQSsL.js?AUIClients/AmazonUIjQuery"),
          http("request_109")
            .get(uri18 + "/11Y+5x+kkTL._RC%7C51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01pTleTFZOL.js_.js?AUIClients/AmazonUI&MFdCk5El"),
          http("request_110")
            .get(uri18 + "/51QTt0kZ0-L.js?AUIClients/CardJsRuntimeBuzzCopyBuild"),
          http("request_111")
            .get(uri12 + "/I/41AN3YMKFYL._RC%7C714DuZosJiL.js,01F+A05ogQL.js,01phmzCOwJL.js,01eOvPdxG7L.js,71T+UV0Q3mL.js,41gNKoK0s7L.js,115pV8Rl02L.js,01+pnQJuQ0L.js,21+aV0AEB8L.js,11k47yUMOjL.js,41rU9l+NGKL.js,51t-JTxfnwL.js,317BC63dC8L.js,11lEMI5MhIL.js,31c7Fn9h9gL.js,01LEzWzrPZL.js,01AqeWA7PKL.js_.js?AUIClients/NavDesktopUberAsset&pYZxqR4I"),
          http("request_112")
            .get(uri12 + "/I/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21aPhFy+riL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&MIPTuSwt")
            .headers(headers_91),
          http("request_113")
            .get(uri12 + "/I/61yXDIPmT-L._RC%7C11Y+5x+kkTL.js,51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01kEfMJRZwL.js_.js?AUIClients/AmazonUI&MFdCk5El")
            .headers(headers_95),
          http("request_114")
            .get(uri12 + "/I/314KUnfp3+L.js?AUIClients/AllOffersDisplayIngressAssets&P3lk6dwL")
            .headers(headers_95),
          http("request_115")
            .get(uri22 + "/e/xsp/getAdj?src=511&slot=auto-bottom-advertising-0&rid=01017c6d6a288858fc7e97a45a91f21584bd2e56c747a81bdcd90ad4ddde065a52e8&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_115),
          http("request_116")
            .post(uri02 + "/com.amazon.csm.nexusclient.prod")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0116_request.json")),
          http("request_117")
            .get(uri22 + "/e/xsp/getAdj?placementId=8a02f48b-2df7-46b7-bbd7-00e0fef1b712&src=511&slot=auto-left-advertising-1&rid=01017c6d6a288858fc7e97a45a91f21584bd2e56c747a81bdcd90ad4ddde065a52e8&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_115),
          http("request_118")
            .head(uri23)
            .headers(headers_26),
          http("request_119")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Fs-on-search-route%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26ctb%3D1%26m%3D1%26sc0%3Ds-on-search-route%26pc0%3D5434%26s-on-search-route0%3D5434%26t0%3D1678885034949%26rt%3Dcf%3A116-8-6-97-4-27-0_af%3A26-6-6-9-3-19-1_%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.23.1-2023-03-12%7CmutObsYes%7CmutObsActive%7Cewc%3Aunpersist%7Cewc%3Aunpersist%3Aemptycart%7Cewc%3Abview%7Cewc%7Cewc%3Aunrec%7Cewc%3Acartsize%3A0%7Cewc%3Aaui%7Cnavbar%7Csupports%3Amutationobserver%3Atrue%7Csupports%3Agetelementsbyclassname%3Atrue%7Csupports%3Amap%3Atrue%7Caui%3Asw%3Appft%3Apage_proxy%3Aactive%7Caui%3Asw%3Appft%3Anp%3Aenabled%3Atrue%7Cfls-eu-amazon-in%7Cadblk_no%7CperfYes%7Cfy_cdn_fr%7Cfy_cdn_mp%7Ccsm-feature-touch-enabled%3Afalse%7CsafeFrame%3A412fa7a81328520564afd6b98d8b621d4045284d%3Aadplacements%3Asearch%3Aauto-bottom-advertising-0%3Aportal-batch-fast-btf-loom%3Aabpstatus%3Anotenabled%7CsafeFrame%3A6711014270a37cd3cd8d7e47d333ff58eefb5754%3Aadplacements%3Asearch%3Aauto-left-advertising-1%3Asearch-desktop-loom%3Aabpstatus%3Anotenabled%26viz%3Dvisible%3A3%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5438")
            .headers(headers_50),
          http("request_120")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Fs-on-search-route%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26ctb%3D1%26sc0%3Daui%3Asw%3Appft%3Acallback_ricb%26bb0%3D31%26pc0%3D2111%26ld0%3D2111%26t0%3Dundefined%26sc1%3Dportal-bb%26pc1%3D4%26ld1%3D4%26t1%3Dundefined%26sc2%3DamznSafeFrameHost%26bb2%3D431%26pc2%3D432%26ld2%3D432%26t2%3Dundefined%26sc3%3DsearchSafeFrame%3AMAIN%26bb3%3D1587%26be3%3D2112%26x13%3D2169%26cf3%3D2730%26pc3%3D3486%26ld3%3D3486%26t3%3Dundefined%26sc4%3Daui%3Asw%3Apage_proxy%3Arequest_feature_tags%26bb4%3D2111%26cf4%3D2453%26af4%3D2726%26pc4%3D2726%26ld4%3D2726%26t4%3Dundefined%26sc5%3DsearchSafeFrame%3ALEFT%26bb5%3D2617%26be5%3D2620%26x15%3D2764%26cf5%3D3548%26pc5%3D4544%26ld5%3D4544%26t5%3Dundefined%26sc6%3DsearchSafeFrame%3Amodal%3As-safe-modal-singleton%26bb6%3D2621%26be6%3D2766%26x16%3D2820%26cf6%3D4073%26pc6%3D5046%26ld6%3D5046%26t6%3Dundefined%26sc7%3DcsmCELLSframework%26bb7%3D3149%26pc7%3D3149%26ld7%3D3149%26t7%3Dundefined%26sc8%3DcsmCELLSpdm%26bb8%3D3149%26pc8%3D3156%26ld8%3D3156%26t8%3Dundefined%26sc9%3DcsmCELLSvpm%26bb9%3D3156%26pc9%3D3157%26ld9%3D3157%26t9%3Dundefined%26sc10%3DcsmCELLSfem%26bb10%3D3157%26pc10%3D3157%26ld10%3D3157%26t10%3Dundefined%26sc11%3Due_sushi_v1%26bb11%3D3158%26pc11%3D3159%26ld11%3D3159%26t11%3Dundefined%26sc12%3DSocialShareJS%26bb12%3D4670%26be12%3D4908%26pc12%3D4908%26ld12%3D4908%26t12%3Dundefined%26sc13%3DSocialShareFramework%26bb13%3D4890%26be13%3D4894%26pc13%3D4894%26ld13%3D4894%26t13%3Dundefined%26sc14%3DSocialShareFramework.%26bb14%3D4890%26be14%3D4894%26pc14%3D4894%26ld14%3D4894%26t14%3Dundefined%26sc15%3Ds-startup-component-scan%26bb15%3D5386%26cf15%3D5386%26pc15%3D5412%26ld15%3D5412%26t15%3Dundefined%26sc16%3Ds-swac%26bb16%3D5428%26cf16%3D5430%26pc16%3D5430%26ld16%3D5430%26t16%3Dundefined:5438")
            .headers(headers_50),
          http("request_121")
            .head(uri21 + "?_=1607460946161")
            .headers(headers_121),
          http("request_122")
            .get(uri17 + "/af/feedback-link?pl=%7B%22adPlacementMetaData%22%3A%7B%22adElementId%22%3A%22video-single-product%22%2C%22pageType%22%3A%22Search%22%2C%22slotName%22%3A%22main%22%2C%22pageUrl%22%3A%22%22%2C%22searchTerms%22%3A%22c2hpcnRz%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adNetwork%22%3A%22aax%22%2C%22adProgramId%22%3A1010%2C%22adImpressionId%22%3A%22%22%2C%22adId%22%3A%2234124259212%22%2C%22adCreativeDetails%22%3A%5B%7B%22campaignId%22%3A%2220030970041601%22%7D%5D%7D%7D")
            .headers(headers_32),
          http("request_123")
            .get(uri17 + "/rd/uedata?s-on-search-route&v=0.243452.0&id=YFF77WFB1G2WKZWQM1XZ&ctb=1&m=1&sc0=s-on-search-route&pc0=5434&s-on-search-route0=5434&t0=1678885034949&rt=cf:116-8-6-97-4-27-0_af:26-6-6-9-3-19-1_&csmtags=aui|aui:aui_build_date:3.23.1-2023-03-12|mutObsYes|mutObsActive|ewc:unpersist|ewc:unpersist:emptycart|ewc:bview|ewc|ewc:unrec|ewc:cartsize:0|ewc:aui|navbar|supports:mutationobserver:true|supports:getelementsbyclassname:true|supports:map:true|aui:sw:ppft:page_proxy:active|aui:sw:ppft:np:enabled:true|fls-eu-amazon-in|adblk_no|perfYes|fy_cdn_fr|fy_cdn_mp|csm-feature-touch-enabled:false|safeFrame:412fa7a81328520564afd6b98d8b621d4045284d:adplacements:search:auto-bottom-advertising-0:portal-batch-fast-btf-loom:abpstatus:notenabled|safeFrame:6711014270a37cd3cd8d7e47d333ff58eefb5754:adplacements:search:auto-left-advertising-1:search-desktop-loom:abpstatus:notenabled&viz=visible:3&pty=Search&spty=List&pti=undefined&tid=JZXDKYMH6K3Q0K195P4D&aftb=1")
            .headers(headers_47),
          http("request_124")
            .get(uri08)
            .headers(headers_124),
          http("request_125")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26ctb%3D1%26sc0%3Daod-ingress-assets-load-time%26bb0%3D6752%26pc0%3D6752%26ld0%3D6752%26t0%3D1678885036267%26csmtags%3DDisplayAdsSkyscraperSlotContentV2%7CDisplayAdsFooterSlotContentV2%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:6752")
            .headers(headers_50),
          http("request_126")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Ful%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26m%3D1%26sc%3DYFF77WFB1G2WKZWQM1XZ%26ue%3D3%26bb%3D77%26ns%3D318%26ne%3D404%26be%3D3145%26fp%3D525%26fcp%3D525%26cf%3D2061%26af%3D650%26fn%3D650%26pc%3D7351%26tc%3D-402%26na_%3D-402%26ul_%3D-206%26_ul%3D-206%26rd_%3D-1678885029515%26_rd%3D-1678885029515%26fe_%3D-395%26lk_%3D-395%26_lk%3D-395%26co_%3D-395%26_co%3D-395%26sc_%3D-1678885029515%26rq_%3D-389%26rs_%3D-223%26_rs%3D746%26dl_%3D-153%26di_%3D3288%26de_%3D3289%26_de%3D3309%26_dc%3D-1678885029515%26ld_%3D-1678885029515%26_ld%3D-1678885029515%26ntd%3D0%26ty%3D0%26rc%3D0%26hob%3D2%26hoe%3D4%26ul%3D7351%26t%3D1678885036866%26ctb%3D1%26csmtags%3DhasInlineWidgets%3Atrue%7Csearch_results%3Ahidden%3Afalse%7CbrowserQuiteFn%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1%26ui%3D2:7364")
            .headers(headers_86),
          http("request_127")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0127_request.bin")),
          http("request_128")
            .get(uri08),
          http("request_129")
            .post(uri02 + "/com.amazon.eel.sbv.client.prod.eu")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0129_request.json")),
          http("request_130")
            .options(uri14)
            .headers(headers_130),
          http("request_131")
            .post(uri14)
            .headers(headers_131)
            .body(RawFileBody("computerdatabase/amazon/0131_request.json")),
          http("request_132")
            .post(uri14)
            .headers(headers_131)
            .body(RawFileBody("computerdatabase/amazon/0132_request.json")),
          http("request_133")
            .get(uri17 + "/rd/uedata?ul&v=0.243452.0&id=YFF77WFB1G2WKZWQM1XZ&m=1&sc=YFF77WFB1G2WKZWQM1XZ&ue=3&bb=77&ns=318&ne=404&be=3145&fp=525&fcp=525&cf=2061&af=650&fn=650&pc=7351&tc=-402&na_=-402&ul_=-206&_ul=-206&rd_=-1678885029515&_rd=-1678885029515&fe_=-395&lk_=-395&_lk=-395&co_=-395&_co=-395&sc_=-1678885029515&rq_=-389&rs_=-223&_rs=746&dl_=-153&di_=3288&de_=3289&_de=3309&_dc=-1678885029515&ld_=-1678885029515&_ld=-1678885029515&ntd=0&ty=0&rc=0&hob=2&hoe=4&ul=7351&t=1678885036866&ctb=1&csmtags=hasInlineWidgets:true|search_results:hidden:false|browserQuiteFn&pty=Search&spty=List&pti=undefined&tid=JZXDKYMH6K3Q0K195P4D&aftb=1&ui=2")
            .headers(headers_133),
          http("request_134")
            .get(uri22 + "/e/xsp/imp?b=RBOHcBjSI2T12w3jhTndR0AAAAGG5ViKZwMAAAH_AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICDGp3LS&pj=%7B%22measurementMethod%22%3A%22btr_client%22%7D")
            .headers(headers_101),
          http("request_135")
            .get(uri17 + "/af/feedback-link?ie=UTF-8&pl=%7B%22adPlacementMetaData%22%3A%7B%22feedbackType%22%3A%22loomSearch%22%2C%22pageType%22%3A%22Search%22%2C%22slotName%22%3A%22auto-bottom-advertising-0%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adCreativeId%22%3A%22undefined%22%2C%22adCreativeTemplateName%22%3A%22dynamicecommercesdciindesktop%22%2C%22adId%22%3A%2220084334164498%22%2C%22adImpressionId%22%3A%22https%3A%2F%2Faax-eu.amazon.in%2Fe%2Fxsp%2Fimp%3Fb%3DRBOHcBjSI2T12w3jhTndR0AAAAGG5ViKZwMAAAH_AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICDGp3LS%22%2C%22adProgramId%22%3A%221027%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_135),
          http("request_136")
            .get(uri17 + "/af/feedback-link?ie=UTF-8&pl=%7B%22adPlacementMetaData%22%3A%7B%22feedbackType%22%3A%22loomSearch%22%2C%22pageType%22%3A%22Search%22%2C%22slotName%22%3A%22auto-left-advertising-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adCreativeId%22%3A%22undefined%22%2C%22adCreativeTemplateName%22%3A%22dynamicecommercesdciindesktop%22%2C%22adId%22%3A%2220084334167898%22%2C%22adImpressionId%22%3A%22https%3A%2F%2Faax-eu.amazon.in%2Fe%2Fxsp%2Fimp%3Fb%3DREAxb6F8z05hiKiqxAk_z48AAAGG5ViKZwMAAAH_AQBvbm9fdHhuX2JpZDMgICBOL0EgICAgICAgICAgICB192mA%22%2C%22adProgramId%22%3A%221027%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_135),
          http("request_137")
            .post(uri06)
            .headers(headers_137),
          http("request_138")
            .get(uri13)
            .headers(headers_138),
          http("request_139")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26ctb%3D1%26sc0%3Dmulti-card-creative-desktop_loom-desktop-top-slot_3%26bb0%3D450%26be0%3D543%26pc0%3D7951%26ld0%3D7951%26t0%3D1678885037466%26csmtags%3DstartVL%7CendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7951")
            .headers(headers_50),
          http("request_140")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YFF77WFB1G2WKZWQM1XZ$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYFF77WFB1G2WKZWQM1XZ%26ctb%3D1%26sc0%3Dmulti-brand-creative-desktop_loom-desktop-brand-footer-slot_92%26bb0%3D838%26be0%3D1582%26pc0%3D7953%26ld0%3D7953%26t0%3D1678885037468%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7953")
            .headers(headers_50),
          http("request_141")
            .get(uri17 + "/s?k=shirts&rh=n%3A1571271031%2Cp_89%3AAllen+Solly&dc&crid=8YLQCXRZ1IFJ&qid=1678885030&rnid=3837712031&sprefix=shirts%2Caps%2C335&ref=sr_nr_p_89_3&ds=v1%3AHi9K4EN7%2FdVlz8nF%2Fs8q59R%2FLXIeeYsx4YnVqT1Yqa0")
            .headers(headers_103),
          http("request_142")
            .get(uri18 + "/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21aPhFy+riL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&MIPTuSwt")
            .headers(headers_4),
          http("request_143")
            .get(uri12 + "/I/41H4XraWzVL._RC%7C718N4mZsLZL.css,41qQV6vRlzL.css,11OsNOdrK6L.css,31JFqU7wKnL.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41yQj5y2obL.css,01yCq3WXEcL.css,110Nj+wUGYL.css,31OvHRW+XiL.css,01R53xsjpjL.css,11iUHDm4--L.css,41yKpEQVJkL.css,01YWmXMYw8L.css_.css?AUIClients/NavDesktopUberAsset&CPEI/vSp")
            .headers(headers_4),
          http("request_144")
            .get(uri12 + "/I/01mI9NDJJTL._RC%7C01Hw8JIiKbL.css,11AQMRD3rsL.css,71K2D4eQgyL.css,01aTTaL5f8L.css,010ntAIO6fL.css,01j7jSSP2yL.css,013Xm+zjr6L.css,41h2OmYEqwL.css,01mYUbZszyL.css,01+A2nZ3DKL.css,11IaasccbKL.css,01m4HdUj51L.css,11ABzUvcTsL.css,31nVNWpONgL.css,01dy0wz97BL.css,01Ph6sZAceL.css,01t92z-YvaL.css,01h5jb0krML.css_.css?AUIClients/SearchAssets&R2ZQbiq0"),
          http("request_145")
            .get(uri12 + "/I/01+6LDwsu8L._RC%7C01ixfc-7StL.css,21dv0pdmGZL.css,11oqoK-MptL.css,01+neHskhqL.css,01mfj61BPYL.css,01Luz-sfd0L.css,01CXpQgAC8L.css,01LfrrxE-KL.css,31wUat9O8SL.css,31oq6AE42vL.css,01n1t1A5XLL.css,01tcv8og6CL.css,01uVg0XT9XL.css,01OpjCq+SSL.css,41Y5FbwH52L.css,11eb8etJ5QL.css,0171-O+nBwL.css,01L7G1u+L5L.css,21K0oo63ZeL.css,01rdVnPkgmL.css,21Z9bojV5YL.css,01K0fSFz6eL.css,014eilLW+IL.css,01MU0Cb7yFL.css,017ZL57GkjL.css,01CHSSMW4hL.css_.css?AUIClients/SearchPartnerAssets&UNuukQ40"),
          http("request_146")
            .get(uri12 + "/I/31nlqjt2PrL.css?AUIClients/DetailPageAllOffersDisplayAssets&jVGJ2ERz"),
          http("request_147")
            .get(uri12 + "/I/01tJTKp89CL._RC%7C21GzhyHwjOL.css,01Q-bj+2dgL.css,01dy0wz97BL.css,21Xt6HV2QcL.css,01EsS3sB+PL.css,01fjhMA6eZL.css,01XR1PRX6GL.css,01SGj-l7qnL.css,11ZMJvzBqdL.css,01Ph6sZAceL.css,01M6XwEY1qL.css,711OnqDRaaL.css,01wiI2pQqRL.css,01MPYXlmzdL.css,11gm9Pqo3ZL.css,01JsvXDH4cL.css,01GgmOtso9L.css,01iweABC--L.css,0143nwm-WoL.css_.css?AUIClients/ProductUIAssets&Uk1kgw5I"),
          http("request_148")
            .get(uri12 + "/I/11mVszy8FIL.js?AUIClients/AmazonRushAssetLoader"),
          http("request_149")
            .get(uri12 + "/I/41kCtwlCFqL.js?AUIClients/AmazonRushFramework"),
          http("request_150")
            .get(uri12 + "/I/21cuxCuJB9L.js?AUIClients/AmazonRushRouter"),
          http("request_151")
            .get(uri12 + "/I/11A1Q93BHbL._RC%7C31YYsFFQrXL.js,31Iq4x9+ecL.js,01BPbuoKVCL.js,31GfnrIX3CL.js,01+nIi7vQ6L.js,315IZLuJm+L.js,31sAffTU-DL.js,01r1r3sVlxL.js,21Ys41aj48L.js,115Ysi-lEWL.js,01XQQDMWkKL.js,012z3lMdhOL.js,11dFVWwNCJL.js,01b82LFIRTL.js,11w8z9cET7L.js,015CwW0puPL.js,21jeZDicdtL.js,01MsgM7hzDL.js,21dMhWokf7L.js,21dI9VFkXVL.js,01FA0ZefFJL.js_.js?AUIClients/SearchAssets&e3KkAr+V"),
          http("request_152")
            .get(uri12 + "/I/21jfY81shVL._RC%7C01mbLYIbb6L.js,41NPz88sBEL.js,41LSTLTuyyL.js,11jWtxew3JL.js,017HkCEd5gL.js,21DHhna6ycL.js,21EWUEKXTEL.js,01DTApdmRGL.js,11P9+f2WoeL.js,11s69IMeXSL.js,01peSwKV8mL.js,01Sdh4wVe3L.js,01MYMDYOc0L.js,01SSs1udVFL.js,017MBv9t0oL.js,01Se6rdZ16L.js,21fbsMlRZ+L.js,0102ySY2JzL.js,01-0s1MjxEL.js,015FiitmhFL.js,017cIAbvZsL.js,21QT3gUErJL.js,01MJ-h1wjNL.js_.js?AUIClients/ProductUIAssets&MPpaNqz9"),
          http("request_153")
            .get(uri12 + "/I/01zKhl-DyGL._RC%7C21ojI99jc4L.js,41pa4zoYJAL.js,01N0G7oHRlL.js,31afBQnlthL.js,21Gn8WTjh2L.js,11viIoOEOPL.js,01PRkM1aDfL.js,21hiWgu4ezL.js,21wma4EBp3L.js,01TF4KwVp5L.js,21p-Cc6hWJL.js,31M5iaJEqeL.js,21SubJ7cGnL.js,119j-jV1U3L.js,01+foxqLRaL.js,21eU3SvX0yL.js,21fAUGxUxsL.js,51muTcl-zGL.js,3162FDfYmPL.js,01ly-sHeg8L.js,31jhe2Yp4qL.js,01acF69nbrL.js,31CF7mNdGYL.js,21i4Nr0pHgL.js,21zQdE9ch2L.js,21ptL48PNRL.js,11jC1BUSQzL.js,013Fzw-eTvL.js,21QnPVLIO1L.js,31i0Hd4f3IL.js,01993rJ5roL.js,011gqdvx+zL.js,01HV1B-ydIL.js,01RWIxvuYCL.js,012USBOk43L.js,01GsEhoWBNL.js,01iuGGm5FYL.js,51ioflNCb7L.js_.js?AUIClients/SearchPartnerAssets&NXicBBrC"),
          http("request_154")
            .get(uri22 + "/e/loi/imp?b=JGBOg4l7Z-hQzCQzTeC2oIwAAAGG5VipsgMAAAH2AQBvbm9fdHhuX2JpZDEgICBOL0EgICAgICAgICAgICBUF2Qm")
            .headers(headers_101),
          http("request_155")
            .get(uri22 + "/e/loi/imp?b=JPAz4KyRmvTiauD4V9jF6FsAAAGG5VipsgMAAAH2AQBvbm9fdHhuX2JpZDEgICBOL0EgICAgICAgICAgICC8qkfm")
            .headers(headers_101),
          http("request_156")
            .get(uri12 + "/I/41SQxOS-78L.js?xcp"),
          http("request_157")
            .get(uri18 + "/61ZS63EQSsL.js?AUIClients/AmazonUIjQuery"),
          http("request_158")
            .get(uri18 + "/51QTt0kZ0-L.js?AUIClients/CardJsRuntimeBuzzCopyBuild"),
          http("request_159")
            .get(uri18 + "/11Y+5x+kkTL._RC%7C51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01pTleTFZOL.js_.js?AUIClients/AmazonUI&MFdCk5El"),
          http("request_160")
            .get(uri12 + "/I/41AN3YMKFYL._RC%7C714DuZosJiL.js,01F+A05ogQL.js,01phmzCOwJL.js,01eOvPdxG7L.js,71T+UV0Q3mL.js,41gNKoK0s7L.js,115pV8Rl02L.js,01+pnQJuQ0L.js,21+aV0AEB8L.js,11k47yUMOjL.js,41rU9l+NGKL.js,51t-JTxfnwL.js,317BC63dC8L.js,11lEMI5MhIL.js,31c7Fn9h9gL.js,01LEzWzrPZL.js,01AqeWA7PKL.js_.js?AUIClients/NavDesktopUberAsset&pYZxqR4I"),
          http("request_161")
            .get(uri12 + "/I/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,41tGz3DNCrL.css,31ufSReDtSL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11fJbvhE5HL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21P6CS3L9LL.css,01oDR3IULNL.css,41Axm2+z87L.css,01XPHJk60-L.css,01S0vRENeAL.css,21aPhFy+riL.css,11MrAKjcAKL.css,21fecG8pUzL.css,11a5wZbuKrL.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11gKCCKQV+L.css,11061HxnEvL.css,11oHt2HYxnL.css,01j2JE3j7aL.css,11JQtnL-6eL.css,21KA2rMsZML.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21uwtfqr5aL.css,11QyqG8yiqL.css,11K24eOJg4L.css,11F2+OBzLyL.css,01890+Vwk8L.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI&MIPTuSwt"),
          http("request_162")
            .get(uri12 + "/I/61yXDIPmT-L._RC%7C11Y+5x+kkTL.js,51Am7NcREVL.js,11yKORv-GTL.js,11GgN1+C7hL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,21SDJtBU-PL.js,012FVc3131L.js,11rRjDLdAVL.js,516j7qaWchL.js,11kWu3cNjYL.js,11wr1I7-WYL.js,11OREnu1epL.js,11Wm6BwZ+6L.js,21ssiLNIZvL.js,0190vxtlzcL.js,51+N26vFcBL.js,01JYHc2oIlL.js,31nfKXylf6L.js,01ezj5Rkz1L.js,11bEz2VIYrL.js,31o2NGTXThL.js,01rpauTep4L.js,01kEfMJRZwL.js_.js?AUIClients/AmazonUI&MFdCk5El"),
          http("request_163")
            .get(uri12 + "/I/314KUnfp3+L.js?AUIClients/AllOffersDisplayIngressAssets&P3lk6dwL")
        )
    )
    .pause(1)
    .exec(
      http("request_164")
        .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fs-on-search-route%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26m%3D1%26sc0%3Ds-on-search-route%26pc0%3D2787%26s-on-search-route0%3D2788%26t0%3D1678885041280%26rt%3Dcf%3A74-6-6-58-3-18-0_af%3A74-6-6-58-3-18-0_%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.23.1-2023-03-12%7CmutObsYes%7Cewc%3Aunpersist%7Cewc%3Aunpersist%3Aemptycart%7Cewc%3Abview%7Cewc%7Cewc%3Aunrec%7Cewc%3Acartsize%3A0%7Cewc%3Aaui%7Cnavbar%7Csupports%3Amutationobserver%3Atrue%7Csupports%3Agetelementsbyclassname%3Atrue%7Csupports%3Amap%3Atrue%7CmutObsActive%7Cfls-eu-amazon-in%7Cadblk_no%7CperfYes%7Cfy_cdn_fr%7Cfy_cdn_mp%7Caui%3Asw%3Appft%3Apage_proxy%3Aactive%7Caui%3Asw%3Appft%3Anp%3Aenabled%3Atrue%7Ccsm-feature-touch-enabled%3Afalse%26viz%3Dvisible%3A12%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:2790")
        .headers(headers_50).check(status().in(200,404,500))
        .resources(
          http("request_165")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fs-on-search-route%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3Daui%3Asw%3Appft%3Acallback_ricb%26bb0%3D53%26pc0%3D1389%26ld0%3D1389%26t0%3Dundefined%26sc1%3Dportal-bb%26pc1%3D12%26ld1%3D13%26t1%3Dundefined%26sc2%3DamznSafeFrameHost%26bb2%3D642%26pc2%3D642%26ld2%3D643%26t2%3Dundefined%26sc3%3DsearchSafeFrame%3AMAIN%26bb3%3D1018%26be3%3D1022%26x13%3D1349%26cf3%3D1573%26pc3%3D1763%26ld3%3D1763%26t3%3Dundefined%26sc4%3DsearchSafeFrame%3ALEFT%26bb4%3D1283%26be4%3D1287%26x14%3D1462%26cf4%3D1660%26pc4%3D2220%26ld4%3D2220%26t4%3Dundefined%26sc5%3Daui%3Asw%3Apage_proxy%3Arequest_feature_tags%26bb5%3D1390%26cf5%3D1517%26af5%3D1578%26pc5%3D1579%26ld5%3D1579%26t5%3Dundefined%26sc6%3DcsmCELLSframework%26bb6%3D1481%26pc6%3D1481%26ld6%3D1482%26t6%3Dundefined%26sc7%3DcsmCELLSpdm%26bb7%3D1482%26pc7%3D1483%26ld7%3D1483%26t7%3Dundefined%26sc8%3DcsmCELLSvpm%26bb8%3D1483%26pc8%3D1484%26ld8%3D1484%26t8%3Dundefined%26sc9%3DcsmCELLSfem%26bb9%3D1484%26pc9%3D1484%26ld9%3D1484%26t9%3Dundefined%26sc10%3Due_sushi_v1%26bb10%3D1485%26pc10%3D1487%26ld10%3D1487%26t10%3Dundefined%26sc11%3DSocialShareJS%26bb11%3D1816%26be11%3D1890%26pc11%3D1890%26ld11%3D1890%26t11%3Dundefined%26sc12%3DSocialShareFramework%26bb12%3D1874%26be12%3D1878%26pc12%3D1878%26ld12%3D1878%26t12%3Dundefined%26sc13%3DSocialShareFramework.%26bb13%3D1874%26be13%3D1878%26pc13%3D1878%26ld13%3D1878%26t13%3Dundefined%26sc14%3Ds-startup-component-scan%26bb14%3D2758%26cf14%3D2759%26pc14%3D2774%26ld14%3D2775%26t14%3Dundefined%26sc15%3Ds-swac%26bb15%3D2782%26cf15%3D2783%26pc15%3D2783%26ld15%3D2783%26t15%3Dundefined:2790")
            .headers(headers_50),
          http("request_166")
            .post(uri02 + "/com.amazon.csm.nexusclient.prod")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0166_request.json")),
          http("request_167")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3DsearchSafeFrame%3Amodal%3As-safe-modal-singleton%26bb0%3D1289%26be0%3D1392%26x10%3D1470%26cf0%3D1761%26pc0%3D3184%26ld0%3D3184%26t0%3D1678885041676%26csmtags%3DDisplayAdsSkyscraperSlotContentV2%7CDisplayAdsFooterSlotContentV2%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:3184")
            .headers(headers_50),
          http("request_168")
            .get(uri17 + "/rd/uedata?s-on-search-route&v=0.243452.0&id=YXRAQ92V6FR6GZ47WJ5F&ctb=1&m=1&sc0=s-on-search-route&pc0=2787&s-on-search-route0=2788&t0=1678885041280&rt=cf:74-6-6-58-3-18-0_af:74-6-6-58-3-18-0_&csmtags=aui|aui:aui_build_date:3.23.1-2023-03-12|mutObsYes|ewc:unpersist|ewc:unpersist:emptycart|ewc:bview|ewc|ewc:unrec|ewc:cartsize:0|ewc:aui|navbar|supports:mutationobserver:true|supports:getelementsbyclassname:true|supports:map:true|mutObsActive|fls-eu-amazon-in|adblk_no|perfYes|fy_cdn_fr|fy_cdn_mp|aui:sw:ppft:page_proxy:active|aui:sw:ppft:np:enabled:true|csm-feature-touch-enabled:false&viz=visible:12&pty=Search&spty=List&pti=undefined&tid=JZXDKYMH6K3Q0K195P4D&aftb=1")
            .headers(headers_47),
          http("request_169")
            .head(uri23)
            .headers(headers_26),
          http("request_170")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3Daod-ingress-assets-load-time%26bb0%3D3994%26pc0%3D3994%26ld0%3D3994%26t0%3D1678885042486%26csmtags%3DhasInlineWidgets%3Atrue%7Csearch_results%3Ahidden%3Afalse%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:3993")
            .headers(headers_50),
          http("request_171")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3Dmulti-brand-creative-desktop_loom-desktop-brand-footer-slot_89%26bb0%3D717%26be0%3D1016%26pc0%3D4302%26ld0%3D4302%26t0%3D1678885042794%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:4301")
            .headers(headers_50),
          http("request_172")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26sw%3D1536%26sh%3D864%26vw%3D1519%26vh%3D414%26m%3D1%26sc%3DYXRAQ92V6FR6GZ47WJ5F%26ue%3D13%26bb%3D268%26ns%3D313%26ne%3D606%26be%3D1478%26fp%3D1305%26fcp%3D1305%26cf%3D621%26af%3D621%26fn%3D621%26pc%3D4587%26tc%3D-1584%26na_%3D-1584%26ul_%3D-367%26_ul%3D-367%26rd_%3D-1678885038492%26_rd%3D-1678885038492%26fe_%3D-1579%26lk_%3D-1579%26_lk%3D-1579%26co_%3D-1579%26_co%3D-1579%26sc_%3D-1678885038492%26rq_%3D-1573%26rs_%3D-1128%26_rs%3D-306%26dl_%3D-268%26di_%3D1539%26de_%3D1540%26_de%3D1547%26_dc%3D4586%26ld_%3D4586%26_ld%3D-1678885038492%26ntd%3D-1%26ty%3D0%26rc%3D0%26hob%3D9%26hoe%3D14%26ld%3D4588%26t%3D1678885043080%26ctb%3D1%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1%26ui%3D2:4594")
            .headers(headers_50),
          http("request_173")
            .get(uri22 + "/e/xsp/getAdj?placementId=8a02f48b-2df7-46b7-bbd7-00e0fef1b712&src=511&slot=auto-left-advertising-1&rid=0101ae061320edb58edc9fccecb11b4cf85c3d34a4af88aa3e060eac912e6b03b428&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_115),
          http("request_174")
            .get(uri22 + "/e/xsp/getAdj?src=511&slot=auto-bottom-advertising-0&rid=0101ae061320edb58edc9fccecb11b4cf85c3d34a4af88aa3e060eac912e6b03b428&rj=%7B%7D&callback=aax_xsp_render_ad")
            .headers(headers_115),
          http("request_175")
            .get(uri17 + "/rd/uedata?ld&v=0.243452.0&id=YXRAQ92V6FR6GZ47WJ5F&sw=1536&sh=864&vw=1519&vh=414&m=1&sc=YXRAQ92V6FR6GZ47WJ5F&ue=13&bb=268&ns=313&ne=606&be=1478&fp=1305&fcp=1305&cf=621&af=621&fn=621&pc=4587&tc=-1584&na_=-1584&ul_=-367&_ul=-367&rd_=-1678885038492&_rd=-1678885038492&fe_=-1579&lk_=-1579&_lk=-1579&co_=-1579&_co=-1579&sc_=-1678885038492&rq_=-1573&rs_=-1128&_rs=-306&dl_=-268&di_=1539&de_=1540&_de=1547&_dc=4586&ld_=4586&_ld=-1678885038492&ntd=-1&ty=0&rc=0&hob=9&hoe=14&ld=4588&t=1678885043080&ctb=1&pty=Search&spty=List&pti=undefined&tid=JZXDKYMH6K3Q0K195P4D&aftb=1&ui=2")
            .headers(headers_47),
          http("request_176")
            .get(uri05 + "/iu3?d=amazon.in&slot=navFooter&a2=01014b56b988dd8964df75af43f54c43c78c2b97a35316442ae6c5c22b93f7d758a9&old_oo=0&ts=1678885038183&s=AUm8Y0X9MccfoSk0x4IxWlTwxYkB4sC27MSakHyJjYHK&gdpr_consent=&gdpr_consent_avl=&cb=1678885038183")
            .headers(headers_60),
          http("request_177")
            .post(uri06)
            .headers(headers_137)
            .body(RawFileBody("computerdatabase/amazon/0177_request.json")),
          http("request_178")
            .get(uri08),
          http("request_179")
            .get(uri08),
          http("request_180")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Alcp%26lcp%3D1304%26pc%3D5650%26at%3D5650%26t%3D1678885044142%26csmtags%3Daui%3Asw%3Abrowser%3Aregister%3Asupported%7CbrowserQuiteFn%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5806")
            .headers(headers_50),
          http("request_181")
            .get(uri05 + "/v3/pr?exlist=nsln_n-eq-HMT2_mp&fv=1.0&a=cm&dmt=1&gdpr_consent=&ep=ChiAlU1xX0Py6CDEij08XvSSYacMvxHuVcaPdN59q7a97-Z7CvmKq3sqpgQSTUcShDl1sJ7hgTTn2LoIslrSvPraRcK0MDWjr8WCTMS2n_hwq6i5kZYuyaicn5hSRnvh")
            .headers(headers_60),
          http("request_182")
            .get(uri10 + "/?partnerid=145&partneruserid=8H5Wrv4ESJuunIVrXEssBQ&redirurl=https%3A%2F%2Faax-eu.amazon-adsystem.com%2Fs%2Fecm3%3Fex%3DequativHMT%26id%3D%26sspid%3DSMART_USER_ID&gdpr_consent=")
            .headers(headers_29),
          http("request_183")
            .get(uri04 + "/?p=204&g=8889&j=0")
            .headers(headers_62),
          http("request_184")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AbrowserQuiteFn%26pc%3D5613%26at%3D5613%26t%3D1678885044105%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5812")
            .headers(headers_50),
          http("request_185")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5850%26at%3D5850%26t%3D1678885044342%26csmtags%3DstartVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5850")
            .headers(headers_50),
          http("request_186")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Avl50%26vl50%3D331%26pc%3D5853%26at%3D5853%26t%3D1678885044345%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5852")
            .headers(headers_50),
          http("request_187")
            .get(uri11 + "?tagid=V2_393725&AMAZON_REGION_SPECIFIC_ENDPOINT=aax-eu.amazon-adsystem.com/s&src.visitorID=FAOox1JxTHa3CIQXlvQFLw")
            .headers(headers_62),
          http("request_188")
            .get(uri17 + "/af/feedback-link?ie=UTF-8&pl=%7B%22adPlacementMetaData%22%3A%7B%22feedbackType%22%3A%22loomSearch%22%2C%22pageType%22%3A%22Search%22%2C%22slotName%22%3A%22auto-bottom-advertising-0%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adCreativeId%22%3A%22undefined%22%2C%22adCreativeTemplateName%22%3A%22dynamicecommercesdciindesktop%22%2C%22adId%22%3A%2220098434718898%22%2C%22adImpressionId%22%3A%22https%3A%2F%2Faax-eu.amazon.in%2Fe%2Fxsp%2Fimp%3Fb%3DRH46lE2ImnUIhr3PpKGycRMAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICATjZy3%22%2C%22adProgramId%22%3A%221027%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_135),
          http("request_189")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0189_request.bin")),
          http("request_190")
            .get(uri17 + "/af/feedback-link?ie=UTF-8&pl=%7B%22adPlacementMetaData%22%3A%7B%22feedbackType%22%3A%22loomSearch%22%2C%22pageType%22%3A%22Search%22%2C%22slotName%22%3A%22auto-left-advertising-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adCreativeId%22%3A%22undefined%22%2C%22adCreativeTemplateName%22%3A%22dynamicecommercesdciindesktop%22%2C%22adId%22%3A%2220098441641398%22%2C%22adImpressionId%22%3A%22https%3A%2F%2Faax-eu.amazon.in%2Fe%2Fxsp%2Fimp%3Fb%3DRC7tru5ZJpN3QZTDTxanvbgAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICBJUM5C%22%2C%22adProgramId%22%3A%221027%22%2C%22adNetwork%22%3A%22cs%22%7D%7D")
            .headers(headers_135),
          http("request_191")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Avl90%26vl90%3D3885%26pc%3D5854%26at%3D5854%26t%3D1678885044346%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5853")
            .headers(headers_50),
          http("request_192")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Avl100%26vl100%3D3885%26pc%3D5855%26at%3D5855%26t%3D1678885044347%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5854")
            .headers(headers_50),
          http("request_193")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5871%26at%3D5871%26t%3D1678885044363%26csmtags%3DendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5870")
            .headers(headers_50),
          http("request_194")
            .get(uri20 + "/?3717b808-4cf3-01a5-2141-3cedee2600e7")
            .headers(headers_76),
          http("request_195")
            .get(uri09 + "/?3717b808-4cf3-01a5-2141-3cedee2600e7")
            .headers(headers_76),
          http("request_196")
            .post(uri14)
            .headers(headers_131)
            .body(RawFileBody("computerdatabase/amazon/0196_request.json")),
          http("request_197")
            .post(uri14)
            .headers(headers_131)
            .body(RawFileBody("computerdatabase/amazon/0197_request.json")),
          http("request_198")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Aatfsi%26atfsi%3D1326%26pc%3D5872%26at%3D5872%26t%3D1678885044364%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5871")
            .headers(headers_50),
          http("request_199")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5874%26at%3D5874%26t%3D1678885044366%26csmtags%3DstartVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5873")
            .headers(headers_50),
          http("request_200")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5875%26at%3D5875%26t%3D1678885044367%26csmtags%3DendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5874")
            .headers(headers_50),
          http("request_201")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5876%26at%3D5876%26t%3D1678885044368%26csmtags%3DstartVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5876")
            .headers(headers_50),
          http("request_202")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5878%26at%3D5878%26t%3D1678885044370%26csmtags%3DendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5878")
            .headers(headers_50),
          http("request_203")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5879%26at%3D5879%26t%3D1678885044371%26csmtags%3DstartVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5879")
            .headers(headers_50),
          http("request_204")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5880%26at%3D5880%26t%3D1678885044372%26csmtags%3DendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5880")
            .headers(headers_50),
          http("request_205")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AstartVL%26pc%3D5881%26at%3D5881%26t%3D1678885044373%26csmtags%3DstartVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5881")
            .headers(headers_50),
          http("request_206")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3AendVL%26pc%3D5882%26at%3D5882%26t%3D1678885044374%26csmtags%3DendVL%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5882")
            .headers(headers_50),
          http("request_207")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fat%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26m%3D1%26sc%3Dcsa%3Asi%26si%3D2029%26pc%3D5884%26at%3D5884%26t%3D1678885044376%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:5884")
            .headers(headers_50),
          http("request_208")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3DsafeFrame%3A412fa7a81328520564afd6b98d8b621d4045284d%3Aadplacements%3Asearch%3Aauto-bottom-advertising-0%3Aportal-batch-fast-btf-loom%26bb0%3D1764%26af0%3D1766%26cf0%3D6376%26pc0%3D7540%26ld0%3D7540%26t0%3D1678885046032%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7539")
            .headers(headers_50),
          http("request_209")
            .get("/1/batch/1/OP/A21TJRUUN4KGV:262-7890721-2689554:YXRAQ92V6FR6GZ47WJ5F$uedata=s:%2Frd%2Fuedata%3Fld%26v%3D0.243452.0%26id%3DYXRAQ92V6FR6GZ47WJ5F%26ctb%3D1%26sc0%3DsafeFrame%3A6711014270a37cd3cd8d7e47d333ff58eefb5754%3Aadplacements%3Asearch%3Aauto-left-advertising-1%3Asearch-desktop-loom%26bb0%3D2214%26af0%3D2217%26cf0%3D6400%26pc0%3D7581%26ld0%3D7581%26t0%3D1678885046073%26pty%3DSearch%26spty%3DList%26pti%3Dundefined%26tid%3DJZXDKYMH6K3Q0K195P4D%26aftb%3D1:7581")
            .headers(headers_50),
          http("request_210")
            .get(uri22 + "/e/xsp/imp?b=RH46lE2ImnUIhr3PpKGycRMAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICATjZy3&pj=%7B%22measurementMethod%22%3A%22btr_client%22%7D")
            .headers(headers_101),
          http("request_211")
            .get(uri22 + "/e/xsp/imp?b=RC7tru5ZJpN3QZTDTxanvbgAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICBJUM5C&pj=%7B%22measurementMethod%22%3A%22btr_client%22%7D")
            .headers(headers_101),
          http("request_212")
            .post(uri06)
            .headers(headers_137)
            .body(RawFileBody("computerdatabase/amazon/0212_request.json")),
          http("request_213")
            .get(uri22 + "/x/px/RH46lE2ImnUIhr3PpKGycRMAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICATjZy3/atf/%7B%22atf%22:false,%22ts%22:1678885047797%7D")
            .headers(headers_101),
          http("request_214")
            .get(uri22 + "/x/px/RC7tru5ZJpN3QZTDTxanvbgAAAGG5VipkAMAAAH_AQBvbm9fdHhuX2JpZDIgICBOL0EgICAgICAgICAgICBJUM5C/atf/%7B%22atf%22:false,%22ts%22:1678885047802%7D")
            .headers(headers_101),
          http("request_215")
            .post(uri06)
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/amazon/0215_request.json")),
          http("request_216")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0216_request.bin")),
          http("request_217")
            .post(uri02 + "/com.amazon.csm.nexusclient.prod")
            .headers(headers_43)
            .body(RawFileBody("computerdatabase/amazon/0217_request.json")),
          http("request_218")
            .post(uri06)
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/amazon/0218_request.json")),
          http("request_219")
            .post("/1/batch/1/OE/")
            .headers(headers_1)
            .body(RawFileBody("computerdatabase/amazon/0219_request.bin"))
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(10))).protocols(httpProtocol);
  }
}
