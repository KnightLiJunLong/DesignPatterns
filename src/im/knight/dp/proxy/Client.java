package im.knight.dp.proxy;

/**
 * 代理模式很简单，就是在调用的中间增加了一层proxy 其实可以直接调用realSubject效果其实也是一样的，
 * 只不过需要在其中间增加之前和之后的操作，如果说这个操作 是一致的，我们就可以使用这种代理。就像我们的Spring Aop
 * 就是使用的动态代理，往往我们使用AOP也就是用它来切入其中 来做一些事情
 *
 * @description:
 * @author: lijunlong
 * @date: 2021/8/10 14:13
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }

}
