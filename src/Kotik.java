public class Kotik {
    public int fullness;
    public boolean eat() {
        fullness +=1;
        System.out.print("I've eaten");
        return True;
    }
    public boolean play() {
        if(fullness <=0) {
            System.out.print("I'm hungry");
            return False;
        }
        else {
            System.out.print("I've played");
            return True;
        }
    }
    public boolean sleep() {
        if(fullness <= 0) {
            System.out.print("I'm hungry");
            return False;
        }
        else {
            System.out.print("I've slept");
            return True;
        }
    }
    public boolean chaseMouse() {
        if(fullness <= 0) {
            System.out.print("I'm hungry");
            return False;
        }
        else {
            System.out.print("I've caught a mouse");
            return True;
        }
    }
    public boolean run() {
        if(fullness <= 0) {
            System.out.print("I'm hungry");
            return False;
        }
        else {
            System.out.print("I've run");
            return True;
        }
        public boolean jump() {
            if(fullness <= 0) {
                System.out.print("I'm hungry");
                return False;
        else {
                    System.out.print("I've jumped");
                    return True;
                }
            }
            public void liveAnotherDay() {
                for(int i = 0; i < 24; i++) {
                    int action = Math.random()*5 + 1;
                    switch(action){
                        case 0:
                            if (play() == False) {
                                eat();
                            }
                            break;
                        case 1:
                            if (sleep() == False) {
                                eat();
                            }
                            break;
                        case 2:
                            if (chaseMouse() == False) {
                                eat();
                            }
                            break;
                        case 3:
                            if (run () == False) {
                                eat();
                            }
                            break;
                        case 4:
                            if (run () == False) {
                                eat();
                            }
                            break;
                        case 5:
                            if (run () == False) {
                                eat();
                            }
                            break;
                    }
                }
            }
        }
}