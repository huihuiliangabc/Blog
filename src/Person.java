/**
 * Created by shiliang on 2017/8/24.
 */
public class Person {
    private String name;
    PersonListener listen;   //提供一个监听器，用于监听person的eat和run方法

    Person(String name){
        super();    // 调用父类构造函数
        this.name = name;
    }

    public void run(){         //这个方法是数据源自己的方法，随便什么名字，但是就是在main调用了这个方法触发了监听
        //有监听器注册，则触发监听器的dorun方法
        if(listen!=null){
            System.out.println("Person"+ this.getName() + "在跑步!");
            listen.dorun(this);  //这个this代表Person类实体，不可用Person类替代
        }
    }

    public void eat(){
        //有监听器注册，则触发监听器的doeat方法
        if(listen!=null){
            System.out.println("Person"+ this.getName() + "在吃饭!");
            listen.doeat(new Event(this));
        }
    }

    //注册一个监听器
    public void register(PersonListener listen){
        this.listen = listen;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
