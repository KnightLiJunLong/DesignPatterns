package im.knight.dp.builder;

/**
 * 该抽象表示我们需要建造什么东西，具体建造不是他本身
 * @description: 抽象建造者
 * @author: lijunlong
 * @date: 2021/7/22 14:06
 */
public abstract class Builder {

    // 创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    // 返回产品对象
    public Product getResult(){
        return product;
    }
}
