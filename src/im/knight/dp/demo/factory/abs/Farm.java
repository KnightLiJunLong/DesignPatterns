package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;
import im.knight.dp.demo.factory.common.Plant;

/**
 * @description: 抽象农场
 * @author: lijunlong
 * @date: 2021/7/21 15:27
 */
public interface Farm {

    Animal getAnimal();

    Plant getPlant();

}
