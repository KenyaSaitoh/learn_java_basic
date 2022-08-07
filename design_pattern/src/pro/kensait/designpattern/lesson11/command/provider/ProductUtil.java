package pro.kensait.designpattern.lesson11.command.provider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductUtil {
    private static final String PRODUCTS_FILE =
            "pro/kensait/designpattern/lesson11/command/provider/products.csv";
    private static List<Product> productList;

    public static void init() {
        productList = new CopyOnWriteArrayList<Product>();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream(PRODUCTS_FILE);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                Product product = createProductFromLine(line);
                productList.add(product);
            }
        } catch(IOException ioe) {
            throw new RuntimeException(ioe);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch(IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }
    }

    public static List<Product> getProductList() {
        if (productList == null) {
            init();
        }
        return productList;
    }

    private static Product createProductFromLine(String line) {
        StringTokenizer st = new StringTokenizer(line, ",");
        Integer id = Integer.parseInt(st.nextToken());
        String name = st.nextToken();
        String category = st.nextToken();
        String maker = st.nextToken();
        BigDecimal price = new BigDecimal(Integer.parseInt(st.nextToken()));
        Integer deliveryTerm = Integer.parseInt(st.nextToken());
        Product product = new Product(id, name, category, maker, price, deliveryTerm);
        return product;
    }
}