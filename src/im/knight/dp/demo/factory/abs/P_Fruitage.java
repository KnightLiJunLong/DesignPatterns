package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Plant;

/**
 * @description: 水果
 * @author: lijunlong
 * @date: 2021/7/21 15:36
 */
public class P_Fruitage implements Plant {

    public P_Fruitage() {
        System.out.println("我有好多水果，葡萄，梨子，桃子，可好吃了！！！！！！！！！");
    }

    @Override
    public void show() {
        System.out.println("种水果了！！");
    }
}
