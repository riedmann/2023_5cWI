package at.ran.oo.java;

public class Car {
    private int serial;
    private String color;

    public Car(int serial, String color){
        this.serial = serial;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSerial() {
        return serial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this.serial== ((Car)obj).getSerial()){
            return true;
        }
        else{
            return false;
            
        }
    }
}
