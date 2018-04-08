package factories.implementations;

import connections.ConnectionDao;
import factories.interfaces.ProductDAO;
import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PostgreSQL implements ProductDAO {

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> moreThan(Integer criteria) {
        products = new ArrayList<>();
        try {
            ConnectionDao connectionDao = ConnectionDao.getInstance();
            Statement st = connectionDao.getConnection().createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %d",Product.Q_MORE_THAN, criteria));
            while(rs.next()){
                products.add(makeProduct(rs));
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return products;
    }

    @Override
    public List<Product> lessThan(Integer criteria) {
        products = new ArrayList<>();
        try {
            ConnectionDao connectionDao = ConnectionDao.getInstance();
            Statement st = connectionDao.getConnection().createStatement();
            ResultSet rs = st.executeQuery(String.format("%s %d",Product.Q_EX_LESS_THAN, criteria));
            while(rs.next()){
                products.add(makeProduct(rs));
            }
        }catch (ClassNotFoundException | SQLException ex){

        }
        return products;
    }

    @Override
    public List<Product> sameClassMorePrice(String criteria1, Double criteria2) {
        products = new ArrayList<>();
        try {
            ConnectionDao connectionDao = ConnectionDao.getInstance();
            Statement st = connectionDao.getConnection().createStatement();
            ResultSet rs =  st.executeQuery(String.format("%s '%s' AND %s %f ",Product.Q_SAME_CLASS,criteria1,Product.S_PRICE_MORE_THAN, criteria2));
            while(rs.next()){
                products.add(makeProduct(rs));
            }
        }
        catch (ClassNotFoundException | SQLException ex){

        }
        return products;
    }

    @Override
    public List<Product> priceBetween(String field, Double criteria1, Double criteria2) {
        products = new ArrayList<>();
        try {
            ConnectionDao connectionDao = ConnectionDao.getInstance();
            Statement st = connectionDao.getConnection().createStatement();
            ResultSet rs =  st.executeQuery(String.format("%s WHERE %s BETWEEN %f AND %f ",Product.Q_ALL,field,criteria1, criteria2));
            while(rs.next()){
                products.add(makeProduct(rs));
            }
        }
        catch (ClassNotFoundException | SQLException ex){

        }
        return products;
    }

    private Product makeProduct(ResultSet rs) throws SQLException {
        Product product = new Product();
        Integer i = 1;
        product.setClave(rs.getLong(i++));
        product.setDescripcion(rs.getString(i++));
        product.setPrecio(rs.getDouble(i++));
        product.setClasificacion(rs.getString(i++));
        product.setExistencia(rs.getInt(i++));
        product.setExistencia_min(rs.getInt(i++));
        product.setExistencia_max(rs.getInt(i++));
        return product;
    }
}
