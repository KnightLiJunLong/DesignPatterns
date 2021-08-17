package im.knight.dp.flyweight;

/**
 * @description: 具体享元角色
 * @author: lijunlong
 * @date: 2021/8/17 8:56
 */
public class ConcreteFlyweightTwo implements Flyweight {

    private final String key;

    private final String outStrCommon = "具体享元2";

    public ConcreteFlyweightTwo(String key) {
        this.key = key;
        System.out.println(outStrCommon + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println(outStrCommon + key + "被调用");
        System.out.println("非享元信息是：" + state.getInfo());
    }
}
