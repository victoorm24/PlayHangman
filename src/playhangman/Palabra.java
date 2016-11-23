/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playhangman;

/**
 *
 * @author BlueLight
 */
class Palabra {

    public Palabra(int id,String ing, String esp) {
        this.id = id;
        this.esp = esp;
        this.ing = ing;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }
    private String esp;
    private String ing;
    private int id;
}
