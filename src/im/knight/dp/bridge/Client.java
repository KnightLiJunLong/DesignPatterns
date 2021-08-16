package im.knight.dp.bridge;

/**
 * 这个模式看起来会复杂很多，
 * 我们可以假想一下假设我们在购物平台购物
 * 我们选购产品的时候会有多重维度，
 * 比如我们买衣服，可以从款式短袖，长袖
 * 也可以从大小L,XL来选，
 * 这时候我们需要买
 * 短袖XL的
 * 那么我们的桥接模式就可以使用了
 * 首先我们有一个具体实现 A它继承于Size类 表示是XL
 * 然后有一个扩展类 Tx表示T恤它继承于Clothing。
 * 所以他的使用场景就是某类东西，他在业务中存在多种维度
 * 的情况需要组合，这时候可以考虑。
 * @description: 桥接模式
 * @author: lijunlong
 * @date: 2021/8/12 10:06
 */
public class Client {

    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(imp);
        abstraction.operation();
    }

}
