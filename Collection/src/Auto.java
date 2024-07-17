public class Auto implements Print {
    final int wheels = 4;
    String colour;
    String model;
    Auto (String colour, String model) {
        this.colour = colour;
        this.model = model;
    }
    @Override
    public void print() {
        System.out.println("Wheels: "+wheels);
        System.out.println("Colour: "+colour);
        System.out.println("Model: "+model);
    }
}
