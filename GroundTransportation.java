
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double FEE = 3;

    private GroundTransportation(String licencePlate) {
        this.licensePlate = licencePlate;
        setFees(FEE);
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if(licensePlate != null) {
            this.licensePlate = licensePlate;
        }
    }

    public double getPriceWithFees() {
        return super.getPriceWithFees();
    }
    
    public String getTransportType() {
        return "Transporte Terrestre";
    }

    @Override
    public String toString() {
        super.toString();
        final StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%15s: %4.2f%%\n", "Matricula", this.licensePlate));
        
        return sb.toString();
    }
}
