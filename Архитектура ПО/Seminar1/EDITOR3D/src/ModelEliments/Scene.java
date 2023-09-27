package ModelEliments;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Object method1(Object Type) {
        return Type;
    }
    
    public Object method2(Object Type, Object Type2) {
        return Type2;
    }
}