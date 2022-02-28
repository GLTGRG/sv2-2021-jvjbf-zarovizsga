package webshop;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class ProductRepository {


    private JdbcTemplate jdbcTemplate;

    public ProductRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    long insertProduct(String productName, int price, int stock){

    }
}