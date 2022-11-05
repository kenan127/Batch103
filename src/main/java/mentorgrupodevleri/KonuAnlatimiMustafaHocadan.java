package mentorgrupodevleri;

public class KonuAnlatimiMustafaHocadan {
    ;
}


    //StrBuilderStrBuffer

    /*
                    STRINGBUILDER
        1)"StringBuilder" Java'da bir Class'dir.
        2)"StringBuilder", String olusturmaya yarar.
        3)"String" Class varken nicin "StringBuilder" a ihtiyac duyariz?
          Cunku "String" Class "(değişmez) Class" dir, ama biz bazen "Mutable" (degisebilir)String'lere ihtiyac duyariz,
          StringBuilder bize "Mutable" String verir.
        4) "Immutable Class" larda var olan deger degistirilemez. Siz var olan  bir degeri degistirmek istediginizde
            i)Memory'de yeni bir variable yeni degerle olusturulur
            ii)Eski variable'in pointer'i yeni variable'a dondurulur
            iii)Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir

          NOT:  "Mutable Class" larda var olan deger degistirilebilir. Oijinal deger korunmaz.

        5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
            Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
            kullanmasini temin eder.
            Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
             etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir.
              Fakat herhangi bir variablee'in degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz
              variable icin yeni bir container olusturur ve variable'in pointer'ini bu yeni variable'a yonlendirir.
              Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

            ============ > METHODLAR  <================
            //StringBuilder nasil olusturulur?
        //1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//Java
 ======> append () : Eleman eklemeye yarar.
                                 //2.Yol:
                                 StringBuilder strb2 = new StringBuilder();
                                 //Yol a:
                                 strb2.append("Java");
                                 strb2.append(" is easy");
                                 strb2.append("!!!");
                                 System.out.println(strb2);

                                 //Yol b:
                                 strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain (method zinciri)
                                 System.out.println(strb2);

======> length() character sayisini bulmaya yarar
                            //StringBuilder'larda character sayisi nasil bulunur? ==> length() method'u ile bulunur
                             int numOfChar = strb3.length();
                               //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar

 ======> setCharAt(2, 'r'): Karakter degistirme islemlerinde kullanilir
                              //setCharAt(2, 'r'); ==> Index 2'deki character'i "r" ye civirir.
                               strb3.setCharAt(2, 'r');

 =======> delete() metodu :silme islemlerinde kullanilir
                             //delete(3, 18); ==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler
                            strb3.delete(3, 18);

                             //deleteCharAt(2); ==> Index 2 deki characteri siler
                            strb3.deleteCharAt(2);

  =======> reverse() metodu: StringBuilder'i ters cevirir.
                                  //reverse() method'u StringBuilder'i ters cevirir. Ali ==> ilA
                                 //"mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
                                 strb3.reverse();

                                  //"Immutable" larda orijinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz
                                 String abc = "Java";
                                 abc = abc.replace("a", "i");

  =====> toString() method'u StringBuilder'lari String'e cevirir
                                      String stringStrb3 = strb3.toString();

                          //String'den de StringBuilder'a asagidaki gibi donebilirsiniz
                              StringBuilder strb4 = new StringBuilder(stringStrb3);

 =====> insert (): Araya eleman koymaya yarar
                    insert(3, "XXXX"); 3. character den sonra "XXXX" leri koyar



 =====> a.compareTo(b) method'u : StringBuilder'lari alfabetik olarak veya ASCII degerleri bakimindan karsilastirir
                                   i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
                                    int sonuc = a.compareTo(b);


     */
    /*
                        STRINGBUFFER
        1)StringBuffer Java'da bir class'dir ve String olusturmaya yarar.
        2)StringBuffer Class, StringBuilder Class gibi "mutable" dir.

        StringBuffer ile StringBuilder in farki nedir?
        1)StringBuffer "thread-safe" dir.
        2)StringBuffer "synchronized" dir.

        Senaryolar
        1)Degistirilemez data icin "String Class" kullanilir
        2)Degistirilebilir ama "multi-thread" gerekmeyen durumlar icin "StringBuilder" kullanilir
        3)Degistirilebilir ve "multi-thread" gereken durumlar icin "StringBuffer" kullanilir
     */
    //VARARGS VE INCREMENT DICREMENT KONU ANLATIMLARI
