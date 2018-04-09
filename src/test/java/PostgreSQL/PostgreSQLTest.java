package PostgreSQL;

import factories.implementations.PostgreSQL;
import factories.interfaces.ProductDAO;
import models.Product;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class PostgreSQLTest {
    @Test
    public void create(){
        ProductDAO productDAO = new PostgreSQL();
        Product product = new Product();
        product.setDescripcion("Atun en agua");
        product.setPrecio((Math.random() * 35));
        product.setClasificacion("Abarrotes y Enlatados");
        product.setExistencia((int) (Math.random() * 60));
        product.setExistencia_min((int) (Math.random() * 25) +5);
        product.setExistencia_max((int) (Math.random() * 90) +25);

        productDAO.create(product);
    }

    @Test
    public void existenciaMoreThanTest(){
        ProductDAO productDao = new PostgreSQL();
        List<Product> products = productDao.moreThan(20);
        Assert.assertNotNull(products);
        for (Product product : products){
            System.out.println(product);
            Assert.assertNotNull(product);
            System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        }

    }

    @Test
    public void existenciaLessThanTest(){
        ProductDAO productDao = new PostgreSQL();
        List<Product> products = productDao.lessThan(15);
        Assert.assertNotNull(products);
        for (Product product : products){
            System.out.println(product);
            Assert.assertNotNull(product);
            System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        }
    }

    @Test
    public void sameClassMorePriceTest(){
        ProductDAO productDao = new PostgreSQL();
        List<Product> products = productDao.sameClassMorePrice("Refresco",15.50);
        Assert.assertNotNull(products);
        for (Product product : products){
            System.out.println(product);
            Assert.assertNotNull(product);
            System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        }
    }

    @Test
    public void betweenTest(){
        ProductDAO productDao = new PostgreSQL();
        List<Product> products = productDao.priceBetween("clave",30d, 40d);
        Assert.assertNotNull(products);
        for (Product product : products){
            System.out.println(product);
            Assert.assertNotNull(product);
            System.out.println("--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--<<O>>--");
        }
    }
}
