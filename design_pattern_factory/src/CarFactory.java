public class CarFactory {

    public car get(String carType){
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("Marcedec")){
            return new Marcedec();

        }else if(carType.equalsIgnoreCase("BMW")){
            return new BMW();

        }
        return null;

    }
}
