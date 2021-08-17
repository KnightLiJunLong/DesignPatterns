package im.knight.dp.flyweight;

import java.util.Objects;

/**
 * @description: 具体工厂享元角色
 * @author: lijunlong
 * @date: 2021/8/17 9:07
 */
public class FlyweightFactoryOne implements FlyweightFactory {

    @Override
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (Objects.nonNull(flyweight)) {
            System.out.println("具体享元1" + key + "已成功被获取");
        } else {
            flyweight = new ConcreteFlyweightOne(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
