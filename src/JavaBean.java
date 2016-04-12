/**
 * Created by gioele on 24/03/16.
 */
public class JavaBean {


    private long id;
    private String nome;
    private String difficolta;
    private String preparazione;
    private String cottura;
    private String dosi;
    private String costo;
    private String image;



    public JavaBean(){
        this.nome= "Franco";
        this.difficolta = "Difficile";
        this.preparazione = "Lunga";
        this.cottura = "Lunga";
        this.costo ="10 Euri";
        this.image =" Sto corso fa caca a spruzzo";
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDifficolta() {
        return difficolta;
    }



    public void setDifficolta(String difficolta) {
        this.difficolta = difficolta;
    }



    public String getPreparazione() {
        return preparazione;
    }



    public void setPreparazione(String preparazione) {
        this.preparazione = preparazione;
    }



    public String getCottura() {
        return cottura;
    }



    public void setCottura(String cottura) {
        this.cottura = cottura;
    }



    public String getDosi() {
        return dosi;
    }



    public void setDosi(String dosi) {
        this.dosi = dosi;
    }



    public String getImage() {
        return image;
    }



    public void setImage(String image) {
        this.image = image;
    }



    public String getCosto() {
        return costo;
    }



    public void setCosto(String costo) {
        this.costo = costo;
    }
}
