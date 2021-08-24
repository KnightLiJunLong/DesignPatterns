package im.knight.dp.composite.transparent;

/**
 * @description: 在抽象构建中声明了子类要做的操作
 * @author: lijunlong
 * @date: 2021/8/17 9:42
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();

}
