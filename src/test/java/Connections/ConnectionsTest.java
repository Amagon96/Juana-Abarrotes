package Connections;

import connections.ConnectionDao;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionsTest {
    @Test
    public void conecctionSingletonTest(){
        try{
            ConnectionDao connectionDao = ConnectionDao.getInstance();
            Assert.assertFalse(connectionDao.getConnection().isClosed());
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getAnonymousLogger().warning("La conexión no es valida.");
        }
    }
}
