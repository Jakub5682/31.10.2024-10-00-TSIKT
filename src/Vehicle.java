public interface Vehicle {
    public void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving car");
        // your code    }}
        class Bike implements Vehicle {
            @Override
            public void drive() {
                System.out.println("Driving bike");
            }
        }
    }
}