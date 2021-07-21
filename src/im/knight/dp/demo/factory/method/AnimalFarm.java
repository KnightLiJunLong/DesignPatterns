package im.knight.dp.demo.factory.method;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 动物农场抽象工厂
 * @author: lijunlong
 * @date: 2021/7/21 15:11
 */
public interface AnimalFarm {
    Animal newAnimal();
}
