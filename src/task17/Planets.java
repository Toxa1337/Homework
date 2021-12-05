package task17;
import java.math.*;

import static java.lang.Math.pow;

//Напишите программу, в которой определен перечисляемый тип Planet (планета).
// Данный тип должен описывать планеты Солнечной системы.
// Для каждого элемента перечисления с помощью конструктора задайте массу и радиус.
//Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон.


public class Planets {
    enum Planet {
        Mercury(0.33*pow(10,24),2439.5),
        Venus(4.88*pow(10,24),6051.5),
        Earth(6*pow(10,24),6371),
        Mars(0.6*pow(10,24),3390),
        Jupiter(1900*pow(10,24),69911),
        Saturn(570*pow(10,24),58232),
        Uranus(87*pow(10,24),25362),
        Neptune(103*pow(10,24),24622);
        private double m, r;
        Planet(double m, double r){
            this.m=m;
            this.r=r;
        }

        public double getM() {
            return m;
        }

        public double getR() {
            return r;
        }

        public double getGM(){
            double G = 6.67 * pow(10,-11);
            return m*G;
        }

        public double getR2() {
            return r*r;
        }

        @Override
        public String toString() {
            String out = "M = " + m + " R = " + r;
            return out;
        }
    }
}
