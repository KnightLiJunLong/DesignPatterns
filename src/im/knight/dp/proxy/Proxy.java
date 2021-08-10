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

    public void postSubject() {
        System.out.println("访问真实主题之后做的事情");
    }

    public void preSubject() {
        System.out.println("访问真实主题之前做的事情");
    }
}
