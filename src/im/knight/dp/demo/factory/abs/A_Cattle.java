package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 牛牛
 * @author: lijunlong
 * @date: 2021/7/21 15:34
 */
public class A_Cattle implements Animal {

    public A_Cattle() {
        System.out.println("你调我，我就给你个能耕地的牛牛！！！");
    }

    @Override
    public void show() {
        System.out.println("牛牛在喝水");
    }
}
