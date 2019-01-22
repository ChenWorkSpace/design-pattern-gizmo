package mode;

import material_factory.Factory;

public abstract class Creator {
    public abstract Objective create(Factory factory);
    public Objective order(Factory factory){
        String process="processing flow";
        Objective object=create(factory);
        object.prepare();
        object.create();
        object.start();
        object.packing();
        object.complete();
        return object;
    }
}
