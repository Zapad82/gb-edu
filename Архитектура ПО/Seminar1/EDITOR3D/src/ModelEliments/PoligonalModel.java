package ModelEliments;

import java.util.List;

public class PoligonalModel {
    public List <Poligon> poligons;
    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
    public List <Texture> textures;
}
