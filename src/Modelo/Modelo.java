
package Modelo;

import javax.swing.JOptionPane;


public class Modelo {
  private float peso = 0.0f;
  private float estatura = 0.0f;
  private float imc = 0.0f;
  private Object jtf_peso;
  private Object jtf_estatura;
    private Object operacion;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public void setOperador(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object operacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getOperador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double operacion(){
       boolean verificacion;
        boolean verificacion2;
        
        try {
            Float.parseFloat(this.jtf_peso.getTex());
            verificacion = true;
        }
        catch (NumberFormatException error) {
            verificacion = false;
        }
        
        try {
            Float.parseFloat(this.jtf_estatura.getTex());
            verificacion2 = true;
        }
        catch (NumberFormatException error2) {
            verificacion2 = false;
        }
        
        if (verificacion == true && verificacion2 == true) {
            
            peso = Float.parseFloat(this.jtf_peso.getTex());
            estatura = Float.parseFloat(this.jtf_estatura.getTex());
            imc = peso / (estatura * estatura);
            
            if ( peso > 0 && estatura > 0 && estatura <= 3) {
                if (imc < 18.5) {
                    JOptionPane.showMessageDialog(, "Su IMC es: " + imc + " (Peso bajo).");
                }
                
                else if (imc >= 18.5 && imc < 25) {
                    JOptionPane.showMessageDialog(, "Su IMC es: " + imc + " (Peso normal).");
                }
                
                else if (imc >= 25 && imc < 30) {
                    JOptionPane.showMessageDialog(, "Su IMC es: " + imc + " (Sobrepeso).");
                }
                
                else if (imc >= 30) {
                    JOptionPane.showMessageDialog(, "Su IMC es :" + imc + " (Obesidad).");
                }
            }
            else if (estatura > 3) {
                JOptionPane.showMessageDialog(, "Dato invalido. La estatura debe introducirse en metros");
            }
            else {
                JOptionPane.showMessageDialog(, "Introduce unicamente numeros positivos.");
            }
        }
        
        else if (verificacion == false || verificacion2 == false) {
            JOptionPane.showMessageDialog(, "Dato invalido. Introduce solamente numeros");
        }
        
                               
   
  
