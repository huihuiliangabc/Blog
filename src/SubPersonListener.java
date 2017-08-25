/**
 * Created by shiliang on 2017/8/24.
 */
public class SubPersonListener  implements PersonListener  {
    @Override
    public void dorun(Person e) {
        // TODO Auto-generated method stub

        //Person p = (Person)e.getSource();
        System.out.println(e.getName()+"在跑步时伤了膝盖啦!!!");
    }

    @Override
    public void doeat(Event e) {
        // TODO Auto-generated method stub

        Person p = (Person)e.getSource();
        System.out.println(p.getName()+"在吃饭时呛到啦!!!");
    }
}
