import java.util.ArrayList;
import java.util.List;

public class Category extends LibraryComponent {
    private String name;
    private List<LibraryComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(LibraryComponent component) {
        components.add(component);
    }

    public void removeComponent(LibraryComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (LibraryComponent component : components) {
            component.display();
        }
    }
}


