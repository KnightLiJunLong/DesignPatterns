package im.knight.dp.demo.builder;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/7/22 14:57
 */
public class Client {

    public static void main(String[] args) {
        // 首先我要自己知道我有房子要做事了，但是我要怎么做，还要看老婆指挥
        Decorator decorator = new DecoratorOne();
        // 然后我老婆就要开始逼逼赖赖,房子还是他说了算，房子给他了
        Manager manager = new Manager(decorator);
        // 开始发话了，我去忙了
        Parlour parlour = manager.decorate();
        // 弄好了，拿来把你
        parlour.show();
    }
}
