public class Planeta 
{
    //DOCUMENTAR
    /*Assignem variables, variable nom amb tipus de dada String, 
    diametre amb tipus int i variable pes amb tipus enter*/
    String nom;
    int diametre;
    int pes;    

    //DOCUMENTAR
    //Contructor amb tots els parametres    
    public Planeta(String nom, int diametre, int pes)
    {
        //assignem el valor de nom del constructor planeta al nom del class Planeta
        this.nom = nom;
        //assignem el valor de diametre del constructor planeta al nom del class diametre
        this.diametre = diametre;
        //assignem el valor de pes del constructor planeta al pes del class Planeta
        this.pes = pes;
    }

    //DOCUMENTAR
    //Estem creant un public Contructor Planeta què està buit
    public Planeta(){}

    //DOCUMENTAR
    public int planetaEnano()
    {
        //Si diametre es menor que 1300 retorna 1 i sino retorna 0.
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    //DOCUMENTAR
    public void expansio()
    {        
        //Fem que el diamtre es multiple * 3 als planetes, i com es void no cal fer un return.
        this.diametre = diametre * 3;
    }

    //DOCUMENTAR
    public int colisio(int meteorito)
    {
        //Si el pes es mes gran o igual a 1800 retorna 1
        if(this.pes>= 1800){
            return 1;
        }
        //sino el diamtre se suma la mitad del pes del meteorito i retona 0
        else{
            this.diametre = diametre + meteorito/2;
            return 0;
        }
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}