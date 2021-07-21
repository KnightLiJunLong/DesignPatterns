package im.knight.dp.demo.factory.method;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 牛牛农场，好多马儿
 * @author: lijunlong
 * @date: 2021/7/21 15:17
 */
public class CattleFarm implements AnimalFarm {

    @Override
    public Animal newAnimal() {
        return new Cattle();
    }
}
