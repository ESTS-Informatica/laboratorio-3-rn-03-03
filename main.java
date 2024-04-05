
/**
 * Escreva uma descrição da classe main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class main
{
    private ShippingCompany shippingCompany;
    private GroundTransportation groundTransportation;
    private Van van;
    private Lorry lorry;

    public static void main(String[] args) {
        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");
        GroundTransportation groundTransportation1 = new GroundTransportation("Carro");
        GroundTransportation groundTransportation2 = new GroundTransportation("mota");
        Van van = new Van(2,"pooop");
        Lorry lorry = new Lorry(2,3,"Vrum");

        shippingCompany.add(groundTransportation1);
        shippingCompany.add(groundTransportation2);
        shippingCompany.add(van);
        shippingCompany.add(lorry);
    }
}
