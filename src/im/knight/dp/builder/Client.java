package im.knight.dp.builder;

/**
 * 首先我们要有一个具体创建者，这里我们有两个，一个One，一个Two
 * 他们都实现了对A,B,C的set，当然我们这里不是需要关注对ABC的set，
 * 因为这属于业务逻辑，我们应该关注在One里他对其super里需要建造的对象
 * Product进行了操作。
 * 然后我们还拥有一个指挥者，这个指挥者不需要明白他要具体指挥的产品信息，
 * 他只需指挥对应的建造者，建造者去建造产品即可。
 * 建造者的使用场景其实就是我们需要复杂对象时，就构建很多小的对象，然后把他拼在
 * 一起就成了复杂对象
 * @description: 调用者
 * @author: lijunlong
 * @date: 2021/7/22 14:05
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new BuilderOne();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
