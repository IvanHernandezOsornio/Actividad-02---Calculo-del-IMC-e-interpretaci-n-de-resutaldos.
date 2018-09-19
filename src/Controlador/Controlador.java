
package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    Modelo modelo=new Modelo();
    Vista vista=new Vista();
    
    public Controlador( Vista vista , Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jb_calcular.addActionListener(this);
 
    }

    public void Iniciar() {
        vista.setTitle("Calculadora MVC");
        vista.setLocationRelativeTo(null);
        vista.jtf_peso.setText(String.valueOf(modelo.getPeso()) );
        vista.jtf_estatura.setText(String.valueOf(modelo.getEstatura()) );
        vista.jl_resultado.setText(String.valueOf(modelo.getOperador()) );
     }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       modelo.setPeso((float) Double.parseDouble(vista.jtf_peso.getText())) ;
       modelo.setEstatura((float) Double.parseDouble(vista.jtf_estatura.getText())) ;
       if (e.getSource()== vista.jb_calcular)modelo.setOperador("+");
       vista.jl_resultado.setText(String.valueOf(modelo.operacion()) ) ;
       
    }

   
}
