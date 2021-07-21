package im.knight.dp.factory.method;

import im.knight.dp.factory.Product;
import im.knight.dp.factory.ProductImplTwo;

/**
 * @description: 工厂2
 * @author: lijunlong
 * @date: 2021/7/21 14:59
 */
public class FactoryTwo implements AbsFactory {

    @Override
    public Product newProduct() {
        System.out.println("我来生成产品2");
        return new ProductImplTwo();
    }
}
