package learn.spring.ci;

/**
 * @author chellapandi.n
 */
public class Employee {

    private int id;

    private String name;

    public Employee(String name) {
        super();
        this.name = name;
    }

    /**
     * 
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(int id) {
        super();
        this.id = id;
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    void show() {
        System.out.println(id + " " + name);
    }

}
