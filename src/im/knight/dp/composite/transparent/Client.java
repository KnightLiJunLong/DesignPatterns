package im.knight.dp.composite.transparent;

/**
 * @description: 透明组合模式
 * @author: lijunlong
 * @date: 2021/8/17 9:41
 */
public class Client {

    public static void main(String[] args) {
        Component c1 = new Composite();
        Component c2 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c1.add(leaf1);
        c1.add(c2);
        c2.add(leaf2);
        c2.add(leaf3);
        c1.operation();
    }
}
