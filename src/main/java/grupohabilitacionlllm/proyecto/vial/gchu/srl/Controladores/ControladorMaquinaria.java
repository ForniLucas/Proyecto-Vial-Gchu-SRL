package grupohabilitacionlllm.proyecto.vial.gchu.srl.Controladores;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain.Maquinaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tincho
 */
public class ControladorMaquinaria {

    int id = 1;

    List<Maquinaria> maquinarias = new ArrayList<>();

    public void alta(String cod, String des, String fab, String ubic) {

        Maquinaria maquina = new Maquinaria(id, cod, des, ubic, ubic);

        maquinarias.add(maquina);

        id++;
    }

    public Maquinaria buscar(String cod) {
        Maquinaria encontro = null;

        try {
            for (Maquinaria maq_temp : maquinarias) {
                if (maq_temp.getCodigo().equals(cod)) {
                    encontro = maq_temp;
                }
            }
        } catch (Exception e) {
        }

        return encontro;
    }

    public void bajaLogica(Maquinaria unaMaquina) {
        try {
            for (Maquinaria maq_temp : maquinarias) {
                if (maq_temp.equals(unaMaquina)) {
                    maq_temp.setEstadoBaja();
                }
            }
        } catch (Exception e) {
        }
    }

    public void baja(Maquinaria unaMaquinaria) {
        try {
            maquinarias.remove(unaMaquinaria);
        } catch (Exception e) {
        }

    }

    public Maquinaria buscarId(int id){
        Maquinaria encontro = null;
        
        try {
            for(Maquinaria maq_temp : maquinarias){
                if (maq_temp.getId() == id){
                    encontro = maq_temp;
                }
            }
        } catch (Exception e) {
        }
        
        return encontro;
    }
    
    public void modificar(Maquinaria m) {
        try {
            int index = maquinarias.indexOf(this.buscarId(m.getId()));
            maquinarias.set(index, m);
            
        } catch (Exception e) {
        }
    }
}
