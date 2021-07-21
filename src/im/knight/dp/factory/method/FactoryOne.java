package im.knight.dp.factory.method;

import im.knight.dp.factory.Product;
import im.knight.dp.factory.ProductImplOne;

/**
 * @description: 工厂1
 * @author: lijunlong
 * @date: 2021/7/21 14:58
 */
public class FactoryOne implements AbsFactory {

    @Override
    public Product newProduct() {
        System.out.println("我来生成产品1");
        return new ProductImplOne();
    }
}
