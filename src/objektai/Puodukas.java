package objektai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tavar
 */
public class Puodukas {

    private int talpa;
    private char medziaga;
    private char spalva;
    protected int turinys;

    public Puodukas(int talpa, char medziaga, char spalva) {
        this.talpa = talpa;
        this.medziaga = medziaga;
        this.spalva = spalva;
        this.turinys = 0;
    }

    public Puodukas() {
        this('r');
    }

    public Puodukas(char spalva) {
        this(150, 'p', spalva);
    }

    public void ipilk(int kiek) {
        if (kiek < 0) {
            return;
        }
        if (kiek + this.turinys > this.talpa) {
            this.turinys = this.talpa;
        } else {
            this.turinys += kiek;
        }
    }

    public void isgerk(int kiek) {
        if (kiek < 0) {
            return;
        }
        if (this.turinys - kiek < 0) {
            this.turinys = 0;
        } else {
            this.turinys -= kiek;
        }
    }

    public int getTalpa() {
        return this.talpa;
    }

    public int getTurinys() {
        return this.turinys;
    }

    public char getMedziaga() {
        return medziaga;
    }

    public char getSpalva() {
        return spalva;
    }

    public void setSpalva(char spalva) {
        this.spalva = spalva;
    }

    @Override
    public String toString() {
        return "Puodukas{" + "talpa=" + talpa + ", medziaga=" + medziaga + ", spalva=" + spalva + ", turinys=" + turinys + '}';
    }

    
    
}
