package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    //une implémentation de l'interface IDao
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
