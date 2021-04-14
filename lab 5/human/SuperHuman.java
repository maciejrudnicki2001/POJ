package pjatk.human;

public class SuperHuman extends Human{

        private final String power;

        public SuperHuman(String name, int age, String power) {
            super(name, age);
            this.power = power;
        }

        @Override
        public String power(){
            return power;
        }
}
