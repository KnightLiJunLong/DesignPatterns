package im.knight.dp.factory.method;

import im.knight.dp.factory.Product;

/**
 * 这里new FactoryOne 在实际应用中，可以变成可以配置的文件，
 * 比如配置成我们的类完整路径，然后我们可以根据反射来获取对象,
 * 它和简单工厂比，其实看起来就是多了一个抽象工厂，把一个工厂干的事情
 * 分给了各自的工厂来做，自己的工厂生产自己的产品。
 * 缺点就是：
 * 类比简单工厂还多
 * 抽象产品只能生产一种产品
 *
 * @description: 工厂方法
 * @author: lijunlong
 * @date: 2021/7/21 15:00
 */
public class Client {

    public static void main(String[] args)
        throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AbsFactory af = (AbsFactory) getObj();
        Product product = af.newProduct();
        product.show();
    }

    private static Object getObj() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 假设这是配置文件,要是完整的路径
        String clazzName = "im.knight.dp.factory.method.FactoryOne";
        Class<?> clazz = Class.forName(clazzName);
        return clazz.newInstance();
    }
}
