/**
 * Created by shiliang on 2017/8/24.
 */
public class Event {
    Person source;

    /**
     * @return the source
     */
    public Person getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(Person source) {
        this.source = source;
    }

    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Event(Person source) {
        super();
        this.source = source;
    }
}
