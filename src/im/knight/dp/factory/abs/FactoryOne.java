package im.knight.dp.factory.abs;

import im.knight.dp.factory.ProductImplOne;
import im.knight.dp.factory.ProductImplTwo;

/**
 * @description: 工厂1
 * @author: lijunlong
 * @date: 2021/7/21 15:24
 */
public class FactoryOne implements AbsFactory {

    @Override
    public ProductImplOne getProductOne() {
        return new ProductImplOne();
    }

    @Override
    public ProductImplTwo getProductTwo() {
        return  new ProductImplTwo();
    }
}
