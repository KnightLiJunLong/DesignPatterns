package im.knight.dp.composite.safe;

import java.util.ArrayList;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/17 9:47
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
