package im.knight.dp.builder;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/7/22 14:07
 */
public class BuilderOne  extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("O建造A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("O建造B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("O建造C");
    }
}
