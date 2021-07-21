package im.knight.dp.factory.abs;

import im.knight.dp.factory.ProductImplOne;
import im.knight.dp.factory.ProductImplTwo;

/**
 * 它最大的优势在于，如果我们需要增加一个产品族，也就是我们的FactoryThree这种，
 * 我们不需要修改代码，只需要新加一个代码即可，满足开闭原则。
 * 但是如果我们要增加一个产品，也就是要在AbsFactory中添加一个方法，
 * 那所有工厂都要增加
 * @description: 抽象工厂
 * @author: lijunlong
 * @date: 2021/7/21 15:22
 */
public interface AbsFactory {
    ProductImplOne getProductOne();

    ProductImplTwo getProductTwo();

}
