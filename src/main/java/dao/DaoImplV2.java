package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Services");
        double data = 35;
        return data;
    }
}


