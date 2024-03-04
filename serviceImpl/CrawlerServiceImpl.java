<<<<<<< HEAD
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
=======
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
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
