package im.knight.dp.bridge;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 10:11
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体的实现化角色B");
    }
}
