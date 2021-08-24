package im.knight.dp.composite.safe;

/**
 * @description: 叶子节点，最小粒度
 * @author: lijunlong
 * @date: 2021/8/17 9:43
 */
public class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("透明树叶" + name + "被访问！！！");
    }
}
