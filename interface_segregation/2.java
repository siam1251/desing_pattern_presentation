 interface Athlete {
    void compete();
}

interface JumpingAthlete extends Athlete {
    void highJump();
    void longJump();
}

interface Athlete {
    void compete();
}

interface SwimmingAthlete extends Athlete {
    void swim();
}


class JohnDoe implements SwimmingAthlete {
    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }
    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }
}

