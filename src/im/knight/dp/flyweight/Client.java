package im.knight.dp.flyweight;

/**
 * 这模式其实很简单，就是将我们的一些共有的信息进行了封装。
 * 重点关注 Flyweight和它的实现类
 * 这里我还一起使用了抽象工厂，本来我们可以用一个简单工厂来做，
 * 但是如果我们需要在map中没有数据时创建数据，这样如果我们的具体享元角色太多，
 * 那么就需要做很多的判断
 * @description: 享元模式
 * @author: lijunlong
 * @date: 2021/8/17 8:54
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactoryOne();
        FlyweightFactory flyweightFactory2 = new FlyweightFactoryTwo();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight3 = flyweightFactory2.getFlyweight("b");
        Flyweight flyweight4 = flyweightFactory2.getFlyweight("b");
        Flyweight flyweight5 = flyweightFactory.getFlyweight("c");
        Flyweight flyweight6 = flyweightFactory.getFlyweight("c");
        flyweight1.operation(new UnsharedConcreteFlyweight("这是1"));
        flyweight2.operation(new UnsharedConcreteFlyweight("这是2"));
        flyweight3.operation(new UnsharedConcreteFlyweight("这是3"));
        flyweight4.operation(new UnsharedConcreteFlyweight("这是4"));
        flyweight5.operation(new UnsharedConcreteFlyweight("这是5"));
        flyweight6.operation(new UnsharedConcreteFlyweight("这是6"));
    }

}
