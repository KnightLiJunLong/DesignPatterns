package im.knight.dp.demo.builder;

/**
 * @description: 我老婆，啥也不管就只会说，你要做这个，你要做那个
 * @author: lijunlong
 * @date: 2021/7/22 14:49
 */
public class Manager {

    private final Decorator builder;

    public Manager(Decorator builder) {
        this.builder = builder;
    }

    public Parlour decorate(){
        builder.buildWall();
        builder.buildTv();
        builder.buildSofa();
        return builder.getResult();
    }
}
