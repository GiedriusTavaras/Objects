/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektai;

/**
 *
 * @author tavar
 */
public class Termosas extends Puodukas {

    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Termosas() {
        super(500, 'm', 'p');
        temp = 20;
    }

    public void pasildyk(int kiek) {
        this.temp += kiek;
    }

    public void atvesink(int kiek) {
        this.temp -= kiek;
    }

    public void ipilk(int kiek) {
//        if (kiek + this.getTurinys() > this.getTalpa()) {
//            this.turinys = this.getTalpa();
//        } else {
//            this.turinys += kiek;
//        }
        super.ipilk(kiek);
        if (this.temp > 25) {
            this.temp -= 5;
        }
    }

    @Override
    public String toString() {
        return "Termosas{" + "temp=" + temp + '}';
    }
    

   
    
    
    
}
