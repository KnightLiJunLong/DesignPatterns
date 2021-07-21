package im.knight.dp.demo.factory.abs;

import im.knight.dp.demo.factory.common.Plant;

/**
 * @description: 蔬菜
 * @author: lijunlong
 * @date: 2021/7/21 15:38
 */
public class P_Vegetables implements Plant {

    public P_Vegetables() {
        System.out.println("有很多菜，菠菜，大白菜");
    }

    @Override
    public void show() {
        System.out.println("种菜了");
    }
}
