package im.knight.dp.factory;

import im.knight.dp.factory.Product;

/**
 * @description: 工厂1  做自己的事情
 * @author: lijunlong
 * @date: 2021/7/21 14:39
 */
public class ProductImplOne implements Product {

    @Override
    public void show() {
        System.out.println("我是product1");
    }
}
