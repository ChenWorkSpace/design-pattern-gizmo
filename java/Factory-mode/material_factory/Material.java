package material_factory;

public class Material {
    String name;
    float cost;
    int num;

    public Material(String name, float cost, int num) {
        this.name = name;
        this.cost = cost;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
