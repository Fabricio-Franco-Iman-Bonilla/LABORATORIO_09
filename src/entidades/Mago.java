/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fabricio
 */
public class Mago extends Personaje{

    private int magia;
    private int sabiduria;
    
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDeVida=atacado.getVida();
        atacado.setVida(nivelActualDeVida-8);
        atacado.defender(this);
    }
    public void lanzarHechizo(Personaje atacado){
        //implementar
    }
    /**
     * @return the magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

   
    
    
    
    
}
