package animal;

public class Human extends Animal implements Thinkable{
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Human() {
    }

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");

    }


}
