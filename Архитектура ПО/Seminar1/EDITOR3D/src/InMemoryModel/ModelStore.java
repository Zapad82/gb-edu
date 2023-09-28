package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonalModel;
import ModelEliments.Scene;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<iModelChangeObserver> ChangeObservers;

/**
 * конструктор
 *
 * @param texture
 * @throws Exception
 */
    public ModelStore(List<iModelChangeObserver> changedObservers) throws Exception {
        this.ChangeObservers = changedObservers;

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

    Models.add(new PoligonalModel(null, null));
    Flashes.add(new Flash(null, null, null, null));
    Cameras.add(new Camera(null, null));
    Scenes.add(new Scene(0,Models,Flashes));  
}

/**
 * Возвращает scena по ID
 *
 * @param ID
 * @return
 */
    public Scene GetScena(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == ID) {
                return Scenes.get(i);
            }

        }
        return null;
    }

/**
 * Регистрация изменений
 * @param sender
 */
    @Override
    public void NotifyChange(iModelChanger sender) {

    }
}
