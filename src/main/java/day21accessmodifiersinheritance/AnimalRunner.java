package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
        1) "Inheritance" sayesinde;
            i) Code tekrarindan kurtuluruz.
            ii) Code tamiri (maintenance) kolay olur.
            iii) Child Classlari daha atomic yapmis oluruz.

        2) Bir Classi baska bir Classin Child Classi yapmak icin "extends" keyword kullanilir
        Ilk yazilan Class Child, ikinci yazilan Class parent olur.

        3) Child Class objectleri Parent Classtan method ve variablelari kullanabilirler.

        4) Parent Class objeleri Child Classtan method ve variableleri kullanamazlar.

        5) Object Class her Classin parentidir.
        Java da Object Class haric her Classin parenti vardir.
        Javada Parenti olmayan tek Class Object Classtir.

        6) Private method ve variablelar Child Classlar tarafindan kullanamazlar.
        Protected method ve variablelar Child Classlar tarafindan kullanilabilir.
        Default method ve variablelar ayni package deki Child Classlar tarafindan kullanilabilir.
        public method ve variablelar Child Classlar tarafindan kullanilabilir.
        Note: Child Classlar tarafindan kullanilabilir olmak inherit edilebilir demektir.

        7) 4 tip inheritance vardir.
            i) Multi inheritance: Java destekler
            ii) Hierarchical inheritance : Bir parent icin coklu Child. Java kabul eder.
            iii) multiple inheritance : bir childa coklu parent. Java bunu desteklemez.
            iv) single inheritance : bir childa bir parent class demektir. java bunu destekler.

     */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();



    }
}
