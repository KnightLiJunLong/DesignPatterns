package im.knight.dp.flyweight;

/**
 * @description: 抽象享元角色
 * @author: lijunlong
 * @date: 2021/8/17 8:55
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight state);

}
