package mode;

import material_factory.Material;

public abstract class Objective {
    public Material material;
    public abstract  void prepare( );

    public void create(){
        System.out.printf("create...\n");
    }
    public void start(){
        System.out.printf("start...\n");
    }
    public void packing(){
        System.out.printf("packing...\n");
    }
    public void complete(){
        System.out.printf(material.getName()+" complete...\n");
    }
}
