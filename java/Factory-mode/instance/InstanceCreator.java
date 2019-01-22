package instance;

import material_factory.Factory;
import mode.Creator;
import mode.Objective;

public class InstanceCreator extends Creator {
    public Objective create(Factory factory) {
        return new InstanceObjective(factory);
    }
}
