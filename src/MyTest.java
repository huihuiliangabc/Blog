/**
 * Created by shiliang on 2017/8/24.
 */

public class MyTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p1 = new Person("张三");
        //向p1注册一个监听器
        p1.register(new SubPersonListener()); //源码中这里是直接写接口的实现过程也是可以的，本人把SubPersonListener单独出一个类

        /*
        *这里有个很有趣现象,比较    p1.run()和p1.eat()实现方式（p1.run()是我自己改装的），发现Event这个事件对象并没有太大用，因为查看其实现发现除了
        * set和get及构造方法根本没有特别之处，而这些东西Person本身就有，为何还增加一层包装呢？对比我本人改装后实现发现它的确没用
        * 本人改装SubPersonListener方法public void dorun(Person e)，传入参数就是person本身
        */

        p1.run();
        p1.eat();
    }
}
