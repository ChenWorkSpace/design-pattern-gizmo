package material_factory;

public class InstanceFactory implements Factory {
    public Material createMaterial() {
        return new Material("chess", (float) 12.5,130);
    }
}
