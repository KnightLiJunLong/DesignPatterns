package im.knight.dp.builder;

/**
 * @description: 指挥者
 * @author: lijunlong
 * @date: 2021/7/22 14:05
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
