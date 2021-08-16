package im.knight.dp.bridge;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/12 10:10
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体化角色A");
    }
}
