/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektai;

import java.lang.reflect.Method;

/**
 *
 * @author tavar
 */
public class Objektai {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        Puodukas p = new Puodukas('r');
//        p.spalva = 'g';
//        System.out.println(p.spalva);
//        System.out.println(p.talpa);
        Puodukas dp = new Puodukas(300, 's', 'b');
        Puodukas npd = new Puodukas(500, 'm', 'j');
//        npd.setTurinys(600);
        System.out.println(npd.getTurinys());
//        System.out.println(npd.spalva);
        npd.setSpalva('a');
//        System.out.println(npd.medziaga);
//        System.out.println(npd.spalva);
        npd.ipilk(450);
        System.out.println(npd.getTalpa());
        System.out.println(npd.getTurinys());
//        System.out.println(p.talpa);
//        System.out.println(dp.talpa);
//        p.talpa += 100;
//        System.out.println(p.talpa);
//        System.out.println(dp.talpa);
        p.ipilk(100);
        dp.ipilk(230);
        p.ipilk(15);
        System.out.println(p.getTurinys());
        System.out.println(dp.getTurinys());
        dp.isgerk(180);
        System.out.println(p.getTurinys());
        System.out.println(dp.getTurinys());
        p.setSpalva('z');
        p.isgerk(65);
        System.out.println(p.getTurinys());
        Termosas t = new Termosas();
        System.out.println(t.getMedziaga());
        System.out.println(t.getSpalva());
        System.out.println(t.getTalpa());
        System.out.println(t.getTemp());
        System.out.println(t.getSpalva());
        System.out.println(t.getMedziaga());
        t.pasildyk(30);
        t.ipilk(100);
        System.out.println(t.getTemp());
        System.out.println(t.getTurinys());
        Object o = new Termosas();
        Puodukas p2 = t;
        t = (Termosas) o;
        if (o instanceof Termosas) {
            t = (Termosas) o;
        }
        String s = "Labas";
        s = s + "pasauli";
        s = null;
        System.out.println(s);
        if ("Labaspaisauli".equals(s)) {
            System.out.println("lygu");
        } else {
            System.out.println("nelygu");
        }
        System.out.println(t);
        t.pasildyk(30);
        t.ipilk(100);
//        Puodukas p = t;
        p.ipilk(50);
        System.out.println(t.getTemp());
        System.out.println(t.getTurinys());
//        Object o = t;
        t.isgerk(50);
        System.out.println(t);
        System.out.println(p);
        System.out.println(o);
//        Termosas t = new Termosas();
//        Puodukas p = new Puodukas();
        t.pasildyk(20);
        t.ipilk(400);
        p.ipilk(150);
//        perpilk(p, t);
        t.atvesink(3);
//        perpilk(t, p);
        System.out.println(t);
        System.out.println(p);
        t.atvesink(5);
    }

//    public static void main(String[] args) {
////        inspect("Labas");
////        inspect(new Object());
//        inspect(new Termosas());
//    }
//    public static void inspect(Object o) {
//        if (o == null) {
//            return;
//        }
//        System.out.println("got: " + o);
//        Class cl = o.getClass();
//        System.out.println(cl.getName());
//        
//
//        Class<Bliudas> c = Bliudas.class;
//        Class<? super Bliudas> superclass = c.getSuperclass();
//        System.out.println(superclass);
//        System.out.println(superclass.getSimpleName());
//
//
//        for (Method m : cl.getDeclaredMethods()) {
//            System.out.println(m.getName());
//        }
//
//        System.out.println("-------------------");
//    }
//
//    public static void perpilk(Puodukas p1, Puodukas p2) {
//        p2.ipilk(p1.getTurinys());
//        p1.isgerk(p1.getTurinys());
//    }
    public class ManoSk {

        private double sk;

        public ManoSk(duobl sk) {
            this.sk = sk;
        }

        public String toString() {
            System.out.println("mano sk " + sk);
        }
    }

}
