package im.knight.dp.proxy;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/10 14:15
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preSubject();
        realSubject.request();
        postSubject();
    }

    /**
     * 核心是下面这两个方法，也是代理的目的，就是为了在执行真实主题的时候，在其之前或之后做更多的事情
     */
    public void postSubject() {
        System.out.println("访问真实主题之后做的事情");
    }

    public void preSubject() {
        System.out.println("访问真实主题之前做的事情");
    }
}
