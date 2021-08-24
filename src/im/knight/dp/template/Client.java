package im.knight.dp.template;

/**
 * 它的使用场景就是，当我们知道整个流程，但是其中有一部分流程需要根据
 * 不同的业务场景有不同的实现，那这部分实现我们就可以把他定义为抽象方法
 * @description: 模板方法
 * @author: lijunlong
 * @date: 2021/8/24 10:42
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }

}
