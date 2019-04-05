public interface Athlete {
    void compete();
    void swim();
    void highJump();
    void longJump();
}



public class JohnDoe implements Athlete {
    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }
    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }
    @Override
    public void highJump() {
    }
    @Override
    public void longJump() {
    }
}
