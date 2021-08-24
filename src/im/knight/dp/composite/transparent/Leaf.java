package im.knight.dp.composite.transparent;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/17 9:43
 */
public class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("透明树叶" + name + "被访问！！！");
    }
}
