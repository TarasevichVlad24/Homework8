package Phone;

public class Phone {
    String number;
    String model;
    int weight;

    Phone(String number, String model, int weight){
        this(number,model);
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model= model;
    }
    Phone(){

    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number){
        System.out.println("Входящий (" + name + ") номер (" + number +") ");
    }

    public void sendMassage(String... numbers){
        StringBuilder phoneNumbers = new StringBuilder();
        for(String number: numbers){
            phoneNumbers.append(number + " ,");
        }
        System.out.print("Сообщения отправлены следующим номерам:" +phoneNumbers);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args){
        Phone phone1 = new Phone ("+375295159148","HONOR", 100);
        Phone phone2 = new Phone("+375291139812","Apple", 150);
        Phone phone3 = new Phone("+375295827464", "Huawei", 200);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Мама", "+375295827464");
        phone2.receiveCall("Папа", "+375295827463");
        phone3.receiveCall("Брат", "+375336882037");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.sendMassage("7788", "7575", "7474");
    }


}
