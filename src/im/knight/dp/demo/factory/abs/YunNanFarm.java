package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;
import im.knight.dp.demo.factory.common.Plant;

/**
 * @description: 云南农场
 * @author: lijunlong
 * @date: 2021/7/21 15:31
 */
public class YunNanFarm implements Farm {

    @Override
    public Animal getAnimal() {
        return new A_Horse();
    }

    @Override
    public Plant getPlant() {
        return new P_Vegetables();
    }
}
