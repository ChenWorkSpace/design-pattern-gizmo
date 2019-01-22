package instance;

import material_factory.Factory;
import mode.Objective;

    public class InstanceObjective extends Objective {
        Factory factory;
        public InstanceObjective(Factory factory){
            this.factory=factory;

        }

    public void prepare( ) {
        material=factory.createMaterial();
    }

}
