package im.knight.dp.demo.builder;

/**
 * @description: 我是房子的主人，我自己做这些事
 * @author: lijunlong
 * @date: 2021/7/22 14:52
 */
public class DecoratorOne extends Decorator {

    @Override
    public void buildWall() {
        System.out.println("砌墙，呼呼呼~~~~~");
        product.setWall("大白墙");
    }

    @Override
    public void buildTv() {
        System.out.println("买电视...");
        product.setTv("买好了，小米的");
    }

    @Override
    public void buildSofa() {
        System.out.println("买沙发");
        product.setSofa("布沙发，拿来吧你");
    }
}
