package im.knight.dp.demo.factory.method;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/7/21 15:16
 */
public class Client {

    public static void main(String[] args) {
        // 牛厂
        AnimalFarm animalFarm = new CattleFarm();
        // 得到牛牛
        Animal animal = animalFarm.newAnimal();
        // 牛牛开始叫唤
        animal.show();
    }
}
