package org.example;

import java.util.Random;

public class Macth {
    Fighter f1;
    Fighter f2;
    int minWeigth;
    int maxWeigth;
    Random random = new Random();


    Macth(Fighter f1, Fighter f2, int minWeigth, int maxWeigth) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeigth = minWeigth;
        this.maxWeigth = maxWeigth;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======Round======");
                int olasilik = random.nextInt(2);
                switch (olasilik) {
                    case 0:
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                        break;
                    case 1:
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()) {
                            break;
                        }
                        break;
                }


                System.out.println(this.f1.name + "sağlık :" + this.f1.health);
                System.out.println(this.f2.name + "sağlık :" + this.f2.health);
            }
        } else {
            System.out.println("Siklet uyuşmazlığı !");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeigth && this.f1.weight <= maxWeigth) && (this.f2.weight >= minWeigth && this.f2.weight <= maxWeigth));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı");
            return true;
        }
        return false;
    }
}