/*
                INCREMENT - DICREMENT
    JAVA ANLAMLI BIR CUMLE DUYDUGUNDA HEMEN UYGULAR. BU KISIM ASAGIDAKI HUSUSLARIN ANLASILMASINDA COK ONEMLIDIR
     post Increment (sonra arttir) :once variable al sonra artirma yap
     Pre Increment (once arttir)
     post Dicrement (sonra azalt) once variable al sonra azaltma yap
     Pre Dicrement (once azalt)
     */


/*
  ===========>>>>>  VARARGS KONU ANLATIMI  <============
    1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak istersek varargs kullanmaliyiz

    2) HER BIR IHTIMAL ICIN AYRI AYRI YAZDIGIMIZ METODLAR YERINE ISTEDIGIM KADAR SAYIYla islem yapabilecegim
    METOD OLUSTURALIM
    Varargs (Variables argumant) demektir. dipsiz kuyu demektir. Istedigin kadar veri koy onlari icine alip onlarla yapmak
    istediginiz islemleri  arkasinda calisan Array sayesinde yapabiliriz. o yuzden varrags ile ugrasirken kendimizi
    arrayslarla calisiyormus gibi dusunebiliriz

    3) Varargs olusturmak icin data tipini <data type> ...<varargs ismi>varargsin ismini yazip uc nokta koyuyoruz
        buradaki ...(uc nokta) KESINLIKLE DATA TYPE ILE ISMIN ARASINDA OLMALI. Bu arada olduktan sonra ister data type
         bitisik olsun ister ismin hemen onunde isme bitisik olsun farketmez kod calisir

    4) varargs larda birden fazla parametre kullanmak istersrsek VARARGS EN SONDA OLMALIDIR
        unreachable kod: ulasilamayan kod demektir.

    5)Bir methodda birden fazla varargs kullanilabilir mi?
        Varargs en sonda olmak zorunda oldugundan birden fazla kullanirsak en az biri en sonda olmayacagindan bu da bir
        onceki kural ile celiseceginden  bir methodda sadece bir varargs kullanilabilir.

    NOT. COKLU DURUMLARDA JAVA SECIM YAPMAZ/ Data tiplerine varincaya kadar inceler ve en son tam uyan kodu calisir
        Java tam uyumu sever

    }


    /*
                                COSTRUCTOR KONU ANLATIMI
        1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir. (Yukaridan asagiya dogru calistirilir)
        2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
        3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
        4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
        5)"super()" kodunu gorunur sekilde yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
        6)"super()" kodu Parent Class'dan constructor cagirmaya yarar..

      1)Siz Class olusturdugunuzda Java otomatik olarak ilk satirda size gorunmez bir constructor verir, "super ()"cunku
    Java, Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
    constructor'in sart oldugunu bilir.
       ==> super (),  child classtan parent classa gidip oradaki constructoru (parent constructoru) cagirmaya yarar

      2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.

      3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.

      4)Bir Class'da birden fazla constructor olabilir. Fakat bu constructor'larin parametre'leri farkli olmalidir.
        Constructorda acces modifiere olmak zorundadir. Ondan sonra Class ismi olmak zorundadir. Ondan sonra () yazilir
        parametreler () icine yazilir. Eger bir kriterim varsa bu parentazin icine yazilir.
        public HondaAccort(){}
        public HondaAccort(int price){}
        public HondaAccort(int price, int year){}
        Bir classtan farkli ozelliklere sahip objectler uretilebilir.

      5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
            "this.price" syntax'i constructor'larin icinde kullanilir.
             public HondaAccord(int price, int year, String make, String model){
            this.price = price;
            this.year = year;
            this.make = make;
            this.model = model;
            System.out.println("Honda Accord Constructor");   }
             this.type = type; //sendeki type benim typeim gibi yap demektir
            BU constructor fiyatini , modelini, markasini ve yasini bizim belirledigimiz bir object olusturmaya yarar

      6)Conctructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
        Class daki variable degerlerini degistiremez...Kalip degistirilmez eger kalip degistirilirse ondan sonraki butun object uretimleri bozuk olur


       ORNEK:  "Car turunde, rengi beyaz olan 54000km de 250000TL fiyati olan 2020 model bir Honda Accord ariyorum."
        Honda Accort gercek dunyada bir araba  aplicationlarda bir objecttir.
        BIr object olusturmak icin farkli constructorlarin birlestirilmesine ihtiyacim vardir
            HondaAccord hacc = new HondaAccord(250000, 2020);
             Burada baslangicta fiyati ve yili kullandim. cunku bundan sonraki diger ozellikler icin java parent classlar
             arasinda gezerek her parente ugrayarak oradan gerekli verileri cekecektir

            NOT: CONSTRUCTOR CAGIRMADA HERHANGI BIR PARENTI ES GECEMEYIZ. MUTLAKA HER PARENTE UGRAMAK ZORUNDAYIZ

                                 INHERITANCE'DE METHODLAR NASIL CAGRILIR?
        ==>/Object olustururken Object'in data type'i Child Class'lardan secilemez. Bir kisiyi araplarda oldugu gibi cocuguyla tanimlayamazsiniz
            (Mulayim Ahmetin babasi Mustafa gibi)
        ==>Inheritance'da "method'lar secilirken Java Constructor'a (Esittir isareti(assingment operator)nin sag tarifina bakar"
       ==>Oncelikle, istediginiz method'u Constructori kullanilan Class'dan alir.
     ==>O Class'da bulamazsa Parent Class'lara bakar. Ilk buldugu yerdeki methodu calistirip konsola yazar
      ==>Hicbir yerde o method'u bulamazsa hata verir.

      Runner class icinde main method olan classtir.

      ==>NOTTT: METHODLAR SECILIRKEN JAVA COSTRUCTORA BAKAR; VARIABLESLER SECILIRKEN JAVA DATA TIPINE BAKAR <==========

            */


         /*



                             INHERITANCE COSTRUCTOR
     ==> COSTRUCTOR obje uretiminde asci gibidir.Constructor olmadan obje uretilemez. (new'den sonraki kisma Constructor denir)
     benim yaratilmam icin once dedem ve babamin yaratilmasi lazim. javada da aynen boyledir. eblect olusturmaya en ustten baslanir.
     Javada yaratilis yukaridan asagiya olur. "Cat" in yaratilmasi icin once "cat" in butun parentlerinin yaratilmasi lazim
     Constructor olusturmak icin acces modifiere yazariz classin ismini yazariz baska bir isim kullanamayiz
     Constructor isimlerinin class isimleriyle ayni olmasi zorunludur. Sonra () yazip daha sonra da {} yazariz.

                     COSTRUCTOR ve METHOD FARKI NEDIR?
     1)Constructor da return type  olmadigi icin metfoddan farklidir.
     2) METHOD isimlerini biz verebiliriz. ama COSTRUCTOR ismi classla ayni olmak zorundadir
     3) Method isimleri kucuk harfle baslar COSTRUCTOR isimleri ayni zamanda class ismi oldugu icin buyuk harfle baslar.

    1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir, cunku
          Java, Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
          constructor'in sart oldugunu bilir.
        2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.
        3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
        4)Bir Class'da birden fazla constructor olabilir. Fakat bu constructor'larin parametre'leri farkli olmalidir.
        5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
          "this.price" syntax'i constructor'larin icinde kullanilir.
        6)Conctructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
          Class daki variable degerlerini degistiremez...

          */


      /*      ACCES MODIFIERE KONU ANLATIMI
    1) acces Modifier: (kullanıcı duzenleyicisi) classi kimin kullanacagina karar verir
        4 tane acces modifier vardir.
        a)public (halk): projenin herkese acik oldugu, herkesin projeye erisip uzerinde gerekli duznlemeleri yapabildigi tiptir
                        public her classtan ulasilabilir

        b)protected: bir gruba ve o gruptakilerin cocuklarina acıktır. protected veriler de baska packettlerden de kullanilamaz
                    Ancak baska packette child class icinden kullanilabilir. BU veriyi baskalarinin da kullanabilmasi icin isleme tabi tutariz

        c)defauld: bir gruba aciktir. bir veriyi default yapmak icin acces modifiere yazmayiz
                   ==> (String email= "kusulu78@gmail.com";) bu sekilde bir kullanim gorursek bu onun default oldugunu gosterir
                    default olanlar baska packetten kullanilamazlar

        d)privvate: sadece kisiye ozeldir. (ehliyet gibi)

        NOTE: BU HUSUSLAR SORULABILIR
        Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private
        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler
        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz

    public class        Cat         extends         Animal
                    Child           keyword         parent

    Javada butun classlarin babasi olan bir OBJECT CLASS vardir (Hz Adem gibidir) O yuzden olusturdugumuz metodla ilgili
    calisirken javanin olusturdugu diger metodlari da goruruz.

    Javada varligi kesin olan seyler yazilmaz. Tanisirken insan oldugumuu soylemedigimiz gibi.

     */


    /*          =======> RUNNER- INHERITANCE KONU ANLATIMLARI <======
    Runner: normal aplicationlarda genelde bir tane main metod; birden fazla class olur. Bunlarin iicnde bircok kod vardir.
    her bir classa main metod konulmaz. cunku arabada sadece bir tane motor olur.main metod sadece bir classa konur.
    bu kod butun classlardaki kodlari calistirir.
    genelde icinde main metod olan classa "RUNNER class" adi verilir.
    Runner class icine main method konulmak icin olusturulur

    NOT: CLASS LAR PRİVATE VE PROTECTED OLAMAZLAR. cunku classlar obje olusturmak icindir bunun icin de ya projenin her
    tarafindan ya da packetlerden ulasmamiz gerekir o    yuzden genelde public yapilir.
    runner den ulasmak istedigimiz classta mutlaka bir obje olusturmaliyiz
    not: Private olan veriye sadece olusturulduklari class icinde kullanilabilirler ; yoksa ulasamayiz.

    NOt : kod yazarken tekrar yapmak dogru degildir
    bir classta ne kadar cok metod varsa o kadar yavas calisir.
     kod dunyasinda atomic (kucuk) yapilar tercih edilir. Usta developer kisa kod yazan adamdir. Kod hem calismali hem de standartlara uygun olmali
     kod kisa, atomic ve okunabilir olmalidir.

     inheritance : miras demektir
     1)INHERITANCE SAYESINDE
     a) Code tekrarindan kurtuluruz
     b) code tamiri (maintanence) kolay olur.
     c) child classlari daha atomic yapmis oluruz

    2) Bir classi baska bir classin childi yapmak icin "Extends" keywordunu kullanmak zorundayiz.
                 Ilk yazilan class Child; ikinci yazilan Class Parent olur.

    3) Child class objectleri Parent Classtan method ve variable'leri kullanabilirler.

    4) Parent class objeleri child classtan method ve variable'leri kullanamazlar.

    5) Object class her classin "parent" idir. Javada object class haric her classin parent classi vardir.
        javada parenti olmayan tek class object classtir.

  6) Bir method veya variable  private ise onu inherit edilemezler. Child class lar tarafindan kullanilamazlar

  7) Protected ler ayni packette ise inherit edilebilir. Cunku protected ler ayni packet icinde zaten calistirilabilirdi.
               Child class lar child classlar tarafindan kullanilabilirler. Farkli packetlerde ise inherit edilemezler.

 8)default method ve variable'ler  Child class lar ayni packetteki child classlar tarafindan kullanilabilirler.

 9) default method ve variable'ler child classlar tarafindan kullanilablirler.

 o uzden olusturdugumuz methodler public ve protected olurlarsa bir problem olmaz

 NOT:Apartman giibi inheritancelere multiLevel Inheritance denir

 NOT: bir parent birden fazla child varsa ona da Hierachical (hiyerarsik) Inheritance denir
 NOT: bir childin iki parenti varsa buna da Multiple Inheritance denir bu konu java tarafindan desteklenmez.
       javada multiple inheritance kullanilamaz.



    4 tip inheritance vardir
    1) Multilevel inheritance: Apartman gibi olanlar java bunu destekler
    2) Hierachical (hiyerarsik) Inheritance : bir parent birden fazla child vars ona denir. Java bunu kabul eder
    3) Multiple Inheritance bir childin iki parenti varsa buna Multiple Inheritance denir
    bu konu java tarafindan desteklenmez. Multiple Inheritance)     javada multiple inheritance kullanilamaz.
    4) Single inheritance: Bir child class icin  bir parent class varsa single inheritance denir

    /*
                    INHERITANCE'DE VARIABLESLER NASIL CAGRILIR?
       ==> Inheritance'da "variable'lar secilirken Java object'in data type'ina bakar."
       ==> Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar. Data tipi en basta yazilan kelimedir.
        ==>Data tipiyle class ayni anlama gelir
       ==> O Class'da bulamamzsa Parent Class'lara bakar.
       ==> Hicbir Parent Class'da bulamazsa hata verir

        INHERITANCE'DE METHODLAR NASIL CAGRILIR?
        ==>/Object olustururken Object'in data type'i Child Class'lardan secilemez. Bir kisiyi araplarda oldugu gibi cocuguyla tanimlayamazsiniz
            (Mulayim Ahmetin babasi Mustafa gibi)
        ==>Inheritance'da "method'lar secilirken Java Constructor'a (Esittir isareti(assingment operator)nin sag tarifina bakar"
       ==>Oncelikle, istediginiz method'u Constructori kullanilan Class'dan alir.
     ==>O Class'da bulamazsa Parent Class'lara bakar. Ilk buldugu yerdeki methodu calistirip konsola yazar
      ==>Hicbir yerde o method'u bulamazsa hata verir.

      Runner class icinde main method olan classtir.

      ==>NOTTT: METHODLAR SECILIRKEN JAVA COSTRUCTORA BAKAR; VARIABLESLER SECILIRKEN JAVA DATA TIPINE BAKAR <==========
         */

  /*
            ===========> EXCEPTION  <============
    EXCEPTION: (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.

    EXCEPTION'lar ile calismanin iki yolu vardir:

    1)try=cath kullanarak exception olussa bile calismayi devam ettirme (genel olarak bu yontem kullanilir)

    2) throw exception kullanarak calismayi durdurma (mesela kod geregi bir dosya uzerinden okum yapmamiz gerekiyor ise
     bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez)

    3) Eger EXCEPTION'i handle etmezsek (sorunu halletmezsek) java calismayi durdurur

    4) try=catch kullanilirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz

    5) try, catch olmaksizin kullanilamaz

    6) eger yazmis oldugumuz herhangi bir kod satirinda problem olabilecegini dusunuyorsak try-catch blok icine koymaliyiz

    7) catch blok parantezi icerisine olasi muhtemel exception clas ismi yazilir

    8) e/getmessage(), metodunu kullanarak teknik mesajlar elde edebiliriz
        System.out.println(); Buraya yazmis oldugum mesajlar benim yazdigim teknik olmayan mesajlardir
        e.printStackTrace(); metodu Exception ile ilgili detaylica teknik mesaj verir, kod calismaya devam eder.
        System.err.println(); Hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz

      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez

      NOT: e.printStackTrace(); methodu kullanildiginda ayrica 'sout' yapmak gerekmez. Cunku bu method  zaten
                            consola otomatik olarak yazdirir
    NOT: Herhangi bir satirda 'Exception' atilirsa direkt 'catch' bolumune gecer 'try' bolumu icindeki kodlari calistirmaz

                    ==========> RUN TIME EXCEPTIONLAR (UNCHECKED EXCEPTION) <============

  1)  NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'i valueOf() kullanarak Integer'a cevirmek
                            isterseniz NumberFormatException alirsiniz

   2)StringIndexOutOfBoundsException: Eger bir String'den character/ler alirken olmayan bir index kullanilirsa
                                    StringIndexOutOfBoundsException alinir.

  3)IllegalArgumentException(); //uygun olmayan deger hatasi demektir

  4)  "ArithmeticException"    Java matematik ile ilgili karsilasilabilecek muhtemel tum istisnalari, hatalari "ArithmeticException" classina koymustur.
                                MAtematikteki tum istisnalari detaylari bilmek zorunda degilim.
                                ArithmeticException AYNI ZAMANDA BIR DATA TIPIDIR

  5) NullPointerException: eger lenght() methodunda null atarsam: NullPointerException hatasi  alirim. null:hukumsuz demektir

                                 ==============> NOTLAR <==========
    1)log (akisi takip etmek demektir, aplication'unun adim adim neler yaptigini,  hatanin adim adim nasil olustugunu gosterir)
          icin.INTERWIEW SOURUSU (Hatyi gorunce ne  yaparsiniz? Hata raporuna, log kayitlarina bakarim


    2): javada int bir deger int bir degere bolunurse bunu double conteinere koysaniz bile sonuc int bir tam sayi olur
        ORN: 124/3= 41,33 DEGIL 41.0 OLARAK ALINIR

   3) Javada ilk exception atildiginda diger catch'lar calismaz. Cunku arabanin lastigi patlayinca seyahat etmeye devam edemezsiniz
        O yuzden sadece bir catch calisir

   4) Butun exceptionlar icin sadece bir tane catch icinde catch(Exception e) yazilirsa bu butun durumlar icin 112'yi ara demek gibidir.
        Cunku Javada butun Exceptionlerin parent classi 'Exception' classidir. burada alinan hata javanin Exception
         parent classina gonderilir ve parent class o hatanin hangi child classta olduguna karar verip o classtaki hata mesajini
         yazdirir. Bu kod yazimi kisadir ama okunmasi zordur. Uzun olan kodun da okunmasi kolaydir ve butun exceptionlar
         icin ayri ayri  uygulamalar yapabilme sansim vardir. Eger requirement documentte bu hatalari ayri ayri yazdirmamiz
         isteniyorsa uzun olan kodu yazariz. Ayri ayri uygulamam yapmam istenmezse kisa kodu yazarim

   5)Unreachable Code: Ulasilamaz kod demektir

   6)
    1) Aralarinda parent-child relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz 'child'
        olan once kullanilmalisir, aksi takdirde hata verir.
    2) Aralarinda parent-child relationship olmayan Exception Class'lari multiple catch'lerde kullanmak isterseniz
        aralarindaki siralamanin onemi yoktur


   7) YANLIS DATA KULLANIMLARINDA BIZ PROBLEMLERI IF-ELSE ILE COZMEYIZ BUNUN YERINE try-catch KULLANIRIZ.
        cunku bankamatikte yanlis sifre girince bile islemlere devam etmek geri dob=nulmez hatalara sebep olabilir

   8)Aplicationlari articherler dizayn ederken kurallari (trafik isiklari gibi) belirler ve hangi durumlarda exceptiona
        atmasi gerektigini, hangi durumlarda kodun calismayi durdurmasi gerektigini  developerler de ona gore kod yazarlar
        Farzlari ve vacipleri articherler belirler digerleri ona gore kod yazarlar

   9):Javada exceptionalarin varligi cok onemli bizim hangi alanda top oynayacagimizi gosterir. BAzi durumlarda da ben
        Exception yazabilirim

    10)MEthodun icinde exception uretme= mimarlar aplicationlarla ilglili kurallar olustururlar bu kurallari exceptionlarin icine
    koyarlar
    bazen gunluk hayatta yanlis olan seyler java icin yanlis olmayabilir (mesela yasin negatif olmasi gunluk hayatta
    mumkun degil ama javada gore mumkundur

            Arıthmetıc, NullPointer, ArrayIndexOutOfBound, StringIndexOutofBound, NumberFormat
     */