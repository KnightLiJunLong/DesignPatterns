package im.knight.dp.bridge;

/**
 * @description: 抽象化的角色
 * @author: lijunlong
 * @date: 2021/8/12 10:07
 */
public abstract class Abstraction {

    public Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void  operation();

}
