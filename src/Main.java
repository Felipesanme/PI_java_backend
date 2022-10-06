public class Main {
    public static void main(String[] args) {

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);
        System.out.println(producto6);
        System.out.println(producto7);
        System.out.println(producto8);
        System.out.println(producto9);
        System.out.println(producto10);
        System.out.println(producto11);
        System.out.println(producto12);
    }

    static Groceries producto1 = new Groceries("Leche Entera Alpina",3100,10001,true, "Leches");
    static Groceries producto2 = new Groceries("Hamburguesa Colanta",8500,10185,true, "Carnes frías y embutidos");
    static Hardware producto3 = new Hardware("Pilas Varta AAA",3600,12390, false, "pilas");
    static Hardware producto4 = new Hardware("Bombillo Sylvania 15 W",7400,12404, true, "bombillos");
    static CleaningProduct producto5 = new CleaningProduct("Lava Loza Fassi Limon",6100,11882, false, "lavaloza");
    static CleaningProduct producto6 = new CleaningProduct("Lustra Muebles Magistral ",6100,12029, true, "insecticidas");
    static PersonalCare producto7 = new PersonalCare("Protectores Nosotras Multiestilo",18700,11959, true, "protección femenina");
    static PersonalCare producto8 = new PersonalCare("Desodorante Rexona V8 Rollon",16200,12340, false, "desodorantes");
    static LiquorAndCigarettes producto9 = new LiquorAndCigarettes("Cigarillos Rothmans Azul",6800,10607, true, "Cigarrillos");
    static LiquorAndCigarettes producto10 = new LiquorAndCigarettes("Cerveza Stella Artois",23100,10579, true, "Cerveza");
    static Drugstore producto11= new Drugstore("Kola Graulada Tarrito Rojo JGB",13900,11419, true, "Salud y bienestar", 100500);
    static Drugstore producto12= new Drugstore("Kola Graulada Tarrito Rojo JGB Vainilla",6200,11424, true, "Salud y bienestar", 100500);


}