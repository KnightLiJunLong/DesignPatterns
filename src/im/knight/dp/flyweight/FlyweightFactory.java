package im.knight.dp.flyweight;

import java.util.HashMap;

/**
 * @description: 抽象享元工厂
 * @author: lijunlong
 * @date: 2021/8/17 8:58
 */
public interface FlyweightFactory {

    HashMap<String, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(String key);

}
