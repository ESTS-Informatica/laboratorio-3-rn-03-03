
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers, String licensePlate){
       super(licensePlate); 
       this.numberOfPallets = numberOfPallets;
       this.trailers = trailers;

    }

    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }

    public int getTrailers(){
        return this.trailers;
    }

    public String getLicensePlate(){
        return super.getLicensePlate();
    }

    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }

    public void setTrailers(int trailers){
        this.trailers = trailers;
    }

    public void setLicensePlate(String licencePlate){
        super.setLicensePlate(licencePlate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f%%\n", "Numero de paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %4.2f%%\n", "Numero de atrelados", this.trailers));
        
        return sb.toString();
    }

}
