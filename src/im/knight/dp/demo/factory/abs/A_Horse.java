package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Animal;

/**
 * @description: 马儿
 * @author: lijunlong
 * @date: 2021/7/21 15:32
 */
public class A_Horse implements Animal {

    public A_Horse() {
        System.out.println("你调我，我就给你个大马儿");
    }

    @Override
    public void show() {
        System.out.println("马儿乖乖，跑得快");
    }
}
