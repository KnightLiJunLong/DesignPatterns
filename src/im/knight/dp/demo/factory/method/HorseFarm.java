package im.knight.dp.demo.factory.method;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 马厂
 * @author: lijunlong
 * @date: 2021/7/21 15:13
 */
public class HorseFarm implements AnimalFarm {

    @Override
    public Animal newAnimal() {
        return new Horse();
    }
}
