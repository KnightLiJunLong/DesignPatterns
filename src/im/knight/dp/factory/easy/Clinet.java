package im.knight.dp.factory.easy;

import im.knight.dp.factory.Const;
import im.knight.dp.factory.Product;

/**
 * 简单工厂，最不好的地方就是：
 * 每增加一个工厂就要多一个类，以后会有很多，而且我们的工厂生成器会有很多case。
 * 所以简单工厂用途就是很少的产品种类
 * @description: 简单工厂
 * @author: lijunlong
 * @date: 2021/7/21 14:37
 */
public class Clinet {

    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(Const.PRODUCT_ONE);
        product.show();
    }

}
