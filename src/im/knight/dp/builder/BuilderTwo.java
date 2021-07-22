package im.knight.dp.builder;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/7/22 14:07
 */
public class BuilderTwo extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("T建造A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("T建造B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("T建造C");
    }
}
