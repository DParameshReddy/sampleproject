package computerdatabase;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class trsting extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://rukminim1.flixcart.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 Edg/111.0.1661.41");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Access-Control-Request-Headers", "content-type,x-user-agent"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-site")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("X-User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 Edg/111.0.1661.41 FKUA/website/42/website/Desktop"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_87 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Access-Control-Request-Headers", "content-type"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_109 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("sec-ch-ua", "Microsoft Edge\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private String uri2 = "https://1.rome.api.flipkart.com/api";
  
  private String uri3 = "https://www.googletagmanager.com/gtag/js";
  
  private String uri4 = "https://pla-tk.flipkart.net/mapi/v1/tracker/eventBatch";
  
  private String uri5 = "https://rome.api.flipkart.com/api";
  
  private String uri6 = "https://www.flipkart.com";

  private ScenarioBuilder scn = scenario("trsting")
    .exec(
      http("request_0")
        .get("/fk-p-flap/1688/280/image/600df408bf9e6ed6.jpg?q=50")
        .headers(headers_0)
    )
    .pause(3)
    .exec(
      http("request_1")
        .get("/fk-p-flap/1688/280/image/d7d698bf77498a4e.jpg?q=50")
        .headers(headers_0)
    )
    .pause(4)
    .exec(
      http("request_2")
        .options(uri2 + "/1/fdp")
        .headers(headers_2)
        .resources(
          http("request_3")
            .post(uri2 + "/1/fdp")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0003_request.json")),
          http("request_4")
            .get(uri6 + "/")
            .headers(headers_4),
          http("request_5")
            .get("/fk-p-flap/844/140/image/f96fa917d580b5ec.jpg?q=50")
            .headers(headers_5),
          http("request_6")
            .get("/image/200/200/kmp7ngw0/monitor/j/z/h/s2721hn-27-py0df-dell-original-imagfjphuywuh2a7.jpeg?q=70")
            .headers(headers_5),
          http("request_7")
            .get("/image/200/200/kactpjk0/shaver/m/6/z/philips-s1121-45-s1121-45-original-imafry2qgxcwnm9r.jpeg?q=70")
            .headers(headers_5),
          http("request_8")
            .get("/image/200/200/xif0q/projector/k/h/n/i9-pro-max-hd-720p-10-e03i31-led-projector-egate-original-imaghhxfshbcbk55.jpeg?q=70")
            .headers(headers_5),
          http("request_9")
            .get("/image/200/200/l5ld8y80/monitor/l/k/s/-original-imagg897ufhyvwqq.jpeg?q=70")
            .headers(headers_5),
          http("request_10")
            .get("/image/200/200/hair-dryer/c/t/g/philips-hp8100-46-original-imaemymzuxrnzfjb.jpeg?q=70")
            .headers(headers_5),
          http("request_11")
            .get("/image/200/200/xif0q/monitor/b/r/y/sa220q-full-hd-21-5-um-ws0si-a01-acer-original-imagg4fjegqnmkgq.jpeg?q=70")
            .headers(headers_5),
          http("request_12")
            .get("/image/200/200/kql8sy80/monitor/o/u/h/l27e-30-27-66bekac2in-lenovo-original-imag4kkqzmu4pkan.jpeg?q=70")
            .headers(headers_5),
          http("request_13")
            .get("/image/200/200/kura1e80/monitor/l/t/l/gw2280-full-hd-22-gw2280-benq-original-imag7t9tqskqfeen.jpeg?q=70")
            .headers(headers_5),
          http("request_14")
            .get("/image/200/200/k7w8eq80/two-wheeler-tyre/v/y/s/90-90-12-106061-milaze-tl-54j-sw-ceat-original-imafqyx5tnfraaxh.jpeg?q=70")
            .headers(headers_5),
          http("request_15")
            .get("/image/200/200/l3uhvgw0/cycle/n/z/c/torro-26t-26-16-montra-72-21-gear-original-imagevzncygdd8ah.jpeg?q=70")
            .headers(headers_5),
          http("request_16")
            .get("/image/200/200/k6fd47k0/nut-dry-fruit/p/z/7/200-100-natural-california-pouch-happilo-original-imafzvw2tcazeur6.jpeg?q=70")
            .headers(headers_5),
          http("request_17")
            .get("/image/200/200/jk1grrk0/car-pressure-washer/j/c/m/06008a7af0-bosch-original-imaf7hd6bv8g3m6r.jpeg?q=70")
            .headers(headers_5),
          http("request_18")
            .get("/image/200/200/jlph9jk0/cycle/h/f/k/skyper-26t-sskp26bk0001-16-hero-original-imaf8ru5xysfgtmx.jpeg?q=70")
            .headers(headers_5),
          http("request_19")
            .get("/image/200/200/k186fm80/bat/9/f/n/1000-1200-short-handle-endorsed-for-light-hard-tennis-ball-with-original-imafkuuyxrrphkbr.jpeg?q=70")
            .headers(headers_5),
          http("request_20")
            .get("/image/200/200/jms25jk0/dumbbell/e/p/r/pvc-combo16-na-8-krx-original-imaepy3rcgm3nsva.jpeg?q=70")
            .headers(headers_5),
          http("request_21")
            .get("/image/200/200/kjuby4w0/deodorant/v/c/d/400-one8-intense-fresh-deo-pack-of-2-200ml-x-2-2-perfume-body-original-imafzbn4nv2zhccp.jpeg?q=70")
            .headers(headers_5),
          http("request_22")
            .get("/image/200/200/xif0q/sandal/q/6/n/6-crocs-205089-crocs-slategrey-limepunch-original-imaghumcgrhqnzqp.jpeg?q=70")
            .headers(headers_5),
          http("request_23")
            .get("/image/200/200/xif0q/shoe/t/q/w/-original-imagmfquwff5tkwz.jpeg?q=70")
            .headers(headers_5),
          http("request_24")
            .get("/image/200/200/klscivk0/trouser/q/q/k/28-sktr-4242-olv-fubar-original-imagyuff8uq6cxny.jpeg?q=70")
            .headers(headers_5),
          http("request_25")
            .get("/image/200/200/xif0q/shoe/y/i/h/6-369866-6-puma-white-black-original-imagnghgfgbvxjzk.jpeg?q=70")
            .headers(headers_5),
          http("request_26")
            .get("/image/200/200/xif0q/jean/w/f/u/30-hljn000690-highlander-original-imafpchxfs6zzjyh-bb.jpeg?q=70")
            .headers(headers_5),
          http("request_27")
            .get("/image/200/200/xif0q/t-shirt/f/z/o/l-dfgf-try-this-original-imagn6nt3wq94zhe.jpeg?q=70")
            .headers(headers_5),
          http("request_28")
            .get("/image/200/200/kigbjbk0-0/speaker/home-theatre/v/u/b/it-4-1-xm-bang-sufb-4-1-bang-plus-fmub-os-intex-original-imafy8ntmfjwzyja.jpeg?q=70")
            .headers(headers_5),
          http("request_29")
            .get("/image/200/200/xif0q/smartwatch/d/u/f/-original-imaghbgakwcqed9h.jpeg?q=70")
            .headers(headers_5),
          http("request_30")
            .get("/image/200/200/xif0q/sandal/p/a/b/5-gd-0491108wsa-39-woodland-camel-original-imagg2yywd45rhyy.jpeg?q=70")
            .headers(headers_5),
          http("request_31")
            .get("/image/200/200/kh2b4i80-0/shoe/0/r/o/hiw18-7-reebok-black-original-imafx5v3b6wbnw8f.jpeg?q=70")
            .headers(headers_5),
          http("request_32")
            .get("/image/200/200/xif0q/shoe/g/c/o/9-rockey-9-magnolia-white-original-imaggutpbvcczyhf.jpeg?q=70")
            .headers(headers_5),
          http("request_33")
            .get("/image/200/200/xif0q/suitcase/p/x/b/-original-imagnaw24btnvkh6.jpeg?q=70")
            .headers(headers_5),
          http("request_34")
            .get("/image/312/312/xif0q/suitcase/7/j/p/-original-imagkuxzvzbhusvy.jpeg?q=70")
            .headers(headers_5),
          http("request_35")
            .get("/image/312/312/kl5hh8w0/suitcase/u/x/x/spotlight-4w-exp-str-58-e-blue-stspowe58blu-cabin-luggage-original-imagyc7gup7fyeg3.jpeg?q=70")
            .headers(headers_5),
          http("request_36")
            .get("/image/312/312/ktn9pjk0/suitcase/h/d/m/gamma-gamma754wtea-check-in-luggage-safari-original-imag6y3jmyxwyabs.jpeg?q=70")
            .headers(headers_5),
          http("request_37")
            .get("/image/312/312/kgpg5u80/suitcase/h/g/j/71-vermont-spinner-70-cm-black-fv9-0-09-002-check-in-luggage-original-imafwvr4tpfzx69n.jpeg?q=70")
            .headers(headers_5),
          http("request_38")
            .get("/image/312/312/kkprmvk0/suitcase/l/p/j/star-55-4w-black-star554wblk-cabin-luggage-safari-original-imagyyffzgku6fzu.jpeg?q=70")
            .headers(headers_5),
          http("request_39")
            .get("/image/312/312/k0wqwsw0/suitcase/j/m/t/brezza-4w-strolly-e-79-blue-stbrw79eblu-check-in-luggage-original-imafkhhazszvr2gh.jpeg?q=70")
            .headers(headers_5),
          http("request_40")
            .get("/image/312/312/ktyp8cw0/suitcase/c/y/e/hack-4w-exp-69-e-black-sthac69eblk-check-in-luggage-skybags-original-imag76xppmabkzjc.jpeg?q=70")
            .headers(headers_5),
          http("request_41")
            .get("/image/312/312/xif0q/suitcase/u/w/j/-original-imagkycgnydqyrwu.jpeg?q=70")
            .headers(headers_5),
          http("request_42")
            .get("/image/312/312/xif0q/suitcase/6/x/z/-original-imagkychw5gnuk7z.jpeg?q=70")
            .headers(headers_5),
          http("request_43")
            .get("/image/312/312/xif0q/suitcase/a/j/w/-original-imagkycg6qasqwzn.jpeg?q=70")
            .headers(headers_5),
          http("request_44")
            .get("/flap/128/128/image/29327f40e9c4d26b.png?q=100")
            .headers(headers_5),
          http("request_45")
            .get("/flap/128/128/image/22fddf3c7da4c4f4.png?q=100")
            .headers(headers_5),
          http("request_46")
            .get("/flap/128/128/image/c12afc017e6f24cb.png?q=100")
            .headers(headers_5),
          http("request_47")
            .get(uri3 + "?id=AW-594691041")
            .headers(headers_5),
          http("request_48")
            .get("/flap/128/128/image/ab7e2b022a4587dd.jpg?q=100")
            .headers(headers_5),
          http("request_49")
            .get("/flap/128/128/image/0ff199d1bd27eb98.png?q=100")
            .headers(headers_5),
          http("request_50")
            .get("/flap/128/128/image/71050627a56b4693.png?q=100")
            .headers(headers_5),
          http("request_51")
            .get("/flap/128/128/image/f15c02bfeb02d15d.png?q=100")
            .headers(headers_5),
          http("request_52")
            .get("/flap/128/128/image/dff3f7adcf3a90c6.png?q=100")
            .headers(headers_5),
          http("request_53")
            .get("/fk-p-flap/128/128/image/05d708653beff580.png?q=100")
            .headers(headers_5),
          http("request_54")
            .get("/fk-p-flap/278/278/image/7593e7b6640822c1.jpg?q=90")
            .headers(headers_5),
          http("request_55")
            .get("/fk-p-flap/278/278/image/b84f1c22cce1a6a3.jpg?q=90")
            .headers(headers_5),
          http("request_56")
            .get("/fk-p-flap/50/50/image/d7d698bf77498a4e.jpg?q=50")
            .headers(headers_5),
          http("request_57")
            .get("/fk-p-flap/50/50/image/d6b8eb49acbc80a0.jpg?q=50")
            .headers(headers_5),
          http("request_58")
            .get("/fk-p-flap/50/50/image/600df408bf9e6ed6.jpg?q=50")
            .headers(headers_5),
          http("request_59")
            .post(uri5 + "/1/fdp")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0059_request.json")),
          http("request_60")
            .get("/fk-p-flap/1688/280/image/f96fa917d580b5ec.jpg?q=50")
            .headers(headers_5)
        )
    )
    .pause(2)
    .exec(
      http("request_61")
        .get("/fk-p-flap/1688/280/image/d6b8eb49acbc80a0.jpg?q=50")
        .headers(headers_5)
    )
    .pause(5)
    .exec(
      http("request_62")
        .get("/fk-p-flap/1688/280/image/600df408bf9e6ed6.jpg?q=50")
        .headers(headers_5)
    )
    .pause(3)
    .exec(
      http("request_63")
        .get("/fk-p-flap/1688/280/image/d7d698bf77498a4e.jpg?q=50")
        .headers(headers_5)
    )
    .pause(4)
    .exec(
      http("request_64")
        .post(uri5 + "/1/fdp")
        .headers(headers_3)
        .body(RawFileBody("computerdatabase/trsting/0064_request.json"))
        .resources(
          http("request_65")
            .options(uri5 + "/4/page/fetch")
            .headers(headers_2),
          http("request_66")
            .post(uri5 + "/4/page/fetch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0066_request.json"))
            .check(status().is(406)),
          http("request_67")
            .options(uri2 + "/4/page/fetch")
            .headers(headers_2),
          http("request_68")
            .post(uri2 + "/4/page/fetch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0068_request.json")),
          http("request_69")
            .get("/image/612/612/l4u7vrk0/mosquito-net/w/g/i/king-size-bed-mosquito-net-for-double-bed-king-size-premium-original-imagfn5xawzqfysq.jpeg?q=70")
            .headers(headers_0),
          http("request_70")
            .post(uri2 + "/1/fdp")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0070_request.json")),
          http("request_71")
            .get("/image/612/612/kp8ntzk0/mosquito-net/9/c/7/king-size-bed-king-double-bed-mn-p-k-d-blue-flipkart-smartbuy-original-imag3gszhfvnysrs.jpeg?q=70")
            .headers(headers_0),
          http("request_72")
            .get("/image/612/612/xif0q/bedsheet/l/x/f/fsb-floral-cotton-bedsheet-1-fksb-hf-ct-013-flat-flipkart-original-imagg263gxhx5zgz.jpeg?q=70")
            .headers(headers_0),
          http("request_73")
            .get("/image/612/612/xif0q/bedsheet/o/5/7/-original-imaghmn34b9dkzy2.jpeg?q=70")
            .headers(headers_0),
          http("request_74")
            .get("/image/612/612/xif0q/shopsy-bedsheet/m/a/b/fre-101-1-10177-alaficer-original-imageht9harkhggq.jpeg?q=70")
            .headers(headers_0),
          http("request_75")
            .get("/image/612/612/xif0q/mattress-protector/q/e/f/mp-4125-m-mattress-protector-original-imaghsh52ypagyyg.jpeg?q=70")
            .headers(headers_0),
          http("request_76")
            .get("/image/612/612/kjg1jm80-0/bedsheet/i/5/b/3d-new-brown-pati-101-3d-new-brown-pati-101-flat-goodrik-original-imafzy9frv9qt8rn.jpeg?q=70")
            .headers(headers_0),
          http("request_77")
            .get("/image/612/612/xif0q/mattress-protector/e/a/t/grey-quilted-mattress-protector-60-78-compal-original-imagmj6gvcugzrdh.jpeg?q=70")
            .headers(headers_0),
          http("request_78")
            .get("/image/612/612/k3t21zk0/bedsheet/j/h/q/bedsheet-cloth-5168-bedsheet-cloth-5168-flat-rajasthanikart-original-imafmuk3tttzqy6y.jpeg?q=70")
            .headers(headers_0),
          http("request_79")
            .get("/image/612/612/xif0q/bedsheet/7/1/7/fsb-floral-cotton-bedsheet-1-fksb-hf-ct-005-flat-flipkart-original-imaghpvnymcgqfrt.jpeg?q=70")
            .headers(headers_0),
          http("request_80")
            .get("/image/612/612/xif0q/bedsheet/m/i/o/d2a-ps-bs-05-1-d2a-ps-bs-05-flat-decor2admire-original-imagndk5deafzhys.jpeg?q=70")
            .headers(headers_0),
          http("request_81")
            .get("/image/612/612/ktaeqvk0/mosquito-net/s/i/i/single-bed-net-single-bed-45-singlebedblue-kolar-original-imag6nuyzrbxmhtr.jpeg?q=70")
            .headers(headers_0),
          http("request_82")
            .get("/image/612/612/xif0q/bedsheet/r/7/s/-original-imaghmn3njxrv6sx.jpeg?q=70")
            .headers(headers_0),
          http("request_83")
            .get("/image/612/612/xif0q/bedsheet/c/m/m/-original-imaghmn3y9qegxsh.jpeg?q=70")
            .headers(headers_0),
          http("request_84")
            .options(uri2 + "/4/product/swatch")
            .headers(headers_2),
          http("request_85")
            .get("/image/612/612/xif0q/bedsheet/g/y/f/-original-imaghmn3q4dudafg.jpeg?q=70")
            .headers(headers_0),
          http("request_86")
            .get("/image/612/612/xif0q/bedsheet/n/s/v/printed-cg-bst-db650-flat-cg-homes-original-imaghqav7ejnf9c9.jpeg?q=70")
            .headers(headers_0),
          http("request_87")
            .options(uri4)
            .headers(headers_87),
          http("request_88")
            .post(uri2 + "/4/product/swatch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0088_request.json")),
          http("request_89")
            .get("/image/612/612/kk8mcnk0/mosquito-net/m/e/u/single-bed-mn-p-single-sb-mn-p-s-sb-casa-furnishing-original-imafzmtwktausvch.jpeg?q=70")
            .headers(headers_0),
          http("request_90")
            .get("/image/612/612/xif0q/mosquito-net/f/i/c/double-bed-polyester-adults-washable-machhardani-double-bed-size-original-imagnbtefsf8dwsd.jpeg?q=70")
            .headers(headers_0),
          http("request_91")
            .get("/image/612/612/l4x2rgw0/bedsheet/4/y/y/premium-cotton-double-bedsheet-with-2-pillow-covers-1-pure-original-imagfpj5hqahqan6.jpeg?q=70")
            .headers(headers_0),
          http("request_92")
            .get("/image/612/612/kdxfc7k0/mosquito-net/8/g/k/mosquito-net-polyester-pab044-keekos-original-imafuq8kux9cft6q.jpeg?q=70")
            .headers(headers_0),
          http("request_93")
            .get("/image/612/612/xif0q/bedsheet/7/b/b/-original-imaghmn3vz3jjzwe.jpeg?q=70")
            .headers(headers_0),
          http("request_94")
            .get("/image/612/612/l4a7pu80/mosquito-net/x/v/a/double-bed-machhardani-double-bed-size-6-5ft-x-200-6-5ft-x-145-original-imagf73brgggghtz.jpeg?q=70")
            .headers(headers_0),
          http("request_95")
            .get("/image/612/612/kvfkivk0/mosquito-net/g/n/c/king-size-bed-polyester-adults-mosquito-net-foldable-for-king-original-imag8cfrgxhhc457.jpeg?q=70")
            .headers(headers_0),
          http("request_96")
            .get("/image/612/612/xif0q/bedsheet/w/u/m/doll-1-doll-print-flat-mohit-prints-original-imafng3mz9qdyphw.jpeg?q=70")
            .headers(headers_0),
          http("request_97")
            .get("/image/612/612/l111lzk0/bedsheet/w/m/k/22-1-11-flat-aniket-original-imagczfkkwabree6.jpeg?q=70")
            .headers(headers_0),
          http("request_98")
            .get("/image/612/612/kuzuoi80/bedsheet/w/w/s/yellow-bindiya-1-mk-52-flat-clothology-original-imag7zsa8mdnzkqn.jpeg?q=70")
            .headers(headers_0),
          http("request_99")
            .get("/image/612/612/xif0q/mattress-protector/p/t/9/m7872-feelme-original-imagmfhxdx6nwhbc.jpeg?q=70")
            .headers(headers_0),
          http("request_100")
            .get("/image/612/612/l3nco7k0/bedsheet/t/o/a/la-dancing-pupet-gren-1-la-dancing-pupet-gren-flat-la-verne-original-imagepwgh2exnkmp.jpeg?q=70")
            .headers(headers_0),
          http("request_101")
            .get("/image/612/612/l572ufk0/bedsheet/m/9/7/bedsheet-1-3093-flat-angel-homes-original-imagfx5g6xwfztwq.jpeg?q=70")
            .headers(headers_0),
          http("request_102")
            .get("/image/612/612/kp78e4w0/bedsheet/6/p/n/red-heart-us-1100heart-flat-us-decor-hub-original-imag3hhjd6cdhfkh.jpeg?q=70")
            .headers(headers_0),
          http("request_103")
            .get("/image/612/612/xif0q/mattress-protector/d/f/r/wpzip-brown6x6-grinaf-original-imagkh9yagcngagt.jpeg?q=70")
            .headers(headers_0),
          http("request_104")
            .get("/image/612/612/j3nbwy80/bedsheet/a/z/b/rotary214-br14-fitted-flat-exotic-original-imaeuqkkh6g4yz83.jpeg?q=70")
            .headers(headers_0),
          http("request_105")
            .get("/image/612/612/ji7qikw0/mosquito-net/7/z/e/double-bed-6x6-5-feet-multicolor-mosquito-net-6x6-5multicolor-original-imaex7ckzx3rczru.jpeg?q=70")
            .headers(headers_0),
          http("request_106")
            .get("/image/612/612/kbpeoi80/bedsheet/s/7/s/floral-blue-104tc-bedsheet-fb-104-3-flat-flipkart-smartbuy-original-imafszuhyaabq4f4.jpeg?q=70")
            .headers(headers_0),
          http("request_107")
            .get("/image/612/612/xif0q/mattress-protector/u/0/s/wpzip-blue6x6-grinaf-original-imaghy822gg2gkyp.jpeg?q=70")
            .headers(headers_0),
          http("request_108")
            .get("/image/612/612/kfa0b680-0/bedsheet/f/z/v/3d-rose-gold-004-3d-rose-gold-004-flat-home-garage-original-imafvrk9dfyzhutk.jpeg?q=70")
            .headers(headers_0),
          http("request_109")
            .post(uri4)
            .headers(headers_109)
            .body(RawFileBody("computerdatabase/trsting/0109_request.json")),
          http("request_110")
            .get("/image/612/612/xif0q/bedsheet/w/v/l/traditional-jaipuri-print-1-round-gulab-green-flat-cosito-original-imagh8d8gg7dhj4g.jpeg?q=70")
            .headers(headers_0),
          http("request_111")
            .get("/image/612/612/l4ssfww0/mosquito-net/m/a/7/king-size-bed-mosquito-net-polyester-foldable-king-size-bed-original-imagfm4wqqbjtwjq.jpeg?q=70")
            .headers(headers_0),
          http("request_112")
            .get("/image/612/612/xif0q/mosquito-net/o/m/g/king-size-bed-foldable-double-bed-with-mobile-pocket-78-dy-db-original-imaggmxfwe8m6sm9.jpeg?q=70")
            .headers(headers_0),
          http("request_113")
            .get("/image/612/612/xif0q/bedsheet/o/y/d/printed-vo-db667-flat-cg-homes-original-imagmv4fsharehxu.jpeg?q=70")
            .headers(headers_0),
          http("request_114")
            .get("/www/100/100/promos/08/07/2019/7e4ee41e-ce86-43e0-834e-485eaf5a3cfb.png?q=90")
            .headers(headers_0),
          http("request_115")
            .get("/www/100/100/promos/18/07/2019/4aebbd99-7478-411e-aced-265e7722d18d.png?q=90")
            .headers(headers_0),
          http("request_116")
            .post(uri2 + "/4/product/swatch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0116_request.json")),
          http("request_117")
            .post(uri2 + "/4/product/swatch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0117_request.json")),
          http("request_118")
            .post(uri2 + "/4/product/swatch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0118_request.json"))
        )
    )
    .pause(1)
    .exec(
      http("request_119")
        .post(uri2 + "/1/fdp")
        .headers(headers_3)
        .body(RawFileBody("computerdatabase/trsting/0119_request.json"))
        .resources(
          http("request_120")
            .post(uri2 + "/4/page/fetch")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0120_request.json")),
          http("request_121")
            .get("/image/612/612/xif0q/mattress-protector/o/u/c/zy-mpt-001-zoy-original-imaggmwwdr2rvkaz.jpeg?q=70")
            .headers(headers_0),
          http("request_122")
            .get("/image/612/612/ks99aq80/bedsheet/c/z/h/multicolor-floral-rich-microfiber-bedsheet-mffl102-flat-flipkart-original-imag5v7twmeyec7g.jpeg?q=70")
            .headers(headers_0),
          http("request_123")
            .get("/image/612/612/ku5ufm80/mattress-protector/f/e/q/terry-72x78-magixy-original-imag7cenxy2szxze.jpeg?q=70")
            .headers(headers_0),
          http("request_124")
            .get("/image/612/612/xif0q/bedsheet/f/w/j/floral-designer-1-hk4808-flat-flipkart-smartbuy-original-imagjztae3zfpcfq.jpeg?q=70")
            .headers(headers_0),
          http("request_125")
            .get("/image/612/612/ksqeky80/bedsheet/a/f/e/la-bed-jaipur-kairy-1-la-bed-jaipur-kairy-flat-la-verne-original-imag68f2yzfharmb.jpeg?q=70")
            .headers(headers_0),
          http("request_126")
            .get("/image/612/612/xif0q/shopsy-bedsheet/i/b/5/428-754-754-1-213-654-545-shopglobal-original-imagbgdu88kajzfs.jpeg?q=70")
            .headers(headers_0),
          http("request_127")
            .get("/image/612/612/kuzuoi80/mosquito-net/c/l/m/double-bed-polyester-adults-blue-mosquitonet-7x7-mosquito-net-original-imag8y2mbdaffswc.jpeg?q=70")
            .headers(headers_0),
          http("request_128")
            .get("/image/612/612/xif0q/bedsheet/z/v/2/traditional-jaipuri-print-1-round-gulab-pink-flat-cosito-original-imagh8ddpgg5mrmh.jpeg?q=70")
            .headers(headers_0),
          http("request_129")
            .get("/image/612/612/kzogn0w0/mosquito-net/z/k/v/king-size-bed-king-size-bed-corrosion-free-steel-frame-double-original-imagbnfpud3ccfkv.jpeg?q=70")
            .headers(headers_0),
          http("request_130")
            .get("/image/612/612/xif0q/bedsheet/v/a/b/micky-double-bedsheet-1-mickybedsheet1-2-flat-syk-original-imaggxf2gqprhuvh.jpeg?q=70")
            .headers(headers_0),
          http("request_131")
            .get("/image/612/612/xif0q/bedsheet/t/h/k/am-db-195-1-am-db-195-flat-amrange-original-imaghnneme6n4bv4.jpeg?q=70")
            .headers(headers_0),
          http("request_132")
            .get("/image/612/612/xif0q/bedsheet/l/y/m/sky-doreamon-1-mk-79-flat-clothology-original-imaghhg8vfk2tdcy.jpeg?q=70")
            .headers(headers_0),
          http("request_133")
            .get("/image/612/612/kmmcrrk0/bedsheet/d/b/b/100-pure-cotton-double-bed-sheet-4-double-bed-sheet-with-8-original-imagfgn8xc9dxdgu.jpeg?q=70")
            .headers(headers_0),
          http("request_134")
            .get("/image/612/612/xif0q/bedsheet/f/a/7/teen-chakri-blue-1-mk-30-flat-clothology-original-imagn39ayhzss3ae.jpeg?q=70")
            .headers(headers_0),
          http("request_135")
            .get("/image/612/612/kpydrbk0/bedsheet/7/d/4/designer-3d50016-flat-iws-original-imag42k8xfjmf3x8.jpeg?q=70")
            .headers(headers_0),
          http("request_136")
            .get("/image/612/612/kbfeljk0pkrrdj/bedroom-furnishing/b/7/c/drl259-metro-living-original-imafsuy6es3vetyz.jpeg?q=70")
            .headers(headers_0),
          http("request_137")
            .get("/image/612/612/l3khsi80/bedsheet/g/m/u/marino-bedsheet-combo-2-gsb2-01-flat-luxury-trends-original-imagene6pmfddeza.jpeg?q=70")
            .headers(headers_0),
          http("request_138")
            .get("/image/612/612/ko1smfk0/bedsheet/z/0/d/stirped-bedsheets-plain-double-1bedsheets-flat-new-leaf-original-imag2hh3pbp48qgf.jpeg?q=70")
            .headers(headers_0)
        )
    )
    .pause(2)
    .exec(
      http("request_139")
        .post(uri2 + "/4/page/fetch")
        .headers(headers_3)
        .body(RawFileBody("computerdatabase/trsting/0139_request.json"))
        .resources(
          http("request_140")
            .get("/image/612/612/l3khsi80/bedsheet/9/f/v/ezzy-1-009515-bf02-flat-raymond-home-original-imagenx5zmb7kufc.jpeg?q=70")
            .headers(headers_0),
          http("request_141")
            .post(uri2 + "/1/fdp")
            .headers(headers_3)
            .body(RawFileBody("computerdatabase/trsting/0141_request.json"))
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
