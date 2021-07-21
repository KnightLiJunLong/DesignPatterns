# DesignPatterns
自学设计模式

设计原则 | 一句话归纳 | 目的
---|---|---
开闭原则 | 对扩展开放，对修改关闭 |降低维护带来的新风险
依赖倒置原则 | 高层不应该依赖低层，要面向接口编程 |更利于代码结构的升级扩展
单一职责原则|一个类只干一件事，实现类要单一|便于理解，提高代码的可读性
接口隔离原则|一个接口只干一件事，接口要精简单一|功能解耦，高聚合、低耦合
迪米特法则|不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度|只和朋友交流，不和陌生人说话，减少代码臃肿
里氏替换原则|不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义|防止继承泛滥
合成复用原则|尽量使用组合或者聚合关系实现代码复用，少使用继承|降低代码耦合
	
### 创建型模式
1. 单例模式：某个类只有一个实例
2. 原型模式：将一个对象作为原型，进行复制而克隆
3. 工厂方法(类创建型)：定义一个创建产品的接口
4. 抽象工厂：定义一个创建产品族的接口
5. 建造者：将一个复杂对象分解为多个相对简单的部分。

#### 单列模式
##### 特点：
- 只有一个实例
- 类自行创建
- 对外提供一个全局的访问点

##### 优点：
- 一个实例，内存开销小
- 避免资源的多重占用
- 全局访问点，可优化和共享资源的访问

##### 缺点
- 没有接口，扩展困难，违背开闭原则
- 在并发过程中，不利于调试

##### 应用场景
1. 频繁创建，频繁销毁，如线程池
2. 只需要创建一个对象的时
3. 创建实例时，耗时长，占用多，经常使用
4. 频繁访问数据库
5. 对象需要被共享

###### UML

###### 实现
1. 懒汉
``` java
public class LazySingleton{
    private static volatile LazySigleton instance = null;
    
    private LazySingleton(){
    }
    
    // 同步方法
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LaySingleton();
        }
        return instance;
    }
    
    // 同步块
    public static synchronized LazySingleton getInstance2(){
        synchronized(LazySingleton.class){
            if(instance == null){
                instance = new LaySingleton();
            }
        }
        return instance;
    }
    
    // 内部类
    private static class Holder{
        private static LazySingleton instance1 = new LazySingleton();
    }
    
    public static LazySingleton getInstance3(){
        return Holder.instance1;
    }
    
    // 双重检测
    public static LazySingleton getInstance4(){
        if(instance == null){
            synchronized(LazySingleton.class){
                if(instance == null){
                    instance == new LazySingleton();
                }
            }
        }
    }
}
```
2.饿汉
```java
public class HungrySingleton{
    private static final HungrySingleton instance = new HungrySingleton();
    
    private HungrySingleton(){
    }
    
    public static HungrySingleton getInstance(){
        return instance;
    }
}
```

#### 原型模式
    实现Cloneable接口，编写clone()方法。
```java
public class SunWukong implements Cloneable{
    // 省略代码...
    public Object clone() throws CloneNotSupportedException {
        //do-something...
        return (SunWukong) super.clone();
    }
}
```





