
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.0;

    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(FEES);
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers > 0){
            this.numberOfContainers = numberOfContainers;
        } else  {
            this.numberOfContainers = 1;
        }
    }

    public double getPriceWithFees(){
        return super.getPriceWithFees();
    }

    public String getTransportType(){
        return "Transporte Aéreo";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%15s: %s\n", "Numero de contentores", this.numberOfContainers));

        return sb.toString();
    }
}
