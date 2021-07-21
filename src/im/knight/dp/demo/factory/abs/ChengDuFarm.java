package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;
import im.knight.dp.demo.factory.common.Plant;
import im.knight.dp.demo.factory.method.Cattle;

/**
 * @description: 成都农场
 * @author: lijunlong
 * @date: 2021/7/21 15:30
 */
public class ChengDuFarm implements Farm{

    @Override
    public Animal getAnimal() {
        return new A_Cattle();
    }

    @Override
    public Plant getPlant() {
        return new P_Fruitage();
    }
}
