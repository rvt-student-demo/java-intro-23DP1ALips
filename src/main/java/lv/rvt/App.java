package lv.rvt; 

public class App { 
    public static void main(String[] args) {
        // example main program for the first section of the exercise

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 7, 110);
        Person peter = new Person("Peter", 33, 85, 176);

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    }
}