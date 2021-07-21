package im.knight.dp.factory.easy;

import im.knight.dp.factory.Const;
import im.knight.dp.factory.Product;
import im.knight.dp.factory.ProductImplOne;
import im.knight.dp.factory.ProductImplTwo;

/**
 * @description: Product生产类
 * @author: lijunlong
 * @date: 2021/7/21 14:41
 */
public class SimpleFactory {

    public static Product makeProduct(int type) {
        switch (type) {
            case Const.PRODUCT_ONE:
                return new ProductImplOne();
            case Const.PRODUCT_TWO:
                return new ProductImplTwo();
            default:
                break;
        }
        return null;
    }
}
