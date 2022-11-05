package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a + b + 1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b + 1;
    }
    // Asagidaki method "Overriding method"
    @Override
    public Mammal create() {
        return new Mammal();
    }


    // OVERRIDE KURALLARI
    // 1) Override yaparken "Method body"si degistirilir.
    // 2) Override yaparken ASLA method signature'a(isim ve parametre) dokunulmaz. void sonrasi ve ()icini
    // 3) Override yaparken inheritance olmak zorundadir.
    // 4) Override yaparken "Access modifier"lar belli kurallara gore farklilastirilabilirler.
    //      i) "private" method'lar override edilemezler
    //      ii) Child Classtaki override edilen methodun Access Modifieri Parent Classtaki Access Modifier ile ayni veya
    //      daha genis olmalidir.
    //      Note: Child Classtaki Access Modifieri daha dar olamaz.
    //      iii) Default methodlar ayni package icindeyse override edilebilirler,
    //      farkli packageden override edilemezler. baglanti kurulamaz.
    // 5) Parent classtaki methodun Return type'i void ise return type degistirilemez.
    // 6) Parent classtaki methodun Return type'i primitive ise return type degistirilemez.
    // 7) Parent classtaki methodun Return type'i Wrapper Class ise return type degistirilemez.
    // 8) Parent classtaki methodun Return type'i Child Class ise return type Childlardan biri olabilir.
    //      Note: Child Classtaki return type Parent Classtakiden genis olamaz.
    //      Note: Aralarinda Parent Child iliskisi olmayan classlar overridingte Return Type degisiminde kullanilamazlar.
    //      mesela Short Integerdan kucuktur fakat aralarinda parent-child iliski olmadigindan Integer yerine Short
    //      kullanamazsin.
    //      Note: Childtaki methodun Return Typeindan Parenttaki methodun Return Typeina gidiste "Is-A" relationship olmali.
    //      Note: Aralarinda "IS-A" relationship olan Data Typelara "Covariant" denir.
    // 9) Child<>Parent ==> IS-A (Her kedi hayvandir ama her hayvan kedi degildir)
    //                  ==> HAS-A (Hayvanlar kedileri icerir ama kediler tum hayvanlari icermez)
    // 10) final methodlar override edilemezler. Overriddingte method body degistirilir. final methodlar
    //  body degistirilmesine izin vermez.
    //  11) Polymorphism overloading + overriding
    //  Note: polymorphsim nedir? overloading ve overridingi anlat
    //  12) Overloading ve Overriding arasindaki farklar;
    //      i) Overloading icin inheritance gerekmez fakat overriding icin gerekir. Overloading tek classin icinde olur.
    //      ii) Private methodlar overload edilebilir. override edilemezler.
    //      iii) final methodlar overload edilebilir override edilemezler.
    //      iv) overloading static polymorphism olarak overriding dynamic polymorphism olarak adlandirilir.
    //           Cunlu static methodlar overload edilebilir override edilemezler.
    //      v) overloadingte method signature degisir overridingte method signaturea dokunulmaz.
    //  @Override annotation'ini kullanarak Javanin yaptigimiz Overrdie islemini kontrol etmesini saglariz.

    //Note = Override problemi iki sayfada da uyari verir.
}
