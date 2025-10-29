public class Car {



    private String marka;
    private String model;
    private int year;
    private boolean otomatica;


    public Car() {
        this.marka = "Bilinmiyor";
        this.model = "Bilinmiyor";
        this.year = 0;
        this.otomatica = false;
    }



    public Car(String marka, String model, int year, boolean otomatica) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.otomatica = otomatica;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isOtomatica() {
        return otomatica;
    }

    public void setOtomatica(boolean otomatica) {
        this.otomatica = otomatica;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public void bilgileriYazdir(){
        System.out.println("Model: " + this.model);
        System.out.println("Marka: " + this.marka);
        System.out.println("Year: " + this.year);
        System.out.println("Otomatica: " + this.otomatica);

    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", otomatica=" + otomatica +
                '}';
    }
}
