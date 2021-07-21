package im.knight.dp.factory;

/**
 * @description: 工厂2 做自己的事情
 * @author: lijunlong
 * @date: 2021/7/21 14:39
 */
public class ProductImplTwo implements Product {

    @Override
    public void show() {
        System.out.println("我是product2");
    }
}
