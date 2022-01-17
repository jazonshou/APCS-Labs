//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you

public class Toy {
    private String name;
    private int cnt;

    public Toy(String name) {
        this.name = name;
        cnt = 1;
    }

    public int getCount() {
        return cnt;
    }

    public void setCount(int cnt) {
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + cnt;
    }
}