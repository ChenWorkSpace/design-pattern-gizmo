package instance;

import material_factory.InstanceFactory;
import mode.Objective;

public class Factorytest {
    public static void main(String[] args) {
        Objective objective=new InstanceCreator().order(new InstanceFactory());
    }
}
