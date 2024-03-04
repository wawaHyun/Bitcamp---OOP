package serviceImpl;

import org.jsoup.Jsoup;
import service.CrawlerService;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class CrawlerServiceImpl implements CrawlerService {
    @Override
    public void findNameFromWeb() throws IOException {
        Document doc = Jsoup.connect("bring the webpage rink").get();
    }
}
