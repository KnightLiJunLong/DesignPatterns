package im.knight.dp.demo.builder;

/**
 * @description: 装房子都要做的事，被抽象了
 * @author: lijunlong
 * @date: 2021/7/22 14:49
 */
public abstract class Decorator {

    protected Parlour product = new Parlour();

    public abstract void buildWall();

    public abstract void buildTv();

    public abstract void buildSofa();

    public Parlour getResult() {
        return product;
    }

}
