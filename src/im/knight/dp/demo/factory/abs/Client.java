package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;
import im.knight.dp.demo.factory.common.Plant;

/**
 * 我们的具体调用依旧可以以配置的形式来确定，如果要通过反射那就需要完整的路径，
 * 如果是我们自定义的，那见机行事
 * @description: 调用者
 * @author: lijunlong
 * @date: 2021/7/21 15:39
 */
public class Client {

    public static void main(String[] args) {
        Farm farm = new ChengDuFarm();
        Animal animal = farm.getAnimal();
        Plant plant = farm.getPlant();
        animal.show();
        plant.show();
    }
}
