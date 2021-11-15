package td4.ex1;

class Main {
    
    public static void main(String[] args) {
        Abonne  a1        = new Abonne("Tripoli","Bachir ");
        Ligne fixe1       = new Fixe("Tripoli",6484736,a1);
        Service internet1 = new Internet("Ogero",5,"Service Internet 5G",40000);
        Consommation c1   = new Consommation(fixe1,8,7,2019,internet1);
        
        Abonne  a2        = new Abonne("Baalbek","Ali ");
        Ligne mobile2     = new Mobile("Alfa",76933483,a2);
        Service commv2    = new CommunicationVocal(874,"Communication Vocale",18000);
        Consommation c2   = new Consommation(mobile2,11,5,2021,commv2);
        
        Abonne a3         = new Abonne("Beirut","Omar ");
        Ligne mobile3     = new Mobile("MTC",78483858,a3);
        Service commv3    = new CommunicationVocal(213,"Mtc Touch services",56000);
        Consommation c3   = new Consommation(mobile3,3,2,2016,commv3);
        
        System.out.println("Payment::\n");
        System.out.println("C1: "+c1+"\n");
        System.out.println("C2: "+c2+"\n");
        System.out.println("C3: "+c3+"\n");
    }
}