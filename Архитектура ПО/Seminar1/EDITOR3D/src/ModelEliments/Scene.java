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

    public <T> T method1(T flash) {
        return flash;
        }
        
    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}