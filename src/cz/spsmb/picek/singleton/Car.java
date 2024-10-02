package cz.spsmb.picek.singleton;

public class Car{
    private String engine;
    private String color;
    private String wheels;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.color = builder.color;
        this.wheels = builder.wheels;
    }


    public String getDetails() {
        return "Motor = "+ engine + ", Barva = " + color + ", Kola = "+ wheels;
    }

    public static class CarBuilder{
        private String engine;
        private String color;
        private String wheels;

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
