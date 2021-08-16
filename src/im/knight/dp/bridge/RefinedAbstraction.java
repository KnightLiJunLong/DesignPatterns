package im.knight.dp.bridge;

/**
 * @description: 扩展抽象化角色
 * @author: lijunlong
 * @date: 2021/8/12 14:31
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色");
        implementor.operationImpl();
    }
}
