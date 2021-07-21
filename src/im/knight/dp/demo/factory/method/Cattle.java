package im.knight.dp.demo.factory.method;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 牛牛
 * @author: lijunlong
 * @date: 2021/7/21 15:15
 */
public class Cattle implements Animal {

    @Override
    public void show() {
        System.out.println("牛牛在mer");
    }
}
