package yulkind;

public class Kotik {
    public int fullness;
    public boolean eat() {
        return eat(4, "Buckwheat");
    }
    public boolean eat(int amount) {
        fullness +=amount;
        return true;
    }
    public boolean eat(int amount, String name) {
        eat(amount);
        System.out.println("I've eaten " + name);
        return true;
    }
    public boolean play() {
        if(fullness <=0) {
            System.out.println("I'm hungry");
            return false;
        }
        else {
            System.out.println("I've played");
            return true;
        }
    }
    public boolean sleep() {
        if(fullness <= 0) {
            System.out.println("I'm hungry");
            return false;
        }
        else {
            System.out.println("I've slept");
            return true;
        }
    }
    public boolean chaseMouse() {
        if(fullness <= 0) {
            System.out.println("I'm hungry");
            return false;
        }
        else {
            System.out.println("I've caught a mouse");
            return true;
        }
    }
    public boolean run() {
        if (fullness <= 0) {
            System.out.println("I'm hungry");
            return false;
        } else {
            System.out.println("I've run");
            return true;
        }
    }
        public boolean jump() {
            if(fullness <= 0) {
                System.out.println("I'm hungry");
                return false;
            }
        else {
                    System.out.println("I've jumped");
                    return true;
                }
            }
            public void liveAnotherDay() {
                for(int i = 0; i < 24; i++) {
                    int action = (int)(Math.random()*5 + 1);
                    switch(action){
                        case 0:
                            if (play() == false) {
                                eat();
                            }
                            break;
                        case 1:
                            if (!sleep()) {
                                eat();
                            }
                            break;
                        case 2:
                            if (chaseMouse() == false) {
                                eat();
                            }
                            break;
                        case 3:
                            if (run () == false) {
                                eat();
                            }
                            break;
                        case 4:
                            if (run () == false) {
                                eat();
                            }
                            break;
                        case 5:
                            if (run () == false) {
                                eat();
                            }
                            break;
                    }

                }
                fullness--;
            }
        }
