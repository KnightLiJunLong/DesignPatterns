package im.knight.dp.composite.transparent;

import java.util.ArrayList;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/17 9:47
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
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
